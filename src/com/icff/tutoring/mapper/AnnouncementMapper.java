package com.icff.tutoring.mapper;

import com.icff.tutoring.dto.AnnouncementDto;
import com.icff.tutoring.po.Announcement;
import com.icff.tutoring.po.AnnouncementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnnouncementMapper {
    int countByExample(AnnouncementExample example);

    int deleteByExample(AnnouncementExample example);

    int deleteByPrimaryKey(String annoid);

    int insert(Announcement record);

    int insertSelective(Announcement record);

    List<Announcement> selectByExample(AnnouncementExample example);

    Announcement selectByPrimaryKey(String annoid);

    int updateByExampleSelective(@Param("record") Announcement record, @Param("example") AnnouncementExample example);

    int updateByExample(@Param("record") Announcement record, @Param("example") AnnouncementExample example);

    int updateByPrimaryKeySelective(Announcement record);

    int updateByPrimaryKey(Announcement record);
    
    List<AnnouncementDto> selectByAnnoDto(AnnouncementDto announcementdto);
    
    int insertAnnouncementByList(@Param("announcements")List<Announcement> announcements);

    List<String> selectTeacuuidByAnnoDto(AnnouncementDto announcementdto);
    
    List<AnnouncementDto> selectDtoByteacuuid(@Param("teacuuid")String teacuuid);
}