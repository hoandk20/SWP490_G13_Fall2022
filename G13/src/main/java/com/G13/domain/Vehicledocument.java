package com.G13.domain;

import javax.persistence.*;

@Entity
@Table(name = "vehicledocument")
public class Vehicledocument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "documentid", nullable = false)
    private Document documentid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "vehicleid", nullable = false)
    private Vehicle vehicleid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Document getDocumentid() {
        return documentid;
    }

    public void setDocumentid(Document documentid) {
        this.documentid = documentid;
    }

    public Vehicle getVehicleid() {
        return vehicleid;
    }

    public void setVehicleid(Vehicle vehicleid) {
        this.vehicleid = vehicleid;
    }

}