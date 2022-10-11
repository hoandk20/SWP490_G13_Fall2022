package com.rst.domain;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PromotionmessageslanguageId implements Serializable {
    private static final long serialVersionUID = -5635585787247238287L;
    @Column(name = "PromotionMessageId", nullable = false, length = 50)
    private String promotionMessageId;

    @Column(name = "Language", nullable = false, length = 4)
    private String language;

    public String getPromotionMessageId() {
        return promotionMessageId;
    }

    public void setPromotionMessageId(String promotionMessageId) {
        this.promotionMessageId = promotionMessageId;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PromotionmessageslanguageId entity = (PromotionmessageslanguageId) o;
        return Objects.equals(this.promotionMessageId, entity.promotionMessageId) &&
                Objects.equals(this.language, entity.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(promotionMessageId, language);
    }

}