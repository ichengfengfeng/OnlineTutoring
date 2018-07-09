package com.icff.tutoring.service;

import java.util.List;

import com.icff.tutoring.dto.Page;
import com.icff.tutoring.po.Area;
import com.icff.tutoring.po.Grade;
import com.icff.tutoring.po.School;
import com.icff.tutoring.po.Tutorialclasstype;

public interface IBaseManagerServiec {
	/**
	 * 查询可授课类型表的记录数
	 * @return
	 * @throws Exception
	 */
	int queryCountTutorType() throws Exception;
	/**
	 * 分页查询可授课记录
	 * @param page
	 * @return
	 * @throws Exception
	 */
	List<Tutorialclasstype> getAllTutorClassType(Page page) throws Exception;
	/**
	 * 一条插入可授课类型
	 * @param recod
	 * @return
	 * @throws Exception
	 */
	
	int insertTutorClassType(Tutorialclasstype recod)throws Exception;
	/**
	 * 删除多条记录  逻辑删除
	 * @param recods
	 * @return
	 * @throws Exception
	 */
	int deleteTutorClassTypes(String[] recods)throws Exception;
	
	/**
	 * 分页查询学员所在年级记录
	 * @param page
	 * @return
	 * @throws Exception
	 */
	List<Grade> getAllGrade(Page page)throws Exception;
	
	int queryCountGrade() throws Exception;
	
	/**
	 * 删除多条记录  逻辑删除
	 * @param recods
	 * @return
	 * @throws Exception
	 */
	int deleteGrades(int[] recods)throws Exception;
	
	public int insertGrade(Grade record)throws Exception;
	
	int queryCountArea() throws Exception;
	
	List<Area> getAllArea(Page page) throws Exception;
	/**
	 * 删除多条记录  逻辑删除
	 * @param recods
	 * @return
	 * @throws Exception
	 */
	int deleteAreas(int[] recods)throws Exception;
	
	int insertArea(Area area) throws Exception;
	
	int queryCountSchool() throws Exception;
	
	List<School> getSchool(Page page) throws Exception;
	
	int deleteSchool(String[] recods)throws Exception;
	
	int insertSchool(School school) throws Exception;

}
