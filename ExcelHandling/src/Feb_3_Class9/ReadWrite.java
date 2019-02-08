package Feb_3_Class9;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class ReadWrite {
	
	public static void main(String[] args) throws BiffException, IOException, WriteException {
		
		File f = new File("C:\\Users\\Sadia Shah\\Desktop\\Ahtisham\\Feb3.xls");
		Workbook wk = Workbook.getWorkbook(f);
		
		File f1 = new File("C:\\Users\\Sadia Shah\\Desktop\\Ahtisham\\Feb9.xls");
		WritableWorkbook wk1 = Workbook.createWorkbook(f1);
		WritableSheet ws = wk1.createSheet("Syed",0);
		Sheet ws1 = wk.getSheet(0);
		int r = ws1.getRows();
		int c = ws1.getColumns();
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				
				Cell c1 = ws1.getCell(j,i);
				System.out.println(c1.getContents());
				Label l = new Label(j,i,c1.getContents());
				ws.addCell(l);
			}
		
	}
		wk1.write();
		wk1.close();
	}
	
	
	
	

}
