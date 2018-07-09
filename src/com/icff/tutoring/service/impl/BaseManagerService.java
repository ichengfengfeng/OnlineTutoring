package com.icff.tutoring.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.icff.tutoring.dto.Page;
import com.icff.tutoring.mapper.AreaMapper;
import com.icff.tutoring.mapper.GradeMapper;
import com.icff.tutoring.mapper.SchoolMapper;
import com.icff.tutoring.mapper.TutorialclasstypeMapper;
import com.icff.tutoring.po.Area;
import com.icff.tutoring.po.Grade;
import com.icff.tutoring.po.School;
import com.icff.tutoring.po.Tutorialclasstype;
import com.icff.tutoring.service.IBaseManagerServiec;
@Service("baseManagerService")
@Transactional(readOnly=true)
public class BaseManagerService implements IBaseManagerServiec{
	@Autowired
	TutorialclasstypeMapper tutorMapper;
	@Autowired
	GradeMapper gradeMapper;
	@Autowired
	AreaMapper areaMapper;
	@Autowired
	SchoolMapper schoolMapper;
	@Override
	public int queryCountTutorType() throws Exception {
		return tutorMapper.selectAllCount();
	}
	@Override
	public List<Tutorialclasstype> getAllTutorClassType(Page page) throws Exception {
		return tutorMapper.selectTutorialclasstypeByleftjoin(page.getStart(), page.getEnd());
	}
	@Override
	@Transactional(rollbackFor=Throwable.class)
	public int insertTutorClassType(Tutorialclasstype recod) throws Exception {
		recod.setTypeid(UUID.randomUUID().toString().replaceAll("-", ""));
		recod.setYxbz("Y");
		return tutorMapper.insertSelective(recod);
	}
	@Override
	@Transactional(rollbackFor=Throwable.class)
	public int deleteTutorClassTypes(String[] recods) throws Exception {
		return tutorMapper.deleteByByPrimaryKeys(recods);
	}
	@Override
	public List<Grade> getAllGrade(Page page) throws Exception {
		return gradeMapper.selectAllGradeByPage(page.getStart(), page.getEnd());
	}
	@Override
	public int queryCountGrade() throws Exception {
		return gradeMapper.selectAllCount();
	}
	@Override
	@Transactional(rollbackFor=Throwable.class)
	public int deleteGrades(int[] recods) throws Exception {
		return gradeMapper.deleteGrades(recods);
	}
	@Transactional(rollbackFor=Throwable.class)
	public int insertGrade(Grade record) throws Exception {
		record.setYxbz("Y");
		return gradeMapper.insertGradeAutoid(record);
	}
	@Override
	public int queryCountArea() throws Exception {
		return areaMapper.selectAllCount();
	}
	@Override
	public List<Area> getAllArea(Page page) throws Exception {
	
		return areaMapper.selectAreaByleftjoin(page.getStart(),page.getEnd());
	}
	@Transactional(rollbackFor=Throwable.class)
	public int deleteAreas(int[] recods) throws Exception {
		return areaMapper.deleteByByPrimaryKeys(recods);
	}
	@Transactional(rollbackFor=Throwable.class)
	public int insertArea(Area area) throws Exception {
		area.setYxbz("Y");
		return areaMapper.insertAreaAutoid(area);
	}
	@Override
	public List<School> getSchool(Page page) throws Exception {
		return schoolMapper.selectSchoolByPage(page.getStart(), page.getEnd());
	}
	@Override
	public int queryCountSchool() throws Exception {
		return schoolMapper.selectAllCount();
	}
	@Override
	@Transactional(rollbackFor=Throwable.class)
	public int deleteSchool(String[] recods) throws Exception {
		return schoolMapper.deleteSchools(recods);
	}
	@Override
	@Transactional(rollbackFor=Throwable.class)
	public int insertSchool(School school) throws Exception {
		school.setScuuid(UUID.randomUUID().toString());
		school.setYxbz("Y");
		return schoolMapper.insertSelective(school);
	}

}
