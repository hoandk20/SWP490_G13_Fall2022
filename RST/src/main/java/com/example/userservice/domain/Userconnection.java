package com.example.userservice.domain;

import javax.persistence.*;

@Entity
@IdClass(UserconnectionPK.class)
public class Userconnection {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "userId", nullable = false, length = 255)
    private String userId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "providerId", nullable = false, length = 255)
    private String providerId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "providerUserId", nullable = false, length = 255)
    private String providerUserId;
    @Basic
    @Column(name = "rank", nullable = false)
    private int rank;
    @Basic
    @Column(name = "displayName", nullable = true, length = 255)
    private String displayName;
    @Basic
    @Column(name = "profileUrl", nullable = true, length = 512)
    private String profileUrl;
    @Basic
    @Column(name = "imageUrl", nullable = true, length = 512)
    private String imageUrl;
    @Basic
    @Column(name = "accessToken", nullable = false, length = 255)
    private String accessToken;
    @Basic
    @Column(name = "secret", nullable = true, length = 255)
    private String secret;
    @Basic
    @Column(name = "refreshToken", nullable = true, length = 255)
    private String refreshToken;
    @Basic
    @Column(name = "expireTime", nullable = true)
    private Long expireTime;

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

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public Long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Userconnection that = (Userconnection) o;

        if (rank != that.rank) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (providerId != null ? !providerId.equals(that.providerId) : that.providerId != null) return false;
        if (providerUserId != null ? !providerUserId.equals(that.providerUserId) : that.providerUserId != null)
            return false;
        if (displayName != null ? !displayName.equals(that.displayName) : that.displayName != null) return false;
        if (profileUrl != null ? !profileUrl.equals(that.profileUrl) : that.profileUrl != null) return false;
        if (imageUrl != null ? !imageUrl.equals(that.imageUrl) : that.imageUrl != null) return false;
        if (accessToken != null ? !accessToken.equals(that.accessToken) : that.accessToken != null) return false;
        if (secret != null ? !secret.equals(that.secret) : that.secret != null) return false;
        if (refreshToken != null ? !refreshToken.equals(that.refreshToken) : that.refreshToken != null) return false;
        if (expireTime != null ? !expireTime.equals(that.expireTime) : that.expireTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (providerId != null ? providerId.hashCode() : 0);
        result = 31 * result + (providerUserId != null ? providerUserId.hashCode() : 0);
        result = 31 * result + rank;
        result = 31 * result + (displayName != null ? displayName.hashCode() : 0);
        result = 31 * result + (profileUrl != null ? profileUrl.hashCode() : 0);
        result = 31 * result + (imageUrl != null ? imageUrl.hashCode() : 0);
        result = 31 * result + (accessToken != null ? accessToken.hashCode() : 0);
        result = 31 * result + (secret != null ? secret.hashCode() : 0);
        result = 31 * result + (refreshToken != null ? refreshToken.hashCode() : 0);
        result = 31 * result + (expireTime != null ? expireTime.hashCode() : 0);
        return result;
    }
}
