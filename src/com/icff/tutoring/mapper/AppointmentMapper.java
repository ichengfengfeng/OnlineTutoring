package com.icff.tutoring.mapper;

import com.icff.tutoring.po.Appointment;
import com.icff.tutoring.po.AppointmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppointmentMapper {
    int countByExample(AppointmentExample example);

    int deleteByExample(AppointmentExample example);

    int deleteByPrimaryKey(String appointmentid);

    int insert(Appointment record);

    int insertSelective(Appointment record);

    List<Appointment> selectByExample(AppointmentExample example);

    Appointment selectByPrimaryKey(String appointmentid);

    int updateByExampleSelective(@Param("record") Appointment record, @Param("example") AppointmentExample example);

    int updateByExample(@Param("record") Appointment record, @Param("example") AppointmentExample example);

    int updateByPrimaryKeySelective(Appointment record);
    
    int updateByPrimaryKey(Appointment record);
    
    int updateYXBZByuuid(String appointment);
    
    List<Appointment> selectByAppointment(@Param("record")Appointment record);
    
}