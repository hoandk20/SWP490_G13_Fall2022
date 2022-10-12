package com.G13.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "groupfield")
public class Groupfield {
    @Id
    @Column(name = "GroupFieldCode", nullable = false, length = 50)
    private String id;

    @Column(name = "ScreenID", nullable = false)
    private Integer screenID;

    @Column(name = "GroupFieldName", nullable = false, length = 50)
    private String groupFieldName;

    @Column(name = "Module", nullable = false, length = 10)
    private String module;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getScreenID() {
        return screenID;
    }

    public void setScreenID(Integer screenID) {
        this.screenID = screenID;
    }

    public String getGroupFieldName() {
        return groupFieldName;
    }

    public void setGroupFieldName(String groupFieldName) {
        this.groupFieldName = groupFieldName;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

}