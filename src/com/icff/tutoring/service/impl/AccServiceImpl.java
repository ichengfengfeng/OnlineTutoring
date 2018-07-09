package com.icff.tutoring.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.icff.tutoring.dto.StuAnnouncementDto;
import com.icff.tutoring.dto.AnnouncementDto;
import com.icff.tutoring.dto.AppointmentDto;
import com.icff.tutoring.mapper.AnnouncementMapper;
import com.icff.tutoring.mapper.AppointmentMapper;
import com.icff.tutoring.mapper.StuannouncementMapper;
import com.icff.tutoring.mapper.UserMapper;
import com.icff.tutoring.po.Appointment;
import com.icff.tutoring.po.Area;
import com.icff.tutoring.po.Tutorialclasstype;
import com.icff.tutoring.po.User;
import com.icff.tutoring.service.IAccService;
@Service
@Transactional(readOnly=true)
public class AccServiceImpl implements IAccService{
	@Autowired
	UserMapper usermapper;
	@Autowired
	AppointmentMapper appointMapper;
	@Autowired
	StuannouncementMapper stuannoMapper;
	@Autowired
	AnnouncementMapper annoMapper;

	@Override
	public User queryUserByuuidAndpassword(String uuid, String password) throws Exception {
		if (uuid!=null && !"".equals(uuid)) {
			try {
				User user = usermapper.selectUserByuuidAndpassword(uuid, password);
				return user;
			} catch (Exception e) {
				throw e;
			}
			
		}
		return null;
	}

	@Override
	@Transactional(rollbackFor=Throwable.class)
	public int updateUserByUser(User user) throws Exception {
		if (user != null) {
			try {
				user.setYxbz("Y");
				return usermapper.updateByPrimaryKeySelective(user);
			} catch (Exception e) {
				
				throw e;
			}
			
		}
		return 0;
	}

	@Override
	@Transactional(rollbackFor=Throwable.class)
	public List<AppointmentDto> confirmAppointInfo(Appointment appointment) throws Exception {
		appointment.setYxbz("Y");
		List<Appointment> appointments = appointMapper.selectByAppointment(appointment);
		List<AppointmentDto> appointdtos = new ArrayList<>();
		appointments.forEach(appoint->{
			AppointmentDto appointdto = new AppointmentDto();
			StuAnnouncementDto stoannoDto = stuannoMapper.selectStuAnnoDtoByuuid(appoint.getStuannouuid());
			appointdto.setAppointment(appoint);
			appointdto.setStuDto(stoannoDto);
			appointdtos.add(appointdto);
		});
		
		return appointdtos;
	}

	@Override
	@Transactional(rollbackFor=Throwable.class)
	public int updateAppointment(Appointment appointment) throws Exception {
		return appointMapper.updateByPrimaryKeySelective(appointment);
	}

	@Override
	/**
	 * 修改用户信息未使用返回user对象
	 */
	@Transactional(rollbackFor=Throwable.class)
	public User updateUserInfo(User record) throws Exception {
		if(record != null) {
			record.setYxbz("Y");
			usermapper.updateByPrimaryKeySelective(record);
		}
		
		return usermapper.selectByPrimaryKey(record.getUuid());
	}
	/**
	 * 根据techuuid查出并拼接公告信息
	 * @param teacuuid
	 * @return
	 */
	public AnnouncementDto selectAnnoDtoByTeacuuid(String teacuuid) {
		List<AnnouncementDto> announs = annoMapper.selectDtoByteacuuid(teacuuid);
		AnnouncementDto newannoun = new AnnouncementDto();
		newannoun.setTeacuuid(teacuuid);
		List<Area> areas = new ArrayList<>();
		List<Tutorialclasstype> tutors = new ArrayList<>();
		Iterator<AnnouncementDto> it = announs.iterator();
		while(it.hasNext()) {
			AnnouncementDto m = it.next();
			newannoun.setHeadimg(m.getHeadimg());
			newannoun.setPrice(m.getPrice());
			newannoun.setRealname(m.getRealname());
			newannoun.setSex(m.getSex());
			newannoun.setScname(m.getScname());
			newannoun.setDiscount(m.getDiscount());
			newannoun.setPhone(m.getPhone());
			newannoun.setEmail(m.getEmail());
			Area area = new Area();
			area.setId(m.getId());
			area.setAreaDescribe(m.getArea_describe());
			areas.add(area);
			newannoun.setAreas(areas);
			Tutorialclasstype  tutor = new Tutorialclasstype();
			tutor.setTypeid(m.getTypeid());
			tutor.setTypeDescribe(m.getType_describe());
			tutors.add(tutor);
			newannoun.setTutors(tutors);
		}
		return newannoun;
		}

	@Override
	public List<AppointmentDto> confirmstuAppointInfo(Appointment appointment) throws Exception {
		appointment.setYxbz("Y");
		List<Appointment> appointments = appointMapper.selectByAppointment(appointment);
		List<AppointmentDto> appointdtos = new ArrayList<>();
		appointments.forEach(appoint->{
			AppointmentDto appointdto = new AppointmentDto();
			AnnouncementDto annoDto = selectAnnoDtoByTeacuuid(appoint.getTeacuuid());
			appointdto.setAppointment(appoint);
			appointdto.setAnnoDto(annoDto);
			appointdtos.add(appointdto);
		});
		return appointdtos;
	}
	

}
