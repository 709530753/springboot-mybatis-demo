package com.myxc.model;

public class ItemDetail {
    private Integer itemId;

    private String beforePicUrl;

    private String afterPicUrl;

    private String otherPicUrl;

    private String repairItemName;

    private String userFeedBack;


    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getBeforePicUrl() {
        return beforePicUrl;
    }

    public void setBeforePicUrl(String beforePicUrl) {
        this.beforePicUrl = beforePicUrl;
    }

    public String getAfterPicUrl() {
        return afterPicUrl;
    }

    public void setAfterPicUrl(String afterPicUrl) {
        this.afterPicUrl = afterPicUrl;
    }

    public String getOtherPicUrl() {
        return otherPicUrl;
    }

    public void setOtherPicUrl(String otherPicUrl) {
        this.otherPicUrl = otherPicUrl;
    }

    public String getRepairItemName() {
        return repairItemName;
    }

    public void setRepairItemName(String repairItemName) {
        this.repairItemName = repairItemName;
    }

    public String getUserFeedBack() {
        return userFeedBack;
    }

    public void setUserFeedBack(String userFeedBack) {
        this.userFeedBack = userFeedBack;
    }
}