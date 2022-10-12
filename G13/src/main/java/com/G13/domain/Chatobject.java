package com.G13.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "chatobject")
public class Chatobject {
    @Id
    @Column(name = "msgId", nullable = false, length = 50)
    private String id;

    @Column(name = "date")
    private Long date;

    @Column(name = "message", length = 500)
    private String message;

    @Column(name = "receiveId", length = 50)
    private String receiveId;

    @Column(name = "senderId", length = 50)
    private String senderId;

    @Column(name = "senderType", length = 4)
    private String senderType;

    @Column(name = "status", length = 4)
    private String status;

    @Column(name = "tripId", length = 70)
    private String tripId;

    @Column(name = "MessageType", nullable = false)
    private Byte messageType;

    @Column(name = "fileName", length = 200)
    private String fileName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getReceiveId() {
        return receiveId;
    }

    public void setReceiveId(String receiveId) {
        this.receiveId = receiveId;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getSenderType() {
        return senderType;
    }

    public void setSenderType(String senderType) {
        this.senderType = senderType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTripId() {
        return tripId;
    }

    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    public Byte getMessageType() {
        return messageType;
    }

    public void setMessageType(Byte messageType) {
        this.messageType = messageType;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

}