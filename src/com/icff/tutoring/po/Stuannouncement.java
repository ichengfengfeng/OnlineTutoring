package com.icff.tutoring.po;

import java.util.Date;

public class Stuannouncement {
    private String stuannouuid;

    private Integer id;

    private String typeid;

    private String stuuuid;

    private Integer areId;

    private String otherDesc;

    private Integer sex;

    private String yxbz;

    private Date pubdate;

    public String getStuannouuid() {
        return stuannouuid;
    }

    public void setStuannouuid(String stuannouuid) {
        this.stuannouuid = stuannouuid == null ? null : stuannouuid.trim();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeid() {
        return typeid;
    }

    public void setTypeid(String typeid) {
        this.typeid = typeid == null ? null : typeid.trim();
    }

    public String getStuuuid() {
        return stuuuid;
    }

    public void setStuuuid(String stuuuid) {
        this.stuuuid = stuuuid == null ? null : stuuuid.trim();
    }

    public Integer getAreId() {
        return areId;
    }

    public void setAreId(Integer areId) {
        this.areId = areId;
    }

    public String getOtherDesc() {
        return otherDesc;
    }

    public void setOtherDesc(String otherDesc) {
        this.otherDesc = otherDesc == null ? null : otherDesc.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getYxbz() {
        return yxbz;
    }

    public void setYxbz(String yxbz) {
        this.yxbz = yxbz == null ? null : yxbz.trim();
    }

    public Date getPubdate() {
        return pubdate;
    }

    public void setPubdate(Date pubdate) {
        this.pubdate = pubdate;
    }
}