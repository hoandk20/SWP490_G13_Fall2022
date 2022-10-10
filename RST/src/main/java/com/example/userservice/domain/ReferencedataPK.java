package com.example.userservice.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class ReferencedataPK implements Serializable {
    @Column(name = "GroupCode", nullable = false, length = 20)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String groupCode;
    @Column(name = "Code", nullable = false, length = 8)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String code;
    @Column(name = "LanguageCode", nullable = false, length = 4)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
        if (o == null || getClass() != o.getClass()) return false;

        ReferencedataPK that = (ReferencedataPK) o;

        if (groupCode != null ? !groupCode.equals(that.groupCode) : that.groupCode != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (languageCode != null ? !languageCode.equals(that.languageCode) : that.languageCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = groupCode != null ? groupCode.hashCode() : 0;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (languageCode != null ? languageCode.hashCode() : 0);
        return result;
    }
}
