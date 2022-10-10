package com.example.userservice.domain;

import javax.persistence.*;

@Entity
@Table(name = "app_user", schema = "tnet_pro", catalog = "")
public class AppUser {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "user_id", nullable = false)
    private long userId;
    @Basic
    @Column(name = "enabled", nullable = false)
    private boolean enabled;
    @Basic
    @Column(name = "encryted_password", nullable = false, length = 128)
    private String encrytedPassword;
    @Basic
    @Column(name = "user_name", nullable = false, length = 36)
    private String userName;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getEncrytedPassword() {
        return encrytedPassword;
    }

    public void setEncrytedPassword(String encrytedPassword) {
        this.encrytedPassword = encrytedPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AppUser appUser = (AppUser) o;

        if (userId != appUser.userId) return false;
        if (enabled != appUser.enabled) return false;
        if (encrytedPassword != null ? !encrytedPassword.equals(appUser.encrytedPassword) : appUser.encrytedPassword != null)
            return false;
        if (userName != null ? !userName.equals(appUser.userName) : appUser.userName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (userId ^ (userId >>> 32));
        result = 31 * result + (enabled ? 1 : 0);
        result = 31 * result + (encrytedPassword != null ? encrytedPassword.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        return result;
    }
}
