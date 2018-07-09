package com.icff.tutoring.mapper;

import com.icff.tutoring.po.School;
import com.icff.tutoring.po.SchoolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchoolMapper {
    int countByExample(SchoolExample example);

    int deleteByExample(SchoolExample example);

    int deleteByPrimaryKey(String scuuid);

    int insert(School record);

    int insertSelective(School record);

    List<School> selectByExample(SchoolExample example);

    School selectByPrimaryKey(String scuuid);

    int updateByExampleSelective(@Param("record") School record, @Param("example") SchoolExample example);

    int updateByExample(@Param("record") School record, @Param("example") SchoolExample example);

    int updateByPrimaryKeySelective(School record);

    int updateByPrimaryKey(School record);
    
    List<School> selectSchool();
    
    List<School> selectSchoolByPage(@Param("start")int start,@Param("end")int end);
    
    int selectAllCount();
    
    int deleteSchools(String[] scuuid);
    
}