package com.myxc.model;

public class ServiceActiveItem {
    private Integer itemId;

    private String activeId;

    private String activeCode;

    private String activeName;

    private String activeComment;

    private String woCode;

    private String status;

    private String opId;


    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getActiveId() {
        return activeId;
    }

    public void setActiveId(String activeId) {
        this.activeId = activeId;
    }

    public String getActiveCode() {
        return activeCode;
    }

    public void setActiveCode(String activeCode) {
        this.activeCode = activeCode;
    }

    public String getActiveName() {
        return activeName;
    }

    public void setActiveName(String activeName) {
        this.activeName = activeName;
    }

    public String getActiveComment() {
        return activeComment;
    }

    public void setActiveComment(String activeComment) {
        this.activeComment = activeComment;
    }

    public String getWoCode() {
        return woCode;
    }

    public void setWoCode(String woCode) {
        this.woCode = woCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOpId() {
        return opId;
    }

    public void setOpId(String opId) {
        this.opId = opId;
    }

    @Override
    public String toString() {
        return "ServiceActiveItem{" +
                "itemId=" + itemId +
                ", activeId='" + activeId + '\'' +
                ", activeCode='" + activeCode + '\'' +
                ", activeName='" + activeName + '\'' +
                ", activeComment='" + activeComment + '\'' +
                ", woCode='" + woCode + '\'' +
                ", status='" + status + '\'' +
                ", opId='" + opId + '\'' +
                '}';
    }
}