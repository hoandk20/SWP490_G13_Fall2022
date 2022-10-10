package com.example.userservice.domain;

import javax.persistence.*;

@Entity
public class Chatobject {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "msgId", nullable = false, length = 50)
    private String msgId;
    @Basic
    @Column(name = "date", nullable = true)
    private Long date;
    @Basic
    @Column(name = "message", nullable = true, length = 500)
    private String message;
    @Basic
    @Column(name = "receiveId", nullable = true, length = 50)
    private String receiveId;
    @Basic
    @Column(name = "senderId", nullable = true, length = 50)
    private String senderId;
    @Basic
    @Column(name = "senderType", nullable = true, length = 4)
    private String senderType;
    @Basic
    @Column(name = "status", nullable = true, length = 4)
    private String status;
    @Basic
    @Column(name = "tripId", nullable = true, length = 70)
    private String tripId;
    @Basic
    @Column(name = "MessageType", nullable = false)
    private byte messageType;
    @Basic
    @Column(name = "fileName", nullable = true, length = 200)
    private String fileName;

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
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

    public byte getMessageType() {
        return messageType;
    }

    public void setMessageType(byte messageType) {
        this.messageType = messageType;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chatobject that = (Chatobject) o;

        if (messageType != that.messageType) return false;
        if (msgId != null ? !msgId.equals(that.msgId) : that.msgId != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (message != null ? !message.equals(that.message) : that.message != null) return false;
        if (receiveId != null ? !receiveId.equals(that.receiveId) : that.receiveId != null) return false;
        if (senderId != null ? !senderId.equals(that.senderId) : that.senderId != null) return false;
        if (senderType != null ? !senderType.equals(that.senderType) : that.senderType != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (tripId != null ? !tripId.equals(that.tripId) : that.tripId != null) return false;
        if (fileName != null ? !fileName.equals(that.fileName) : that.fileName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = msgId != null ? msgId.hashCode() : 0;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (message != null ? message.hashCode() : 0);
        result = 31 * result + (receiveId != null ? receiveId.hashCode() : 0);
        result = 31 * result + (senderId != null ? senderId.hashCode() : 0);
        result = 31 * result + (senderType != null ? senderType.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (tripId != null ? tripId.hashCode() : 0);
        result = 31 * result + (int) messageType;
        result = 31 * result + (fileName != null ? fileName.hashCode() : 0);
        return result;
    }
}
