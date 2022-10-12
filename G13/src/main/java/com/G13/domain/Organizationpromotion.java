package com.G13.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "organizationpromotion")
public class Organizationpromotion {
    @Id
    @Column(name = "OrganizationPromotionNo", nullable = false, length = 50)
    private String id;

    @Column(name = "AgentID", nullable = false)
    private Integer agentID;

    @Column(name = "title", length = 300)
    private String title;

    @Column(name = "Point", nullable = false)
    private Integer point;

    @Column(name = "StartDate", nullable = false)
    private LocalDate startDate;

    @Column(name = "EndDate")
    private LocalDate endDate;

    @Column(name = "Value", nullable = false)
    private Float value;

    @Column(name = "Type", nullable = false, length = 4)
    private String type;

    @Column(name = "Status", nullable = false, length = 4)
    private String status;

    @Column(name = "Image", length = 100)
    private String image;

    @Column(name = "InfoUrl", length = 150)
    private String infoUrl;

    @Column(name = "FocusInfo", length = 500)
    private String focusInfo;

    @Column(name = "Rule", length = 500)
    private String rule;

    @Column(name = "Description", length = 500)
    private String description;

    @Column(name = "UrlInfoImage", length = 150)
    private String urlInfoImage;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    @Column(name = "Priority", nullable = false)
    private Boolean priority = false;

    @Column(name = "valueTnet", nullable = false)
    private Float valueTnet;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getAgentID() {
        return agentID;
    }

    public void setAgentID(Integer agentID) {
        this.agentID = agentID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getInfoUrl() {
        return infoUrl;
    }

    public void setInfoUrl(String infoUrl) {
        this.infoUrl = infoUrl;
    }

    public String getFocusInfo() {
        return focusInfo;
    }

    public void setFocusInfo(String focusInfo) {
        this.focusInfo = focusInfo;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrlInfoImage() {
        return urlInfoImage;
    }

    public void setUrlInfoImage(String urlInfoImage) {
        this.urlInfoImage = urlInfoImage;
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

    public Boolean getPriority() {
        return priority;
    }

    public void setPriority(Boolean priority) {
        this.priority = priority;
    }

    public Float getValueTnet() {
        return valueTnet;
    }

    public void setValueTnet(Float valueTnet) {
        this.valueTnet = valueTnet;
    }

}