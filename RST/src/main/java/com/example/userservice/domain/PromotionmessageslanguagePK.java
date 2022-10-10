package com.example.userservice.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class PromotionmessageslanguagePK implements Serializable {
    @Column(name = "PromotionMessageId", nullable = false, length = 50)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String promotionMessageId;
    @Column(name = "Language", nullable = false, length = 4)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
        if (o == null || getClass() != o.getClass()) return false;

        PromotionmessageslanguagePK that = (PromotionmessageslanguagePK) o;

        if (promotionMessageId != null ? !promotionMessageId.equals(that.promotionMessageId) : that.promotionMessageId != null)
            return false;
        if (language != null ? !language.equals(that.language) : that.language != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = promotionMessageId != null ? promotionMessageId.hashCode() : 0;
        result = 31 * result + (language != null ? language.hashCode() : 0);
        return result;
    }
}
