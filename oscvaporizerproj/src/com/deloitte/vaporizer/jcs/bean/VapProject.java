package com.deloitte.vaporizer.jcs.bean;

import java.util.Date;

public class VapProject 
{
    private int projectId;
    private String projectName;
    private String siebelUserName;
    private String siebelPassword;
    private String siebelToken;
    private String siebelRepositoryName;
    private String parentProjectId;
    private String tgScUserName;
    private String tgScPassword;
    private String tgScHostName;
    private Date created;
    private String createdBy;
    private Date lastUpdated;
    private String lastUpdatedBy;


    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setSiebelUserName(String siebelUserName) {
        this.siebelUserName = siebelUserName;
    }

    public String getSiebelUserName() {
        return siebelUserName;
    }

    public void setSiebelPassword(String siebelPassword) {
        this.siebelPassword = siebelPassword;
    }

    public String getSiebelPassword() {
        return siebelPassword;
    }

    public void setSiebelToken(String siebelToken) {
        this.siebelToken = siebelToken;
    }

    public String getSiebelToken() {
        return siebelToken;
    }

    public void setSiebelRepositoryName(String siebelRepositoryName) {
        this.siebelRepositoryName = siebelRepositoryName;
    }

    public String getSiebelRepositoryName() {
        return siebelRepositoryName;
    }

    public void setParentProjectId(String parentProjectId) {
        this.parentProjectId = parentProjectId;
    }

    public String getParentProjectId() {
        return parentProjectId;
    }

    public void setTgScUserName(String tgScUserName) {
        this.tgScUserName = tgScUserName;
    }

    public String getTgScUserName() {
        return tgScUserName;
    }

    public void setTgScPassword(String tgScPassword) {
        this.tgScPassword = tgScPassword;
    }

    public String getTgScPassword() {
        return tgScPassword;
    }

    public void setTgScHostName(String tgScHostName) {
        this.tgScHostName = tgScHostName;
    }

    public String getTgScHostName() {
        return tgScHostName;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

}
