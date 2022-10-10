package com.example.userservice.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class PromotionmessagecityPK implements Serializable {
    @Column(name = "CityID", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cityId;
    @Column(name = "promotionMessageId", nullable = false, length = 50)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String promotionMessageId;

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getPromotionMessageId() {
        return promotionMessageId;
    }

    public void setPromotionMessageId(String promotionMessageId) {
        this.promotionMessageId = promotionMessageId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PromotionmessagecityPK that = (PromotionmessagecityPK) o;

        if (cityId != that.cityId) return false;
        if (promotionMessageId != null ? !promotionMessageId.equals(that.promotionMessageId) : that.promotionMessageId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cityId;
        result = 31 * result + (promotionMessageId != null ? promotionMessageId.hashCode() : 0);
        return result;
    }
}
