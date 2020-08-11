package dac;

import java.util.Scanner;

public class Restaurants {
	public void res() {
		int option;
		String restaurants[] = {"Havensampoorna","Madras Kitchen Company", "Willows Lounge Bar","The Reed", "Seasonal Tastes", "Pizaria Italiana",
	             "Sunset Grill", "Pan Asia", "Avarthana","Palm Sore",
	            "Barota Kadai", "Dosa KAdai", "Motal highway", "COAL BARBEQUE"};
		
		do {
			System.out.println("Enter your option");
			 System.out.println("1. CERTIFIED");
			 System.out.println("2. NON-CERTIFIED");
			 System.out.println("3. GO BACK");
	        System.out.println("Enter \"1\",\"3\" or \"2\"");
	        @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
	        
	        option = sc.nextInt();

	        switch (option)
	        {
	            case 1:
	            	System.out.println(restaurants[0]);
	            	System.out.println(restaurants[1]);
	            	System.out.println(restaurants[2]);
	            	System.out.println(restaurants[3]);
	            	System.out.println(restaurants[4]);
	            	System.out.println(restaurants[5]);
	            	System.out.println(restaurants[6]);
	            	System.out.println(restaurants[7]);
	            	System.out.println(restaurants[8]);
	            	System.out.println(restaurants[9]);
	            	System.out.println(restaurants[12]);
	            	System.out.println(restaurants[13]);
	            	
	            	break;
	            case 2: 
	            	System.out.println(restaurants[10]);
	            	System.out.println(restaurants[11]);
	            	
	                break;
	            case 3:
	            	NavigationMenu mn = new NavigationMenu();
	        		mn.menu();
	            
	            default:
	                System.out.println("Choice must be a value between 1 and 3.");
	        }   
	    } while (option != 3);
		
		
	}

}
