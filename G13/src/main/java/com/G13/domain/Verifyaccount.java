package com.G13.domain;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "verifyaccount")
public class Verifyaccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "userid", nullable = false)
    private Integer userid;

    @Column(name = "expiredate")
    private Instant expiredate;

    @Column(name = "verificode", length = 50)
    private String verificode;

    @Column(name = "status", length = 50)
    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Instant getExpiredate() {
        return expiredate;
    }

    public void setExpiredate(Instant expiredate) {
        this.expiredate = expiredate;
    }

    public String getVerificode() {
        return verificode;
    }

    public void setVerificode(String verificode) {
        this.verificode = verificode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}