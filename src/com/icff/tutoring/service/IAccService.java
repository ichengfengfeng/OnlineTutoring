package com.icff.tutoring.service;

import java.util.List;

import com.icff.tutoring.dto.AnnouncementDto;
import com.icff.tutoring.dto.AppointmentDto;
import com.icff.tutoring.po.Appointment;
import com.icff.tutoring.po.User;

/**
 * 账户设置服务接口
 * @author iCff
 *
 */
public interface IAccService {
	/**
	 * 通过uuid主键和密码获得USER对象
	 * @param uuid
	 * @param password
	 * @return
	 * @throws Exception
	 */
	User queryUserByuuidAndpassword(String uuid,String password)throws Exception;
	/**
	 * 修改user的任何字段（形参不为null的属性字段）通过user对象
	 * @param user
	 * @return
	 * @throws Exception
	 */
	int updateUserByUser(User user) throws Exception;
	
	List<AppointmentDto> confirmAppointInfo(Appointment appointment)throws Exception;
	
	int updateAppointment(Appointment appointment)throws Exception;
	
	User updateUserInfo(User record)throws Exception;
	
	List<AppointmentDto> confirmstuAppointInfo(Appointment appointment)throws Exception;
	
	AnnouncementDto selectAnnoDtoByTeacuuid(String teacuuid);

}
