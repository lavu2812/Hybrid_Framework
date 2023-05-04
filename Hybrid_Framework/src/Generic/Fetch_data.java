package Generic;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_data 
{
	public static String get_data(String sh,int r,int c) 
	{
		String value=null;
		try 
		{
			FileInputStream fis1 = new FileInputStream("/.Excel/testdata.xlsx");
			Workbook book = WorkbookFactory.create(fis1);
			Sheet sheet=book.getSheet(sh);
			Row row = sheet.getRow(r);
			Cell cell = row.getCell(c);
			value=cell.toString();
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}


		return value;
	}


}
