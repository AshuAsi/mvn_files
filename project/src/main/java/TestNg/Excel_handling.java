package TestNg;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_handling
{

	public static void main(String[] args) throws IOException 
	{
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet Sheet=workbook.createSheet("Doctors data1");
		String data [][]= {
				{"Doctors_id","Doctor_name","Specilization","Hospital_Name",},

				{"H002305","sharanya","mbbs","nims",},
				{"H002308","lasya","cardio","osmaniya",},
				{"H002890","praveen","mbbs","nims",},
				{"H002377","shushith","Anshithia","osmaniya",},
				{"H002305","swathi","cardio","GandhiHospital",},
		};
		int row=data.length;
		int col=data[0].length;
		for(int r=0;r<row;r++)
		{
			XSSFRow Rows=Sheet.createRow(r);
			for(int c=0;c<col;c++) 
			{
				XSSFCell Cells=Rows.createCell(c);
				Cells.setCellValue(data[r][c]);
			}
		}
FileOutputStream sos=new FileOutputStream("C:\\File_Handling\\excelhandle\\tending.xlsx");
		
workbook.write(sos);
workbook.close();
		
	}

}
