package validation;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MobileValidation {

	public String Mobile(){
		System.out.println(" ENTER YOUR MOBILE NUMBER: ");
		Scanner sc = new Scanner(System.in);
		String mNumber = sc.nextLine();
		if(isvalidMobile(mNumber)) {
			return mNumber;
		}
		else {
			System.out.println("\tPlease Enter Valid EmailId");
			return Mobile();
		}
	}
	public static boolean isvalidMobile(String mNumber) {
		String mNumberRegex ="^[789]\\d{9}$";
	
		Pattern pattern = Pattern.compile(mNumberRegex);
		if(mNumber == null) 
			return false;
		return pattern.matcher(mNumber).matches();
	}
}
