package com.icff.tutoring.po;

public class Manager {
    private String adminuuid;

    public String getAdminuuid() {
        return adminuuid;
    }

    public void setAdminuuid(String adminuuid) {
        this.adminuuid = adminuuid == null ? null : adminuuid.trim();
    }
}