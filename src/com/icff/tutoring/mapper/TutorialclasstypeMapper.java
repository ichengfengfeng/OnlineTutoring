package com.icff.tutoring.mapper;

import com.icff.tutoring.po.Tutorialclasstype;
import com.icff.tutoring.po.TutorialclasstypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TutorialclasstypeMapper {
    int countByExample(TutorialclasstypeExample example);

    int deleteByExample(TutorialclasstypeExample example);

    int deleteByPrimaryKey(String typeid);

    int insert(Tutorialclasstype record);

    int insertSelective(Tutorialclasstype record);

    List<Tutorialclasstype> selectByExample(TutorialclasstypeExample example);

    Tutorialclasstype selectByPrimaryKey(String typeid);

    int updateByExampleSelective(@Param("record") Tutorialclasstype record, @Param("example") TutorialclasstypeExample example);

    int updateByExample(@Param("record") Tutorialclasstype record, @Param("example") TutorialclasstypeExample example);

    int updateByPrimaryKeySelective(Tutorialclasstype record);

    int updateByPrimaryKey(Tutorialclasstype record);
    
    List<Tutorialclasstype> selectTutorialclasstype();
    
    List<Tutorialclasstype> selectSuperTutorialclasstype();
    
    List<Tutorialclasstype> selectLowerTutorialclasstype(@Param("typeid")String typeid);

    int selectAllCount();
    
    List<Tutorialclasstype> selectTutorialclasstypeByleftjoin(@Param("start")int start,@Param("end")int end);
    
    int deleteByByPrimaryKeys(String[] typeid);
}