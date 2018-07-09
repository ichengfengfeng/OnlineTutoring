package com.icff.tutoring.po;

public class Teacher {
    private String teacuuid;
    private String scuuid;
    private double price;

    public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getScuuid() {
		return scuuid;
	}

	public void setScuuid(String scuuid) {
		this.scuuid = scuuid;
	}

	public String getTeacuuid() {
        return teacuuid;
    }

    public void setTeacuuid(String teacuuid) {
        this.teacuuid = teacuuid == null ? null : teacuuid.trim();
    }
}