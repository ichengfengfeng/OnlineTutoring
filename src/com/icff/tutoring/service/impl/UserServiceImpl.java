package com.icff.tutoring.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.icff.tutoring.constant.AppointmentState;
import com.icff.tutoring.constant.Role;
import com.icff.tutoring.dto.AnnouncementDto;
import com.icff.tutoring.dto.MessagesDto;
import com.icff.tutoring.dto.StuAnnouncementDto;
import com.icff.tutoring.mapper.AnnouncementMapper;
import com.icff.tutoring.mapper.AppointmentMapper;
import com.icff.tutoring.mapper.AreaMapper;
import com.icff.tutoring.mapper.GradeMapper;
import com.icff.tutoring.mapper.ManagerMapper;
import com.icff.tutoring.mapper.MessagesMapper;
import com.icff.tutoring.mapper.SchoolMapper;
import com.icff.tutoring.mapper.StuannouncementMapper;
import com.icff.tutoring.mapper.StudentMapper;
import com.icff.tutoring.mapper.TeacherMapper;
import com.icff.tutoring.mapper.TutorialclasstypeMapper;
import com.icff.tutoring.mapper.UserMapper;
import com.icff.tutoring.po.Announcement;
import com.icff.tutoring.po.Appointment;
import com.icff.tutoring.po.Area;
import com.icff.tutoring.po.Grade;
import com.icff.tutoring.po.Messages;
import com.icff.tutoring.po.School;
import com.icff.tutoring.po.Stuannouncement;
import com.icff.tutoring.po.Student;
import com.icff.tutoring.po.Teacher;
import com.icff.tutoring.po.Tutorialclasstype;
import com.icff.tutoring.po.User;
import com.icff.tutoring.service.IuserService;
import com.icff.tutoring.util.UUIDutil;
@Service("userService")
@Transactional(readOnly=true)
public class UserServiceImpl implements IuserService{
	@Autowired
	UserMapper usermapper;
	@Autowired
	StudentMapper studentMapper;
	@Autowired
	TeacherMapper teacherMapper;
	@Autowired
	AnnouncementMapper annoMapper;
	@Autowired
	SchoolMapper schoolMapper;
	@Autowired
	TutorialclasstypeMapper tutorMapper;
	@Autowired
	AreaMapper areaMapper;
	@Autowired
	StuannouncementMapper stuannoMapper;
	@Autowired
	GradeMapper gradeMapper;
	@Autowired
	AppointmentMapper appoMapper;
	@Autowired
	MessagesMapper messageMapper;
	@Autowired
	ManagerMapper managerMapper;

	@Override
	@Transactional(rollbackFor=Throwable.class)
	public String register(User user,String role) throws Exception {
		final String uuid = UUID.randomUUID().toString();
		user.setUuid(uuid);
		user.setYxbz("Y");
			usermapper.insertSelective(user);
			if (Role.SUTDENT.toString().equals(role)) {
				final Student stu = new Student();
				stu.setStuuuid(uuid);
				studentMapper.insertSelective(stu);
			} else if (Role.TEACHER.toString().equals(role)) {
				final Teacher teac = new Teacher();
				teac.setTeacuuid(uuid);
				teacherMapper.insertSelective(teac);
			}
		
		return uuid;
	}

	@Override
	public User checkAccount(String username) throws Exception {
		User user = null;
		if(username !=null && !"".equals(username)) {
			try {
				user = usermapper.selectByUserName(username);
			} catch (Exception e) {
				throw e;
			}
		}
		return user;
	}

	@Override
	public User getUserByUnameAndPass(String username, String password) throws Exception {
		User user = null;
		if(username != null &&  password != null &&
				!"".equals(username) && !"".equals(password)) {
			try {
				user = usermapper.selectByUnameAndPassword(username, password);
			} catch (Exception e) {
				throw e;
			}
		}
		return user;
	}

	@Override
	public List<AnnouncementDto> getAnnouncementDtobyAnnouncementDto(AnnouncementDto annoDto) throws Exception {
		if(annoDto != null ) {
			try {
				List<AnnouncementDto> annoDtos = annoMapper.selectByAnnoDto(annoDto);
				return annoDtos;
			} catch (Exception e) {
				throw e;
			}
			
		}
		return new ArrayList<>();
	}

	@Override
	public List<Area> getSuperArea() throws Exception {
		
		return areaMapper.selectSuperArea();
	}

	@Override
	public List<Area> getLowerArea(int id) throws Exception {
		if(id==0)
			return new ArrayList<>();
		return areaMapper.selectLowerArea(id);
	}

	@Override
	public List<School> getAllSchool() throws Exception {
		return schoolMapper.selectSchool();
	}

	@Override
	public List<Tutorialclasstype> getAllTutorialclasstypes() throws Exception {
		return tutorMapper.selectTutorialclasstype();
	}

	@Override
	public List<Area> getSuperAreaByid(int id) throws Exception {
		return areaMapper.selectSuperAreaByid(id);
	}

	@Override
	public List<Area> getLowerAreaBySuperid(int id) throws Exception {
		return areaMapper.selectAllLowerArea(id);
	}

	@Override
	public List<Tutorialclasstype> getAllSuperTutorialclasstypes() throws Exception {
		return tutorMapper.selectSuperTutorialclasstype();
	}

	@Override
	public List<Tutorialclasstype> getLowerTutorialclasstypes(String typeid) throws Exception {
		// TODO Auto-generated method stub
		return tutorMapper.selectLowerTutorialclasstype(typeid);
	}

	@Override
	@Transactional(rollbackFor=Throwable.class,readOnly=false)
	public boolean workAsTutor(List<Announcement> announcements,Teacher teacher) throws Exception {
		Teacher registedTeacher = teacherMapper.selectByuuid(teacher.getTeacuuid());
		int count = 0;
		if (registedTeacher != null) {
			count += teacherMapper.updateByTeacher(teacher);
		}else {
			count +=teacherMapper.insertSelective(teacher);
		}
		count += annoMapper.insertAnnouncementByList(announcements);
		return count > 0;
	}

	@Override
	public List<AnnouncementDto> searchAnnounByAnnounDto(AnnouncementDto announDto) throws Exception {
		if(announDto != null ) {
			try {
				List<String> teacuuids = annoMapper.selectTeacuuidByAnnoDto(announDto);
				List<AnnouncementDto> newannouns = new ArrayList<>();
				teacuuids.forEach(n ->{
					List<AnnouncementDto> announs = annoMapper.selectDtoByteacuuid(n);
					AnnouncementDto newannoun = new AnnouncementDto();
					newannoun.setTeacuuid(n);
					List<Area> areas = new ArrayList<>();
					List<Tutorialclasstype> tutors = new ArrayList<>();
					announs.forEach(m ->{
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
						Tutorialclasstype  tutor = new Tutorialclasstype();
						tutor.setTypeid(m.getTypeid());
						tutor.setTypeDescribe(m.getType_describe());
						tutors.add(tutor);
					});
					newannoun.setAreas(areas);
					newannoun.setTutors(tutors);
					newannouns.add(newannoun);
				});
				return newannouns;
			} catch (Exception e) {
				throw e;
			}
			
		}
		return new ArrayList<>();
	}

	@Override
	public List<StuAnnouncementDto> serchStuAnnounByStuAnnounDto(StuAnnouncementDto stuannoDto) throws Exception {
		if(stuannoDto != null)
		    return stuannoMapper.selectStuAnnoDtoBySADto(stuannoDto);
		else
			return new ArrayList<>();
	}

	@Override
	public List<Grade> getAllGrade() throws Exception {
		return gradeMapper.selectAllGrade();
	}

	@Override
	@Transactional(rollbackFor=Throwable.class)
	public int insertStuAnnouncement(Stuannouncement record) throws Exception {
		if(record != null) {
			record.setStuannouuid(UUIDutil.uuidStuAnno());
			record.setYxbz("Y");
			record.setPubdate(new Date());
			return stuannoMapper.insertSelective(record);
		}
		return 0;
	}

	@Override
	@Transactional(rollbackFor=Throwable.class)
	public Student queryAndInsert(Student record) {
		Student stu = studentMapper.selectStuByStudent(record);
		int num = 0;
		if (stu == null )
			num = studentMapper.insertSelective(record);
		if (num>0)
			return stu;
		else 
		return null;
	}

	@Override
	@Transactional(rollbackFor=Throwable.class)
	public int insertAppointment(Appointment appointment) throws Exception {
		appointment.setAppointmentid(UUIDutil.getId());
		appointment.setYxbz("Y");
		appointment.setYytime(new Date());
		appointment.setState(AppointmentState.TO_BE_CONFIRM);
		return appoMapper.insertSelective(appointment);
	}

	@Override
	public boolean checkISTeacher(String teacuuid) throws Exception {
		return teacherMapper.selectByuuid(teacuuid)!=null;
	}

	@Override
	public List<MessagesDto> queryMessages(MessagesDto message) throws Exception {
		return messageMapper.selectMessagesSelective(message);
	}

	@Override
	@Transactional(rollbackFor=Throwable.class)
	public int insertMessage(Messages message) throws Exception {
		message.setLyid(UUIDutil.getId());
		message.setYxbz("Y");
		message.setLydatetime(new Date());
		return messageMapper.insertSelective(message);
	}

	@Override
	public boolean checkISStudent(String stuuuid) throws Exception {
		Student student = new Student();
		student.setStuuuid(stuuuid);
		return studentMapper.selectStuByStudent(student) != null;
	}

	@Override
	public boolean checkISadmin(String adminuuid) throws Exception {
		return managerMapper.selectManagerByPrimaryKey(adminuuid)!=null;
	}
	

}
