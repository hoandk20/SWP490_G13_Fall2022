package com.G13.domain;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class LanguagenameId implements Serializable {
    private static final long serialVersionUID = 377393640860726017L;
    @Column(name = "Code", nullable = false, length = 4)
    private String code;

    @Column(name = "LanguageCode", nullable = false, length = 4)
    private String languageCode;

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
        LanguagenameId entity = (LanguagenameId) o;
        return Objects.equals(this.code, entity.code) &&
                Objects.equals(this.languageCode, entity.languageCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, languageCode);
    }

}