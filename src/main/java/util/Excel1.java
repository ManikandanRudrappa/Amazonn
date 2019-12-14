package util;

	import java.io.IOException;

	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	

import base.ProjectSpecificMethods;

	public class Excel1 extends ProjectSpecificMethods
	{
		public  String[][] readExcel(String NewFileName) throws IOException
		{
			XSSFWorkbook book = new XSSFWorkbook("./data/"+NewFileName+".xlsx");
			XSSFSheet sheetname = book.getSheet("Sheet1");
			int RowCount = sheetname.getLastRowNum();
			short ColCount = sheetname.getRow(0).getLastCellNum();
			String[][] data = new String[RowCount][ColCount];
			for(int i =1; i<=RowCount; i++)
			{
				XSSFRow row = sheetname.getRow(i);
				for (int j=0;j<ColCount;j++)
				{
					XSSFCell col = row.getCell(j);
					
					
					String col1 = col.getStringCellValue();
					data[i-1][j]=col1;
					//System.out.println(col1);
					
				}
			}
				
			
			return data;
			
		}

	}



