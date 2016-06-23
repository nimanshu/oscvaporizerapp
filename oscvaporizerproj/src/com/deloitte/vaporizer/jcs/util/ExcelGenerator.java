package com.deloitte.vaporizer.jcs.util;

import com.deloitte.vaporizer.siebel.bean.SeibelDataBO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelGenerator
{

	public static void writeXLSXFile(SeibelDataBO objBo,String path) throws IOException {

		String excelFileName = path+"\\VaporizerTest.xls";//name of excel file

		String sheetName = "Sheet1";//name of sheet	

		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet(sheetName) ;

		//iterating the Seibel Data Object

		HashMap<String,ArrayList<String>> objDataMap = objBo.getObjSeibelData();
		Set<String> objColumnName = objDataMap.keySet();

		Object[] array = objColumnName.toArray();
		Arrays.sort(array);

		HSSFRow colRow = sheet.createRow(0);

		for(int i=0;i<array.length;i++)
		{
			HSSFCell rowcell = colRow.createCell(i);
			rowcell.setCellValue((String)array[i]);
		}

		// Fetching Data from the Object

		String[][] rowData = null;
		int k = 0, m =1;

		for(int i=0;i<array.length;i++)
		{

			System.out.println("Column name : "+array[i]);
			ArrayList datalist = objDataMap.get(array[i]);

			for(int j=0;j<datalist.size();j++)
			{
				HSSFRow row = null;
				if(sheet.getRow(m)==null)
				{
					row = sheet.createRow(m);
				}
				else
				{
					row = sheet.getRow(m);
				}
				HSSFCell cell = row.createCell(k);
				cell.setCellValue((String)datalist.get(j));
				m++;
			}

			k++;

			if(m>datalist.size())
			{
				m=1;
			}
		}	

		FileOutputStream fileOut = new FileOutputStream(excelFileName);

		//write this workbook to an Outputstream.
		wb.write(fileOut);
		//fileOut.flush();
		fileOut.close();
	}


	public static void main(String[] args) throws IOException {

		SeibelDataBO objBo = new SeibelDataBO();

		HashMap<String,ArrayList<String>> objTableData = new HashMap<String,ArrayList<String>>();

		ArrayList<String> objDataArray = new ArrayList<String>();
		objDataArray.add("Data1");
		objDataArray.add("Data1");
		objDataArray.add("Data1");
		objDataArray.add("Data1");
		objDataArray.add("Data1");


		ArrayList<String> objDataArray2 = new ArrayList<String>();
		objDataArray2.add("Data2");
		objDataArray2.add("Data2");
		objDataArray2.add("Data2");
		objDataArray2.add("Data2");
		objDataArray2.add("Data2");

		ArrayList<String> objDataArray3 = new ArrayList<String>();
		objDataArray3.add("Data3");
		objDataArray3.add("Data3");
		objDataArray3.add("Data3");
		objDataArray3.add("Data3");
		objDataArray3.add("Data3");


		ArrayList<String> objDataArray4 = new ArrayList<String>();
		objDataArray4.add("Data4");
		objDataArray4.add("Data4");
		objDataArray4.add("Data4");
		objDataArray4.add("Data4");
		objDataArray4.add("Data4");


		ArrayList<String> objDataArray5 = new ArrayList<String>();
		objDataArray5.add("Data5");
		objDataArray5.add("Data5");
		objDataArray5.add("Data5");
		objDataArray5.add("Data5");
		objDataArray5.add("Data5");

		objTableData.put("Coloumn1", objDataArray);
		objTableData.put("Coloumn2", objDataArray2);
		objTableData.put("Coloumn3", objDataArray3);
		objTableData.put("Coloumn4", objDataArray4);
		objTableData.put("Coloumn5", objDataArray5);

		objBo.setObjSeibelData(objTableData);

		//writeXLSXFile(objBo);

		System.out.println("Excell Created .........");
	}
        
    public static SeibelDataBO work() throws IOException {

            SeibelDataBO objBo = new SeibelDataBO();

            HashMap<String,ArrayList<String>> objTableData = new HashMap<String,ArrayList<String>>();

            ArrayList<String> objDataArray = new ArrayList<String>();
            objDataArray.add("Data1");
            objDataArray.add("Data1");
            objDataArray.add("Data1");
            objDataArray.add("Data1");
            objDataArray.add("Data1");


            ArrayList<String> objDataArray2 = new ArrayList<String>();
            objDataArray2.add("Data2");
            objDataArray2.add("Data2");
            objDataArray2.add("Data2");
            objDataArray2.add("Data2");
            objDataArray2.add("Data2");

            ArrayList<String> objDataArray3 = new ArrayList<String>();
            objDataArray3.add("Data3");
            objDataArray3.add("Data3");
            objDataArray3.add("Data3");
            objDataArray3.add("Data3");
            objDataArray3.add("Data3");


            ArrayList<String> objDataArray4 = new ArrayList<String>();
            objDataArray4.add("Data4");
            objDataArray4.add("Data4");
            objDataArray4.add("Data4");
            objDataArray4.add("Data4");
            objDataArray4.add("Data4");


            ArrayList<String> objDataArray5 = new ArrayList<String>();
            objDataArray5.add("Data5");
            objDataArray5.add("Data5");
            objDataArray5.add("Data5");
            objDataArray5.add("Data5");
            objDataArray5.add("Data5");

            objTableData.put("Coloumn1", objDataArray);
            objTableData.put("Coloumn2", objDataArray2);
            objTableData.put("Coloumn3", objDataArray3);
            objTableData.put("Coloumn4", objDataArray4);
            objTableData.put("Coloumn5", objDataArray5);

            objBo.setObjSeibelData(objTableData);

            //writeXLSXFile(objBo);

            System.out.println("Excell Created .........");
            
            return objBo;
    }

}
