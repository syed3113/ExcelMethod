package Feb_3_Class9;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class xlsWrite {
	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		
	
	File f = new File("C:\\Users\\Sadia Shah\\Desktop\\Ahtisham\\Feb8.xls");
    WritableWorkbook wk = Workbook.createWorkbook(f);
    WritableSheet ws = wk.createSheet("Syed",0);
    for(int i=0;i<5;i++)
    {
    	for(int j =0;j<5;j++)
    	{
    		Label l = new Label(j,i,"Syed");
    		ws.addCell(l);
    	}
    }
    wk.write();
    wk.close();
	} 
}
