package com.deloitte.vaporizer.siebel.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SiebelAccountDynamic {
    
    private Map<Integer, List<String>> colIndexAndData;
    private Map<Integer, String> colIndexAndColName;
    
    public SiebelAccountDynamic()
    {
        
    }
    
    public SiebelAccountDynamic(Map<Integer, List<String>> map1, Map<Integer, String> map2)
    {
        colIndexAndData = map1;
        colIndexAndColName = map2;
    }

    public void setColIndexAndData(Map<Integer, List<String>> colIndexAndData) {
        this.colIndexAndData = colIndexAndData;
    }

    public Map<Integer, List<String>> getColIndexAndData() {
        return colIndexAndData;
    }

    public void setColIndexAndColName(Map<Integer, String> colIndexAndColName) {
        this.colIndexAndColName = colIndexAndColName;
    }

    public Map<Integer, String> getColIndexAndColName() {
        return colIndexAndColName;
    }
}
