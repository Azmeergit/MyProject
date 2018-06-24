package stealjobs;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Number;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Testxls {

	public static void main(String[] args) throws Exception, IOException {
File f=new File("Book1.xls");
Workbook rwb=Workbook.getWorkbook(f);

Sheet rsh=rwb.getSheet(0);
int nour=rsh.getRows();
WritableWorkbook wwb=Workbook.createWorkbook(f,rwb);
WritableSheet wws=wwb.getSheet(0);
for(int i=1;i<nour;i++)
{
	int x=Integer.parseInt(rsh.getCell(0, i).getContents());
	int y=Integer.parseInt(rsh.getCell(1, i).getContents());
	int z=x+y;
	Number n=new Number(2,i,z);
	wws.addCell(n);
}
wwb.write();
rwb.close();
wwb.close();
	}

}
