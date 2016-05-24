package com.deloitte.vaporizer.jcs.bean;

import java.util.Date;

public class VapObjMapping 
{
    private int id;
    private int sequence;
    private String oscObject;
    private String siebelObject;
    private String siebelPrimBaseTable;
    private String projectId;
    private String extractionQuery;
    private Date created;
    private String createdBy;
    private Date lstUpdated;
    private String lstUpdatedBy;


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public int getSequence() {
        return sequence;
    }

    public void setOscObject(String oscObject) {
        this.oscObject = oscObject;
    }

    public String getOscObject() {
        return oscObject;
    }

    public void setSiebelObject(String siebelObject) {
        this.siebelObject = siebelObject;
    }

    public String getSiebelObject() {
        return siebelObject;
    }

    public void setSiebelPrimBaseTable(String siebelPrimBaseTable) {
        this.siebelPrimBaseTable = siebelPrimBaseTable;
    }

    public String getSiebelPrimBaseTable() {
        return siebelPrimBaseTable;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setExtractionQuery(String extractionQuery) {
        this.extractionQuery = extractionQuery;
    }

    public String getExtractionQuery() {
        return extractionQuery;
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

    public void setLstUpdated(Date lstUpdated) {
        this.lstUpdated = lstUpdated;
    }

    public Date getLstUpdated() {
        return lstUpdated;
    }

    public void setLstUpdatedBy(String lstUpdatedBy) {
        this.lstUpdatedBy = lstUpdatedBy;
    }

    public String getLstUpdatedBy() {
        return lstUpdatedBy;
    }
}
