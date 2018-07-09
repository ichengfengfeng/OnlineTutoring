package com.icff.tutoring.mapper;

import com.icff.tutoring.po.Area;
import com.icff.tutoring.po.AreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AreaMapper {
    int countByExample(AreaExample example);

    int deleteByExample(AreaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Area record);

    int insertSelective(Area record);

    List<Area> selectByExample(AreaExample example);

    Area selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Area record, @Param("example") AreaExample example);

    int updateByExample(@Param("record") Area record, @Param("example") AreaExample example);

    int updateByPrimaryKeySelective(Area record);

    int updateByPrimaryKey(Area record);
    
    List<Area> selectSuperArea();
    
    List<Area> selectLowerArea(@Param("id")int id);
    
    List<Area> selectSuperAreaByid(@Param("id")int id);
    
    List<Area> selectAllLowerArea(@Param("id")int id);
    
    int selectAllCount();
    
    List<Area> selectAreaByleftjoin(@Param("start")int start,@Param("end")int end);
    
    int deleteByByPrimaryKeys(int[] typeid);
    
    int insertAreaAutoid(Area record);
}