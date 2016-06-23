package com.deloitte.vaporizer.jcs.bean;

import java.util.Date;

public class VapPredefObjMapping {
    private int id;
    private int existingProjId;
    private String siebParentTableNam;
    private String siebChildTableName;
    private String joinCondition;
    private int includeFlag;
    private int serialNum;
    private String siebObjectName;
    private String oscObjectName;
    private String predefObjMappingType;
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

    public void setExistingProjId(int existingProjId) {
        this.existingProjId = existingProjId;
    }

    public int getExistingProjId() {
        return existingProjId;
    }

    public void setSiebParentTableNam(String siebParentTableNam) {
        this.siebParentTableNam = siebParentTableNam;
    }

    public String getSiebParentTableNam() {
        return siebParentTableNam;
    }

    public void setSiebChildTableName(String siebChildTableName) {
        this.siebChildTableName = siebChildTableName;
    }

    public String getSiebChildTableName() {
        return siebChildTableName;
    }

    public void setJoinCondition(String joinCondition) {
        this.joinCondition = joinCondition;
    }

    public String getJoinCondition() {
        return joinCondition;
    }

    public void setIncludeFlag(int includeFlag) {
        this.includeFlag = includeFlag;
    }

    public int getIncludeFlag() {
        return includeFlag;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    public int getSerialNum() {
        return serialNum;
    }

    public void setSiebObjectName(String siebObjectName) {
        this.siebObjectName = siebObjectName;
    }

    public String getSiebObjectName() {
        return siebObjectName;
    }

    public void setOscObjectName(String oscObjectName) {
        this.oscObjectName = oscObjectName;
    }

    public String getOscObjectName() {
        return oscObjectName;
    }

    public void setPredefObjMappingType(String predefObjMappingType) {
        this.predefObjMappingType = predefObjMappingType;
    }

    public String getPredefObjMappingType() {
        return predefObjMappingType;
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
