package com.deloitte.vaporizer.siebel.bean;

import java.util.ArrayList;
import java.util.HashMap;

public class SeibelDataBO
{

	public HashMap<String, ArrayList<String>> getObjSeibelData()
	{
		return objSeibelData;
	}

	public void setObjSeibelData(HashMap<String, ArrayList<String>> objSeibelData)
	{  
		this.objSeibelData = objSeibelData;
	}

	private HashMap<String,ArrayList<String>> objSeibelData;

	
}
