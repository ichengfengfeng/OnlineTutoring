package com.icff.tutoring.mapper;

import com.icff.tutoring.po.Grade;
import com.icff.tutoring.po.GradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GradeMapper {
    int countByExample(GradeExample example);

    int deleteByExample(GradeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Grade record);

    int insertSelective(Grade record);

    List<Grade> selectByExample(GradeExample example);

    Grade selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Grade record, @Param("example") GradeExample example);

    int updateByExample(@Param("record") Grade record, @Param("example") GradeExample example);

    int updateByPrimaryKeySelective(Grade record);

    int updateByPrimaryKey(Grade record);
    
    List<Grade> selectAllGrade();
    
    List<Grade> selectAllGradeByPage(@Param("start")int start,@Param("end")int end);
    
    int selectAllCount();
    
    int deleteGrades(int[] id);
    
    int insertGradeAutoid(Grade record);
}