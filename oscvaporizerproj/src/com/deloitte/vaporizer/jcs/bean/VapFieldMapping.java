package com.deloitte.vaporizer.jcs.bean;

import java.util.Date;

public class VapFieldMapping 
{
    private int id;
    private int objMapId;
    private String siebBaseTableName;
    private String siebColumnName;
    private String oscObjName;
    private String oscFieldName;
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

    public void setObjMapId(int objMapId) {
        this.objMapId = objMapId;
    }

    public int getObjMapId() {
        return objMapId;
    }


    public void setSiebBaseTableName(String siebBaseTableName) {
        this.siebBaseTableName = siebBaseTableName;
    }

    public String getSiebBaseTableName() {
        return siebBaseTableName;
    }

    public void setSiebColumnName(String siebColumnName) {
        this.siebColumnName = siebColumnName;
    }

    public String getSiebColumnName() {
        return siebColumnName;
    }

    public void setOscObjName(String oscObjName) {
        this.oscObjName = oscObjName;
    }

    public String getOscObjName() {
        return oscObjName;
    }

    public void setOscFieldName(String oscFieldName) {
        this.oscFieldName = oscFieldName;
    }

    public String getOscFieldName() {
        return oscFieldName;
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
