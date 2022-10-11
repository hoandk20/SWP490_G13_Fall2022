package com.rst.domain;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "userconnection")
public class Userconnection {
    @EmbeddedId
    private UserconnectionId id;

    @Column(name = "rank", nullable = false)
    private Integer rank;

    @Column(name = "displayName")
    private String displayName;

    @Column(name = "profileUrl", length = 512)
    private String profileUrl;

    @Column(name = "imageUrl", length = 512)
    private String imageUrl;

    @Column(name = "accessToken", nullable = false)
    private String accessToken;

    @Column(name = "secret")
    private String secret;

    @Column(name = "refreshToken")
    private String refreshToken;

    @Column(name = "expireTime")
    private Long expireTime;

    public UserconnectionId getId() {
        return id;
    }

    public void setId(UserconnectionId id) {
        this.id = id;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
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

}