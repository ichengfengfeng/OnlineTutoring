package com.icff.tutoring.dto;

import java.util.Date;

public class MessagesDto {
	 private String realname;
	 private String headimg;
	 private String stuuuid;
	 private int   sex;
	 private String description;
	 private Date lydatetime;
	 private String lyid;
	 private String teacuuid;
	 private String yxbz;
	 
	public String getYxbz() {
		return yxbz;
	}
	public void setYxbz(String yxbz) {
		this.yxbz = yxbz;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getHeadimg() {
		return headimg;
	}
	public void setHeadimg(String headimg) {
		this.headimg = headimg;
	}

	public String getStuuuid() {
		return stuuuid;
	}
	public void setStuuuid(String stuuuid) {
		this.stuuuid = stuuuid;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
    
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
		this.lyid = lyid;
	}
	public String getTeacuuid() {
		return teacuuid;
	}
	public void setTeacuuid(String teacuuid) {
		this.teacuuid = teacuuid;
	}
	 
	 

}
