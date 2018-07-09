package com.icff.tutoring.mapper;

import com.icff.tutoring.po.Teacher;
import com.icff.tutoring.po.TeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {
    int countByExample(TeacherExample example);

    int deleteByExample(TeacherExample example);

    int deleteByPrimaryKey(String teacuuid);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    List<Teacher> selectByExample(TeacherExample example);

    int updateByExampleSelective(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByExample(@Param("record") Teacher record, @Param("example") TeacherExample example);

    Teacher selectByuuid(@Param("teacuuid")String teacuuid);
    
    int updateByTeacher(@Param("teacher")Teacher teacher);
}