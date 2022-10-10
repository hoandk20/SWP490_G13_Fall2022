package com.example.userservice.domain;

import javax.persistence.*;

@Entity
public class Screengroup {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "GroupID", nullable = false)
    private int groupId;
    @Basic
    @Column(name = "GroupName", nullable = false, length = 50)
    private String groupName;

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Screengroup that = (Screengroup) o;

        if (groupId != that.groupId) return false;
        if (groupName != null ? !groupName.equals(that.groupName) : that.groupName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = groupId;
        result = 31 * result + (groupName != null ? groupName.hashCode() : 0);
        return result;
    }
}
