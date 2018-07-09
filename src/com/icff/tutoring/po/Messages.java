package com.icff.tutoring.po;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Messages {
    private String lyid;

    private String stuuuid;

    private String teacuuid;

    private String description;

    private String yxbz;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lydatetime;
    
     

	public Date getLydatetime() {
		return lydatetime;
	}

	public void setLydatetime(Date lydatetime) {
		this.lydatetime = lydatetime;
	}

	public String getLyid() {
        return lyid;
    }

    public void setLyid(String lyid) {
        this.lyid = lyid == null ? null : lyid.trim();
    }

    public String getStuuuid() {
        return stuuuid;
    }

    public void setStuuuid(String stuuuid) {
        this.stuuuid = stuuuid == null ? null : stuuuid.trim();
    }

    public String getTeacuuid() {
        return teacuuid;
    }

    public void setTeacuuid(String teacuuid) {
        this.teacuuid = teacuuid == null ? null : teacuuid.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getYxbz() {
        return yxbz;
    }

    public void setYxbz(String yxbz) {
        this.yxbz = yxbz == null ? null : yxbz.trim();
    }
}