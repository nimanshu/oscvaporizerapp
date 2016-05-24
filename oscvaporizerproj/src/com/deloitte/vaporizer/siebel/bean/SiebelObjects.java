package com.deloitte.vaporizer.siebel.bean;

public class SiebelObjects {
    private String objectName;
    private String baseTableName;
    
    public SiebelObjects()
    {
        
    }

    public SiebelObjects(String siebObjs, String baseTableName)
    {
        this.objectName = siebObjs;  
        this.baseTableName = baseTableName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setBaseTableName(String baseTableName) {
        this.baseTableName = baseTableName;
    }

    public String getBaseTableName() {
        return baseTableName;
    }
}
