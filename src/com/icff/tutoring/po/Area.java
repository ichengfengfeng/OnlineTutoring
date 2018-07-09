package com.icff.tutoring.po;

import java.util.List;

public class Area {
    private Integer id;

    private Integer areId;

    private String areaDescribe;

    private String yxbz;
    
    private List<Area> allAreas;
    
    private String superAreaDescribe;
    

    public String getSuperAreaDescribe() {
		return superAreaDescribe;
	}

	public void setSuperAreaDescribe(String superAreaDescribe) {
		this.superAreaDescribe = superAreaDescribe;
	}

	public List<Area> getAllAreas() {
		return allAreas;
	}

	public void setAllAreas(List<Area> allAreas) {
		this.allAreas = allAreas;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAreId() {
        return areId;
    }

    public void setAreId(Integer areId) {
        this.areId = areId;
    }

    public String getAreaDescribe() {
        return areaDescribe;
    }

    public void setAreaDescribe(String areaDescribe) {
        this.areaDescribe = areaDescribe == null ? null : areaDescribe.trim();
    }

    public String getYxbz() {
        return yxbz;
    }

    public void setYxbz(String yxbz) {
        this.yxbz = yxbz == null ? null : yxbz.trim();
    }
}