package com.icff.tutoring.mapper;

import com.icff.tutoring.dto.StuAnnouncementDto;
import com.icff.tutoring.po.Stuannouncement;
import com.icff.tutoring.po.StuannouncementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StuannouncementMapper {
    int countByExample(StuannouncementExample example);

    int deleteByExample(StuannouncementExample example);

    int deleteByPrimaryKey(String stuannouuid);

    int insert(Stuannouncement record);

    int insertSelective(Stuannouncement record);

    List<Stuannouncement> selectByExample(StuannouncementExample example);

    Stuannouncement selectByPrimaryKey(String stuannouuid);

    int updateByExampleSelective(@Param("record") Stuannouncement record, @Param("example") StuannouncementExample example);

    int updateByExample(@Param("record") Stuannouncement record, @Param("example") StuannouncementExample example);

    int updateByPrimaryKeySelective(Stuannouncement record);

    int updateByPrimaryKey(Stuannouncement record);
    
    List<StuAnnouncementDto> selectStuAnnoDtoBySADto(@Param("stuAnnouncementDto") StuAnnouncementDto stuAnnouncementDto) throws Exception;
    
    int insertStuAnnouncementDto(Stuannouncement stuAnnouncemnet);
    
    StuAnnouncementDto selectStuAnnoDtoByuuid(@Param("stuannouuid")String stuannouuid);
    
    
}