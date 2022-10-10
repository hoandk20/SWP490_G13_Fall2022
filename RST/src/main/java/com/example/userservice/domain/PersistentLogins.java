package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "persistent_logins", schema = "tnet_pro", catalog = "")
public class PersistentLogins {
    @Basic
    @Column(name = "username", nullable = false, length = 64)
    private String username;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "series", nullable = false, length = 64)
    private String series;
    @Basic
    @Column(name = "token", nullable = false, length = 64)
    private String token;
    @Basic
    @Column(name = "last_used", nullable = false)
    private Timestamp lastUsed;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Timestamp getLastUsed() {
        return lastUsed;
    }

    public void setLastUsed(Timestamp lastUsed) {
        this.lastUsed = lastUsed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersistentLogins that = (PersistentLogins) o;

        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (series != null ? !series.equals(that.series) : that.series != null) return false;
        if (token != null ? !token.equals(that.token) : that.token != null) return false;
        if (lastUsed != null ? !lastUsed.equals(that.lastUsed) : that.lastUsed != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (series != null ? series.hashCode() : 0);
        result = 31 * result + (token != null ? token.hashCode() : 0);
        result = 31 * result + (lastUsed != null ? lastUsed.hashCode() : 0);
        return result;
    }
}
