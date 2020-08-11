package dac;

import java.util.Scanner;

public class Markets {
	public void mar() {
		int option;
		String markets[] = {"Kovai Market", "Poonamalle market", "porur market", "koyembedu market", "Thandalam market","Adyar vegetables and fruits Market",
				           "ambattur market", "Avadi market"};
		
		do {
			 System.out.println("Enter your option");
			 System.out.println("1. CERTIFIED");
			 System.out.println("2. NON-CERTIFIED");
			 System.out.println("3. GO BACK");
	        System.out.println("Enter \"1\", \"3\" or \"2\"");
	        @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
	        
	        option = sc.nextInt();

	        switch (option)
	        {
	            case 1:
	            	System.out.println(markets[0]);
	            	System.out.println(markets[3]);
	            	System.out.println(markets[4]);
	            	System.out.println(markets[5]);
	            	System.out.println(markets[7]);
	            	
	            	break;
	            case 2: 
	            	System.out.println(markets[1]);
	            	System.out.println(markets[2]);
	            	System.out.println(markets[6]);
	            	
	            	
	            	;
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


