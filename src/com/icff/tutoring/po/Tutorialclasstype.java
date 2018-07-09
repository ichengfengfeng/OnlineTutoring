package com.icff.tutoring.po;

import java.util.List;

public class Tutorialclasstype {
    private String typeid;

    private String superTypeid;

    private String typeDescribe;

    private String yxbz;
    
    private List<Tutorialclasstype> tutorialclasstypes;
    
    private String superDescribe;
    

  

	public String getSuperDescribe() {
		return superDescribe;
	}

	public void setSuperDescribe(String superDescribe) {
		this.superDescribe = superDescribe;
	}

	public List<Tutorialclasstype> getTutorialclasstypes() {
		return tutorialclasstypes;
	}

	public void setTutorialclasstypes(List<Tutorialclasstype> tutorialclasstypes) {
		this.tutorialclasstypes = tutorialclasstypes;
	}

	public String getTypeid() {
        return typeid;
    }

    public void setTypeid(String typeid) {
        this.typeid = typeid == null ? null : typeid.trim();
    }

    public String getSuperTypeid() {
        return superTypeid;
    }

    public void setSuperTypeid(String superTypeid) {
        this.superTypeid = superTypeid == null ? null : superTypeid.trim();
    }

    public String getTypeDescribe() {
        return typeDescribe;
    }

    public void setTypeDescribe(String typeDescribe) {
        this.typeDescribe = typeDescribe == null ? null : typeDescribe.trim();
    }

    public String getYxbz() {
        return yxbz;
    }

    public void setYxbz(String yxbz) {
        this.yxbz = yxbz == null ? null : yxbz.trim();
    }
}