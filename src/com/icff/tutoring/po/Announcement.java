package com.icff.tutoring.po;

public class Announcement {
    private String annoid;

    private String uuid;
    
    private int id;

	private String typeid;

    private String title;

    private String description;

    private Double discount;

    private String yxbz;
    
    public int getId() {
  		return id;
  	}

  	public void setId(int id) {
  		this.id = id;
  	}

    public String getAnnoid() {
        return annoid;
    }

    public void setAnnoid(String annoid) {
        this.annoid = annoid == null ? null : annoid.trim();
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getTypeid() {
        return typeid;
    }

    public void setTypeid(String typeid) {
        this.typeid = typeid == null ? null : typeid.trim();
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public String getYxbz() {
        return yxbz;
    }

    public void setYxbz(String yxbz) {
        this.yxbz = yxbz == null ? null : yxbz.trim();
    }
}