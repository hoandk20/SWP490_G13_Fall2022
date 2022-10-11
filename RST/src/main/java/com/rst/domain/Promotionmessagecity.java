package com.rst.domain;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "promotionmessagecity")
public class Promotionmessagecity {
    @EmbeddedId
    private PromotionmessagecityId id;

    @MapsId("cityID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CityID", nullable = false)
    private City cityID;

    @MapsId("promotionMessageId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "promotionMessageId", nullable = false)
    private Promotionmessage promotionMessage;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    public PromotionmessagecityId getId() {
        return id;
    }

    public void setId(PromotionmessagecityId id) {
        this.id = id;
    }

    public City getCityID() {
        return cityID;
    }

    public void setCityID(City cityID) {
        this.cityID = cityID;
    }

    public Promotionmessage getPromotionMessage() {
        return promotionMessage;
    }

    public void setPromotionMessage(Promotionmessage promotionMessage) {
        this.promotionMessage = promotionMessage;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Instant getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Instant lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

}