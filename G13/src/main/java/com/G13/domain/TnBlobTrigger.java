package com.G13.domain;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tn_blob_triggers")
public class TnBlobTrigger {
    @EmbeddedId
    private TnBlobTriggerId id;

    @Column(name = "BLOB_DATA")
    private byte[] blobData;

    public TnBlobTriggerId getId() {
        return id;
    }

    public void setId(TnBlobTriggerId id) {
        this.id = id;
    }

    public byte[] getBlobData() {
        return blobData;
    }

    public void setBlobData(byte[] blobData) {
        this.blobData = blobData;
    }

}