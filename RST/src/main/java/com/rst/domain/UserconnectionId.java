package com.rst.domain;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UserconnectionId implements Serializable {
    private static final long serialVersionUID = 264217773530990131L;
    @Column(name = "userId", nullable = false)
    private String userId;

    @Column(name = "providerId", nullable = false)
    private String providerId;

    @Column(name = "providerUserId", nullable = false)
    private String providerUserId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public String getProviderUserId() {
        return providerUserId;
    }

    public void setProviderUserId(String providerUserId) {
        this.providerUserId = providerUserId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        UserconnectionId entity = (UserconnectionId) o;
        return Objects.equals(this.providerId, entity.providerId) &&
                Objects.equals(this.userId, entity.userId) &&
                Objects.equals(this.providerUserId, entity.providerUserId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(providerId, userId, providerUserId);
    }

}