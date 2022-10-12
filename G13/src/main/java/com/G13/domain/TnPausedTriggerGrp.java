package com.G13.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tn_paused_trigger_grps")
public class TnPausedTriggerGrp {
    @EmbeddedId
    private TnPausedTriggerGrpId id;

    public TnPausedTriggerGrpId getId() {
        return id;
    }

    public void setId(TnPausedTriggerGrpId id) {
        this.id = id;
    }

    //TODO [JPA Buddy] generate columns from DB
}