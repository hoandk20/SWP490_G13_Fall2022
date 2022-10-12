package com.G13.domain;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ReferencedatumId implements Serializable {
    private static final long serialVersionUID = -5087031942327406650L;
    @Column(name = "GroupCode", nullable = false, length = 20)
    private String groupCode;

    @Column(name = "Code", nullable = false, length = 8)
    private String code;

    @Column(name = "LanguageCode", nullable = false, length = 4)
    private String languageCode;

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ReferencedatumId entity = (ReferencedatumId) o;
        return Objects.equals(this.code, entity.code) &&
                Objects.equals(this.languageCode, entity.languageCode) &&
                Objects.equals(this.groupCode, entity.groupCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, languageCode, groupCode);
    }

}