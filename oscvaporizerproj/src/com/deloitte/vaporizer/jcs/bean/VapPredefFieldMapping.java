package com.deloitte.vaporizer.jcs.bean;

import java.util.Date;

public class VapPredefFieldMapping {
    private int id;
    private int predefObjMappingId;
    private String siebBaseTableName;
    private String siebBaseTableColumnName;
    private String oscObjectName;
    private String oscObjectFieldName;
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

    public void setPredefObjMappingId(int predefObjMappingId) {
        this.predefObjMappingId = predefObjMappingId;
    }

    public int getPredefObjMappingId() {
        return predefObjMappingId;
    }

    public void setSiebBaseTableName(String siebBaseTableName) {
        this.siebBaseTableName = siebBaseTableName;
    }

    public String getSiebBaseTableName() {
        return siebBaseTableName;
    }

    public void setSiebBaseTableColumnName(String siebBaseTableColumnName) {
        this.siebBaseTableColumnName = siebBaseTableColumnName;
    }

    public String getSiebBaseTableColumnName() {
        return siebBaseTableColumnName;
    }

    public void setOscObjectName(String oscObjectName) {
        this.oscObjectName = oscObjectName;
    }

    public String getOscObjectName() {
        return oscObjectName;
    }

    public void setOscObjectFieldName(String oscObjectFieldName) {
        this.oscObjectFieldName = oscObjectFieldName;
    }

    public String getOscObjectFieldName() {
        return oscObjectFieldName;
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
