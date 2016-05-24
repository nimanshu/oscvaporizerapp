package com.deloitte.vaporizer.siebel.bean;

public class SiebelAccount {
    private String accountName;
    private String accountStatus;
    private String accountType;
    private String accountStreetAddress1;
    private String accountStreetAddress2;
    private String accountStreetAddress3;
    private String state;
    private String city;
    private String zipCode;


    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountStreetAddress1(String accountStreetAddress1) {
        this.accountStreetAddress1 = accountStreetAddress1;
    }

    public String getAccountStreetAddress1() {
        return accountStreetAddress1;
    }

    public void setAccountStreetAddress2(String accountStreetAddress2) {
        this.accountStreetAddress2 = accountStreetAddress2;
    }

    public String getAccountStreetAddress2() {
        return accountStreetAddress2;
    }

    public void setAccountStreetAddress3(String accountStreetAddress3) {
        this.accountStreetAddress3 = accountStreetAddress3;
    }

    public String getAccountStreetAddress3() {
        return accountStreetAddress3;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getZipCode() {
        return zipCode;
    }
}
