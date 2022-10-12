package com.G13.domain;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PromotionmessagecityId implements Serializable {
    private static final long serialVersionUID = 7281121827341807626L;
    @Column(name = "CityID", nullable = false)
    private Integer cityID;

    @Column(name = "promotionMessageId", nullable = false, length = 50)
    private String promotionMessageId;

    public Integer getCityID() {
        return cityID;
    }

    public void setCityID(Integer cityID) {
        this.cityID = cityID;
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
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PromotionmessagecityId entity = (PromotionmessagecityId) o;
        return Objects.equals(this.promotionMessageId, entity.promotionMessageId) &&
                Objects.equals(this.cityID, entity.cityID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(promotionMessageId, cityID);
    }

}