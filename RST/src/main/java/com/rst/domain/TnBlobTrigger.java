package com.rst.domain;

import javax.persistence.*;

@Entity
@Table(name = "tn_blob_triggers")
public class TnBlobTrigger {
    @EmbeddedId
    private TnBlobTriggerId id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "SCHED_NAME", referencedColumnName = "SCHED_NAME", nullable = false),
            @JoinColumn(name = "TRIGGER_NAME", referencedColumnName = "TRIGGER_NAME", nullable = false),
            @JoinColumn(name = "TRIGGER_GROUP", referencedColumnName = "TRIGGER_GROUP", nullable = false)
    })
    private TnTrigger tnTriggers;

    @Column(name = "BLOB_DATA")
    private byte[] blobData;

    public TnBlobTriggerId getId() {
        return id;
    }

    public void setId(TnBlobTriggerId id) {
        this.id = id;
    }

    public TnTrigger getTnTriggers() {
        return tnTriggers;
    }

    public void setTnTriggers(TnTrigger tnTriggers) {
        this.tnTriggers = tnTriggers;
    }

    public byte[] getBlobData() {
        return blobData;
    }

    public void setBlobData(byte[] blobData) {
        this.blobData = blobData;
    }

}