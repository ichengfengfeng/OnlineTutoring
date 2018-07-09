package com.icff.tutoring.po;

public class Student {
    private String stuuuid;

    public String getStuuuid() {
        return stuuuid;
    }

    public void setStuuuid(String stuuuid) {
        this.stuuuid = stuuuid == null ? null : stuuuid.trim();
    }
}