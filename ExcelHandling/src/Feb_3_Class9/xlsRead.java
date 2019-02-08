package Feb_3_Class9;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class xlsRead {
	
	
	public static void main(String[] args) throws BiffException, IOException {
		
		
		File f = new File("C:\\Users\\Sadia Shah\\Desktop\\Ahtisham\\Feb3.xls");
		Workbook wk = Workbook.getWorkbook(f);
		Sheet ws = wk.getSheet(0);
		int r = ws.getRows();
		int c = ws.getColumns();
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				Cell c1 = ws.getCell(j,i);
				System.out.println(c1.getContents());
			}
		}
		
		
	}

}
