package project2_login;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class P2_LoginDetails {

	
	public static String firstname;
	public static String lastname;
	public static String emailid;
	public static String moblienumber;
	public static String pincode;
	public static String state;
	public static String address;
	
	public static String cardnum;
	public static String expmonth;
	public static String expyear;
	public static String cvv;
	public static String nameoncard;
	

	
	public static void testdata() throws EncryptedDocumentException, IOException
	{
		FileInputStream f1=new FileInputStream("C:\\Users\\udupa\\eclipse-Selenium\\selenium\\TestData\\AmazonData.xlsx");
	    Workbook w1=WorkbookFactory.create(f1);
	    
	    firstname=w1.getSheet("goibibo_testdata").getRow(1).getCell(0).getStringCellValue();
	    lastname=w1.getSheet("goibibo_testdata").getRow(1).getCell(1).getStringCellValue();
	    emailid=w1.getSheet("goibibo_testdata").getRow(1).getCell(2).getStringCellValue();
	    double moblienumber1=w1.getSheet("goibibo_testdata").getRow(1).getCell(3).getNumericCellValue();
	    moblienumber=NumberToTextConverter.toText(moblienumber1);
	    double pincode1=w1.getSheet("goibibo_testdata").getRow(1).getCell(4).getNumericCellValue();
	    pincode=NumberToTextConverter.toText(pincode1);
	    state=w1.getSheet("goibibo_testdata").getRow(1).getCell(5).getStringCellValue();
	    address=w1.getSheet("goibibo_testdata").getRow(1).getCell(6).getStringCellValue();
	    
	    double cardnum1=w1.getSheet("goibibo_testdata").getRow(6).getCell(0).getNumericCellValue();
	    cardnum=NumberToTextConverter.toText(cardnum1);
	    double expmonth1=w1.getSheet("goibibo_testdata").getRow(6).getCell(1).getNumericCellValue();
	    expmonth=NumberToTextConverter.toText(expmonth1);
	    double expyear1=w1.getSheet("goibibo_testdata").getRow(6).getCell(2).getNumericCellValue();
	    expyear=NumberToTextConverter.toText(expyear1);
	    double cvv1=w1.getSheet("goibibo_testdata").getRow(6).getCell(3).getNumericCellValue();
	    cvv=NumberToTextConverter.toText(cvv1);
	    nameoncard=w1.getSheet("goibibo_testdata").getRow(6).getCell(4).getStringCellValue();
	}
}
