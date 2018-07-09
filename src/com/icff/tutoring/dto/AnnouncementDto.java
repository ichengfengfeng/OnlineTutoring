package com.icff.tutoring.dto;

import java.util.List;

import com.icff.tutoring.po.Area;
import com.icff.tutoring.po.Tutorialclasstype;

public class AnnouncementDto {
	private String teacuuid ;
	private String uuid;
	private int id = 0;//默认 0
	private String scuuid;
	private String typeid;
	private String realname;
	private int sex = 0;//默认 0
	private String headimg;
	private String scname;
	private double price;
	private double discount;
	private String area_describe;
	private String type_describe;
	private String phone;
	private String email;
	private List<Area> areas;
	private List<Tutorialclasstype> tutors;
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Tutorialclasstype> getTutors() {
		return tutors;
	}
	public void setTutors(List<Tutorialclasstype> tutors) {
		this.tutors = tutors;
	}
	public List<Area> getAreas() {
		return areas;
	}
	public void setAreas(List<Area> areas) {
		this.areas = areas;
	}
	public String getTeacuuid() {
		return teacuuid;
	}
	public void setTeacuuid(String teacuuid) {
		this.teacuuid = teacuuid;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getScuuid() {
		return scuuid;
	}
	public void setScuuid(String scuuid) {
		this.scuuid = scuuid;
	}
	public String getTypeid() {
		return typeid;
	}
	public void setTypeid(String typeid) {
		this.typeid = typeid;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getHeadimg() {
		return headimg;
	}
	public void setHeadimg(String headimg) {
		this.headimg = headimg;
	}
	public String getScname() {
		return scname;
	}
	public void setScname(String scname) {
		this.scname = scname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
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
	
//	private Announcement anno;
//	private Teacher teacher;
//	private User user;
//	private Area area;
//	private Tutorialclasstype tutortype;
	
	

}
