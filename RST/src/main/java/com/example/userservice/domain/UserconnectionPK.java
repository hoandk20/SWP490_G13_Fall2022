package com.example.userservice.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class UserconnectionPK implements Serializable {
    @Column(name = "userId", nullable = false, length = 255)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userId;
    @Column(name = "providerId", nullable = false, length = 255)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String providerId;
    @Column(name = "providerUserId", nullable = false, length = 255)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
        if (o == null || getClass() != o.getClass()) return false;

        UserconnectionPK that = (UserconnectionPK) o;

        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (providerId != null ? !providerId.equals(that.providerId) : that.providerId != null) return false;
        if (providerUserId != null ? !providerUserId.equals(that.providerUserId) : that.providerUserId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (providerId != null ? providerId.hashCode() : 0);
        result = 31 * result + (providerUserId != null ? providerUserId.hashCode() : 0);
        return result;
    }
}
