package com.rst.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "screengroup")
public class Screengroup {
    @Id
    @Column(name = "GroupID", nullable = false)
    private Integer id;

    @Column(name = "GroupName", nullable = false, length = 50)
    private String groupName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

}