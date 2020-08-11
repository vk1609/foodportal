package validation;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidation {
	@SuppressWarnings("resource")
	public String Email(){
		System.out.println(" ENTER YOUR  EMAIL-ID: ");
		Scanner sc = new Scanner(System.in);
		String eMail = sc.nextLine();
		if(isvalidEmail(eMail)) {
			return eMail;
		}
		else {
			System.out.println("\tPlease Enter Valid EmailId");
			return Email();
		}
	}
	public static boolean isvalidEmail(String eMail) {
		String emailRegex ="^[A-Za-z0-9+_.]+@(.+)$";

		Pattern pattern = Pattern.compile(emailRegex);
		if(eMail == null) 
			return false;
		return pattern.matcher(eMail).matches();
	}

}
