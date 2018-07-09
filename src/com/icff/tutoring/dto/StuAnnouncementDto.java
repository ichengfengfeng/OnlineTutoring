package com.icff.tutoring.dto;

import java.util.Date;

public class StuAnnouncementDto {
	private String realname;
	private String phone;
	private String address;
	private int usersex;
	private String stuuuid;
	private String stuannouuid;
	private int id;
	private String typeid;
	private int are_id;
	private String other_desc;
	private int sex;
	private Date pubdate;
	private String area_describe;
	private String type_describe;
	private String gradename;
	private int rank;
	
	public int getUsersex() {
		return usersex;
	}
	public void setUsersex(int usersex) {
		this.usersex = usersex;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStuuuid() {
		return stuuuid;
	}
	public void setStuuuid(String stuuuid) {
		this.stuuuid = stuuuid;
	}
	public String getStuannouuid() {
		return stuannouuid;
	}
	public void setStuannouuid(String stuannouuid) {
		this.stuannouuid = stuannouuid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTypeid() {
		return typeid;
	}
	public void setTypeid(String typeid) {
		this.typeid = typeid;
	}
	public int getAre_id() {
		return are_id;
	}
	public void setAre_id(int are_id) {
		this.are_id = are_id;
	}
	public String getOther_desc() {
		return other_desc;
	}
	public void setOther_desc(String other_desc) {
		this.other_desc = other_desc;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public Date getPubdate() {
		return pubdate;
	}
	public void setPubdate(Date pubdate) {
		this.pubdate = pubdate;
	}
	public String getArea_describe() {
		return area_describe;
	}
	public void setArea_describe(String area_describe) {
		this.area_describe = area_describe;
	}
	public String getType_describe() {
		return type_describe;
	}
	public void setType_describe(String type_describe) {
		this.type_describe = type_describe;
	}
	public String getGradename() {
		return gradename;
	}
	public void setGradename(String gradename) {
		this.gradename = gradename;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	

}
