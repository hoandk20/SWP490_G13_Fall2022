package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Riderorganization {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "riderOrganizationId", nullable = false, length = 50)
    private String riderOrganizationId;
    @Basic
    @Column(name = "OrganizationID", nullable = false, length = 50)
    private String organizationId;
    @Basic
    @Column(name = "RiderID", nullable = false, length = 50)
    private String riderId;
    @Basic
    @Column(name = "StartDate", nullable = true)
    private Timestamp startDate;
    @Basic
    @Column(name = "EndDate", nullable = true)
    private Timestamp endDate;
    @Basic
    @Column(name = "Position", nullable = true, length = 4)
    private String position;

    public String getRiderOrganizationId() {
        return riderOrganizationId;
    }

    public void setRiderOrganizationId(String riderOrganizationId) {
        this.riderOrganizationId = riderOrganizationId;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getRiderId() {
        return riderId;
    }

    public void setRiderId(String riderId) {
        this.riderId = riderId;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Riderorganization that = (Riderorganization) o;

        if (riderOrganizationId != null ? !riderOrganizationId.equals(that.riderOrganizationId) : that.riderOrganizationId != null)
            return false;
        if (organizationId != null ? !organizationId.equals(that.organizationId) : that.organizationId != null)
            return false;
        if (riderId != null ? !riderId.equals(that.riderId) : that.riderId != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (position != null ? !position.equals(that.position) : that.position != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = riderOrganizationId != null ? riderOrganizationId.hashCode() : 0;
        result = 31 * result + (organizationId != null ? organizationId.hashCode() : 0);
        result = 31 * result + (riderId != null ? riderId.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        return result;
    }
}
