package com.example.userservice.domain;

import javax.persistence.*;

@Entity
public class Groupfield {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "GroupFieldCode", nullable = false, length = 50)
    private String groupFieldCode;
    @Basic
    @Column(name = "ScreenID", nullable = false)
    private int screenId;
    @Basic
    @Column(name = "GroupFieldName", nullable = false, length = 50)
    private String groupFieldName;
    @Basic
    @Column(name = "Module", nullable = false, length = 10)
    private String module;

    public String getGroupFieldCode() {
        return groupFieldCode;
    }

    public void setGroupFieldCode(String groupFieldCode) {
        this.groupFieldCode = groupFieldCode;
    }

    public int getScreenId() {
        return screenId;
    }

    public void setScreenId(int screenId) {
        this.screenId = screenId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Groupfield that = (Groupfield) o;

        if (screenId != that.screenId) return false;
        if (groupFieldCode != null ? !groupFieldCode.equals(that.groupFieldCode) : that.groupFieldCode != null)
            return false;
        if (groupFieldName != null ? !groupFieldName.equals(that.groupFieldName) : that.groupFieldName != null)
            return false;
        if (module != null ? !module.equals(that.module) : that.module != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = groupFieldCode != null ? groupFieldCode.hashCode() : 0;
        result = 31 * result + screenId;
        result = 31 * result + (groupFieldName != null ? groupFieldName.hashCode() : 0);
        result = 31 * result + (module != null ? module.hashCode() : 0);
        return result;
    }
}
