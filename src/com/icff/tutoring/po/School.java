package com.icff.tutoring.po;

public class School {
    private String scuuid;

    private String scname;

    private String scdesc;
    
    private String num;
    
    private String yxbz;

    public String getYxbz() {
		return yxbz;
	}

	public void setYxbz(String yxbz) {
		this.yxbz = yxbz;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getScuuid() {
        return scuuid;
    }

    public void setScuuid(String scuuid) {
        this.scuuid = scuuid == null ? null : scuuid.trim();
    }

    public String getScname() {
        return scname;
    }

    public void setScname(String scname) {
        this.scname = scname == null ? null : scname.trim();
    }

    public String getScdesc() {
        return scdesc;
    }

    public void setScdesc(String scdesc) {
        this.scdesc = scdesc == null ? null : scdesc.trim();
    }
}