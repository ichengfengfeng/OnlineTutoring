package com.icff.tutoring.dto;

import com.icff.tutoring.po.Appointment;

public class AppointmentDto {
	private StuAnnouncementDto stuDto;
	private Appointment appointment;
	private AnnouncementDto  annoDto;
	
	public AnnouncementDto getAnnoDto() {
		return annoDto;
	}
	public void setAnnoDto(AnnouncementDto annoDto) {
		this.annoDto = annoDto;
	}
	public StuAnnouncementDto getStuDto() {
		return stuDto;
	}
	public void setStuDto(StuAnnouncementDto stuDto) {
		this.stuDto = stuDto;
	}
	public Appointment getAppointment() {
		return appointment;
	}
	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}
}
