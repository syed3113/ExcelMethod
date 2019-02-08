package Feb_3_Class9;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class xlsUserInput {
	
	
	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter value");
		String s = sc.next();
		
		File f = new File("C:\\Users\\Sadia Shah\\Desktop\\Ahtisham\\Input.xls");
		WritableWorkbook ww = Workbook.createWorkbook(f);
		WritableSheet ws = ww.createSheet("Syed",0);
		for(int i=0;i<5;i++)
		{
			
			for (int j=0;j<5;j++) {
				
				Label l = new Label(j,i,s);
				ws.addCell(l);
			}
		}
		ww.write();
		ww.close();
		
		
		
		
	}

}
