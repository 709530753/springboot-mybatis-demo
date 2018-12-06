package com.myxc.model;

public class BreakDownItem {
    private Integer spnId;

    private String spn;

    private String fmi;

    private String faultMesg;

    private String faultTime;

    public Integer getSpnId() {
        return spnId;
    }

    public void setSpnId(Integer spnId) {
        this.spnId = spnId;
    }

    public String getSpn() {
        return spn;
    }

    public void setSpn(String spn) {
        this.spn = spn;
    }

    public String getFmi() {
        return fmi;
    }

    public void setFmi(String fmi) {
        this.fmi = fmi;
    }

    public String getFaultMesg() {
        return faultMesg;
    }

    public void setFaultMesg(String faultMesg) {
        this.faultMesg = faultMesg;
    }

    public String getFaultTime() {
        return faultTime;
    }

    public void setFaultTime(String faultTime) {
        this.faultTime = faultTime;
    }
}