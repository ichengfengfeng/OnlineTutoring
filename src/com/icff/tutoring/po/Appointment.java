package com.icff.tutoring.po;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Appointment {
    private String appointmentid;

    private String annoid;

    private String stuuuid;

    private String teacuuid;

    private String stuannouuid;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date begintime;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date endtime;

    private Double closingcost;

    private String yxbz;

    private Date yytime;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private String state;

    public String getAppointmentid() {
        return appointmentid;
    }

    public void setAppointmentid(String appointmentid) {
        this.appointmentid = appointmentid == null ? null : appointmentid.trim();
    }

    public String getAnnoid() {
        return annoid;
    }

    public void setAnnoid(String annoid) {
        this.annoid = annoid == null ? null : annoid.trim();
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

    public String getStuannouuid() {
        return stuannouuid;
    }

    public void setStuannouuid(String stuannouuid) {
        this.stuannouuid = stuannouuid == null ? null : stuannouuid.trim();
    }

    public Date getBegintime() {
        return begintime;
    }

    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Double getClosingcost() {
        return closingcost;
    }

    public void setClosingcost(Double closingcost) {
        this.closingcost = closingcost;
    }

    public String getYxbz() {
        return yxbz;
    }

    public void setYxbz(String yxbz) {
        this.yxbz = yxbz == null ? null : yxbz.trim();
    }

    public Date getYytime() {
        return yytime;
    }

    public void setYytime(Date yytime) {
        this.yytime = yytime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}