package com.rst.domain;

import javax.persistence.*;

@Entity
@Table(name = "groupfield")
public class Groupfield {
    @Id
    @Column(name = "GroupFieldCode", nullable = false, length = 50)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ScreenID", nullable = false)
    private Screen screenID;

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

    public Screen getScreenID() {
        return screenID;
    }

    public void setScreenID(Screen screenID) {
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