package com.G13.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tn_locks")
public class TnLock {
    @EmbeddedId
    private TnLockId id;

    public TnLockId getId() {
        return id;
    }

    public void setId(TnLockId id) {
        this.id = id;
    }

    //TODO [JPA Buddy] generate columns from DB
}