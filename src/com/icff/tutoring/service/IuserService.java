package com.icff.tutoring.service;

import java.util.List;

import com.icff.tutoring.dto.AnnouncementDto;
import com.icff.tutoring.dto.MessagesDto;
import com.icff.tutoring.dto.StuAnnouncementDto;
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

public interface IuserService {
	/**
	 * 注册用户并返回生成的uuid
	 * @param user
	 * @return   uuid
	 * @throws Exception
	 */
	String register(User user,String role) throws Exception;
	/**
	 * 检查账号是否已经存在
	 * @param username
	 * @return
	 * @throws Exception
	 */
	User checkAccount(String username) throws Exception;
	
	User getUserByUnameAndPass(String username,String password) throws Exception;
	
	List<AnnouncementDto> getAnnouncementDtobyAnnouncementDto(AnnouncementDto annoDto) throws Exception;
	/**
	 * 获得全部一级区域
	 * @return
	 * @throws Exception
	 */
	List<Area> getSuperArea()throws Exception; 
	/**
	 * 获得下级区域
	 * @param id
	 * @return
	 * @throws Exception
	 */
	List<Area> getLowerArea(int id) throws Exception;
	/**
	 * 根据id获得上级区域
	 * @param id
	 * @return
	 * @throws Exception
	 */
	List<Area> getSuperAreaByid(int id) throws Exception;
	/**
	 * 通过上级id获得所属下级的对象
	 * @param id
	 * @return
	 * @throws Exception
	 */
	
	List<Area> getLowerAreaBySuperid(int id) throws Exception;
	/**
	 * 获得高校
	 * @return
	 * @throws Exception
	 */
	List<School> getAllSchool() throws Exception;
	/**
	 * 获得家教科目分类
	 * @return
	 * @throws Exception
	 */
	List<Tutorialclasstype> getAllTutorialclasstypes()throws Exception;
	
	List<Tutorialclasstype> getAllSuperTutorialclasstypes()throws Exception;
	
	List<Tutorialclasstype> getLowerTutorialclasstypes(String typeid)throws Exception;
	
	boolean workAsTutor(List<Announcement> announcements,Teacher teacher) throws Exception;
    
	List<AnnouncementDto> searchAnnounByAnnounDto(AnnouncementDto AnnounDto)throws Exception;
    
	List<StuAnnouncementDto> serchStuAnnounByStuAnnounDto(StuAnnouncementDto stuannoDto)throws Exception;

    List<Grade> getAllGrade() throws Exception;
    
    int insertStuAnnouncement(Stuannouncement record)throws Exception;
    /**
     * 查询是否存在，如不存在，则插入该实体
     * @param record
     * @return
     */
    Student queryAndInsert(Student record);
    /**
     * 教员预约学员
     * @param appointment
     * @return
     * @throws Exception
     */
    int insertAppointment(Appointment appointment)throws Exception;
    /**
     * 检查是否是教员
     * @param teacuuid
     * @return
     * @throws Exception
     */
    boolean checkISTeacher(String teacuuid)throws Exception;
    
    /**
     * 检查是否是学员
     * @param stuuid
     * @return true 是学员 false 非学员
     * @throws Exception
     */
    boolean checkISStudent(String stuuid) throws Exception;
    /**
     * 按条件查询留言信息
     * @param message
     * @return
     * @throws Exception
     */
    List<MessagesDto> queryMessages(MessagesDto message) throws Exception;
    /**
     * 插入留言记录
     * @param message
     * @return
     * @throws Exception
     */
    int insertMessage(Messages message) throws Exception;
    
    boolean checkISadmin(String adminuuid) throws  Exception;
}
