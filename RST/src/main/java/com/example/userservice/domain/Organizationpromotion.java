package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
public class Organizationpromotion {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "OrganizationPromotionNo", nullable = false, length = 50)
    private String organizationPromotionNo;
    @Basic
    @Column(name = "AgentID", nullable = false)
    private int agentId;
    @Basic
    @Column(name = "title", nullable = true, length = 300)
    private String title;
    @Basic
    @Column(name = "Point", nullable = false)
    private int point;
    @Basic
    @Column(name = "StartDate", nullable = false)
    private Date startDate;
    @Basic
    @Column(name = "EndDate", nullable = true)
    private Date endDate;
    @Basic
    @Column(name = "Value", nullable = false, precision = 0)
    private double value;
    @Basic
    @Column(name = "Type", nullable = false, length = 4)
    private String type;
    @Basic
    @Column(name = "Status", nullable = false, length = 4)
    private String status;
    @Basic
    @Column(name = "Image", nullable = true, length = 100)
    private String image;
    @Basic
    @Column(name = "InfoUrl", nullable = true, length = 150)
    private String infoUrl;
    @Basic
    @Column(name = "FocusInfo", nullable = true, length = 500)
    private String focusInfo;
    @Basic
    @Column(name = "Rule", nullable = true, length = 500)
    private String rule;
    @Basic
    @Column(name = "Description", nullable = true, length = 500)
    private String description;
    @Basic
    @Column(name = "UrlInfoImage", nullable = true, length = 150)
    private String urlInfoImage;
    @Basic
    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;
    @Basic
    @Column(name = "CreatedDate", nullable = false)
    private Timestamp createdDate;
    @Basic
    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;
    @Basic
    @Column(name = "LastModifiedDate", nullable = false)
    private Timestamp lastModifiedDate;
    @Basic
    @Column(name = "Priority", nullable = false)
    private boolean priority;
    @Basic
    @Column(name = "valueTnet", nullable = false, precision = 0)
    private double valueTnet;

    public String getOrganizationPromotionNo() {
        return organizationPromotionNo;
    }

    public void setOrganizationPromotionNo(String organizationPromotionNo) {
        this.organizationPromotionNo = organizationPromotionNo;
    }

    public int getAgentId() {
        return agentId;
    }

    public void setAgentId(int agentId) {
        this.agentId = agentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
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

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Timestamp getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Timestamp lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public boolean isPriority() {
        return priority;
    }

    public void setPriority(boolean priority) {
        this.priority = priority;
    }

    public double getValueTnet() {
        return valueTnet;
    }

    public void setValueTnet(double valueTnet) {
        this.valueTnet = valueTnet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Organizationpromotion that = (Organizationpromotion) o;

        if (agentId != that.agentId) return false;
        if (point != that.point) return false;
        if (Double.compare(that.value, value) != 0) return false;
        if (priority != that.priority) return false;
        if (Double.compare(that.valueTnet, valueTnet) != 0) return false;
        if (organizationPromotionNo != null ? !organizationPromotionNo.equals(that.organizationPromotionNo) : that.organizationPromotionNo != null)
            return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (image != null ? !image.equals(that.image) : that.image != null) return false;
        if (infoUrl != null ? !infoUrl.equals(that.infoUrl) : that.infoUrl != null) return false;
        if (focusInfo != null ? !focusInfo.equals(that.focusInfo) : that.focusInfo != null) return false;
        if (rule != null ? !rule.equals(that.rule) : that.rule != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (urlInfoImage != null ? !urlInfoImage.equals(that.urlInfoImage) : that.urlInfoImage != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(that.lastModifiedBy) : that.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(that.lastModifiedDate) : that.lastModifiedDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = organizationPromotionNo != null ? organizationPromotionNo.hashCode() : 0;
        result = 31 * result + agentId;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + point;
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        temp = Double.doubleToLongBits(value);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (infoUrl != null ? infoUrl.hashCode() : 0);
        result = 31 * result + (focusInfo != null ? focusInfo.hashCode() : 0);
        result = 31 * result + (rule != null ? rule.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (urlInfoImage != null ? urlInfoImage.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        result = 31 * result + (priority ? 1 : 0);
        temp = Double.doubleToLongBits(valueTnet);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
