package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import validation.EmailValidation;
import validation.MobileValidation;



public class registerOperations {
	public void register() throws IOException{
		List<UserDetails> list = new ArrayList<UserDetails>();
		System.out.println("Enter Your Details :");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER YOUR  NAME:");
		String userName = sc.nextLine();
		System.out.println("ENTER YOUR CITY NAME :");
		String  city= sc.nextLine();
		EmailValidation ev = new EmailValidation();
		String eMail = ev.Email();
		System.out.println("ENTER YOUR  GENDER:");
		String gender = sc.nextLine();
		MobileValidation mv = new MobileValidation();
		String mNumber = mv.Mobile();
		System.out.println("WELCOME TO THE FOOD PORTAL OF CHENNAI");
		System.out.println("YOU NAME" +"  "+ userName);
		System.out.println("YOU CITY"+ "  "+city);
		System.out.println("YOU EMAIL-ID"+"  "+ eMail );
		System.out.println("YOU GENDER"+"  "+ gender);
		System.out.println("YOU MOBILE-NUMBER "+"  "+ mNumber);
    
		

		
		UserDetails user = new UserDetails(userName, city, eMail, gender, mNumber);
		list.add(user);
		
		File myFile = new File("V:\\EXCEL\\userDetails.xlsx");
		FileInputStream fis = new FileInputStream(myFile);
		XSSFWorkbook myWorkBook= new XSSFWorkbook(fis);
		XSSFSheet sheet=myWorkBook.getSheetAt(0);
		int rownum= sheet.getLastRowNum();
		for(UserDetails user1 : list ) {
			Row row = sheet.createRow(++rownum);
			createList(user1 , row);

		}
		FileOutputStream fos=new FileOutputStream(myFile);
		myWorkBook.write(fos);
	}
		
	private void createList(UserDetails user1, Row row) {
		Cell cell = row.createCell(0);
		cell.setCellValue(user1.getUserName());
		
		cell = row.createCell(1);
		cell.setCellValue(user1.getCity());
		
		cell = row.createCell(2);
		cell.setCellValue(user1.geteMail());
		
		cell = row.createCell(3);
		cell.setCellValue(user1.getGender());
		cell = row.createCell(4);
		cell.setCellValue(user1.getmNumber());
	}

}
