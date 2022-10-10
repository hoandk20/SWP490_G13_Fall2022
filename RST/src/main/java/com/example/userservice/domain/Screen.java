package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Screen {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ScreenID", nullable = false)
    private int screenId;
    @Basic
    @Column(name = "ScreenName", nullable = false, length = 50)
    private String screenName;
    @Basic
    @Column(name = "ActionPath", nullable = false, length = 100)
    private String actionPath;
    @Basic
    @Column(name = "IsMenuItem", nullable = false)
    private int isMenuItem;
    @Basic
    @Column(name = "GroupId", nullable = false)
    private int groupId;
    @Basic
    @Column(name = "ParentId", nullable = true)
    private Integer parentId;
    @Basic
    @Column(name = "Module", nullable = false, length = 10)
    private String module;
    @Basic
    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;
    @Basic
    @Column(name = "CreatedDate", nullable = false)
    private Timestamp createdDate;
    @Basic
    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;
    @Basic
    @Column(name = "LastModifiedDate", nullable = false)
    private Timestamp lastModifiedDate;

    public int getScreenId() {
        return screenId;
    }

    public void setScreenId(int screenId) {
        this.screenId = screenId;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public String getActionPath() {
        return actionPath;
    }

    public void setActionPath(String actionPath) {
        this.actionPath = actionPath;
    }

    public int getIsMenuItem() {
        return isMenuItem;
    }

    public void setIsMenuItem(int isMenuItem) {
        this.isMenuItem = isMenuItem;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Timestamp getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Timestamp lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Screen screen = (Screen) o;

        if (screenId != screen.screenId) return false;
        if (isMenuItem != screen.isMenuItem) return false;
        if (groupId != screen.groupId) return false;
        if (screenName != null ? !screenName.equals(screen.screenName) : screen.screenName != null) return false;
        if (actionPath != null ? !actionPath.equals(screen.actionPath) : screen.actionPath != null) return false;
        if (parentId != null ? !parentId.equals(screen.parentId) : screen.parentId != null) return false;
        if (module != null ? !module.equals(screen.module) : screen.module != null) return false;
        if (createdBy != null ? !createdBy.equals(screen.createdBy) : screen.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(screen.createdDate) : screen.createdDate != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(screen.lastModifiedBy) : screen.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(screen.lastModifiedDate) : screen.lastModifiedDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = screenId;
        result = 31 * result + (screenName != null ? screenName.hashCode() : 0);
        result = 31 * result + (actionPath != null ? actionPath.hashCode() : 0);
        result = 31 * result + isMenuItem;
        result = 31 * result + groupId;
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (module != null ? module.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        return result;
    }
}
