package may22nd;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		

		FileInputStream fis=new FileInputStream("D:\\Batches\\kosmikbatch9am\\Sample.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		
		//Case 1 Mofying an existing cell
		
		//ws.getRow(0).getCell(1).setCellValue("John");
		
		//Case 2 creating a new cell in existing Row
		
		//ws.getRow(1).createCell(3).setCellValue("Passed");
		
		//Case 3
		
		ws.createRow(4).createCell(0).setCellValue(false);
		
				
		FileOutputStream fos=new FileOutputStream("D:\\Batches\\kosmikbatch9am\\Sample.xlsx");
		
		
		wb.write(fos);
		
		wb.close();
		
		System.out.println("End of Program");
		
		

	}

}
