package dac;

import java.util.Scanner;


public class NavigationMenu {
	public void menu() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("here is the menu to choose");
		System.out.println("1.PRODUCTS");
	    System.out.println("2.RESTAURENTS");
	    System.out.println("3.MARKETS");
	    System.out.println("4.DIET ANALYSIS");
	    
	    int option;

	    do {
	        System.out.println("Enter \"1\", \"2\", \"3\" or \"4\"");
	        option = sc.nextInt();

	        switch (option)
	        {
	            case 1:
	            	Products p = new Products();
	            	p.pro();
	            	
	            	break;
	            case 2: 
	            	Restaurants r = new Restaurants();
	            	r.res();
	                break;
	            case 3: 
	            	Markets m = new Markets();
	            	m.mar();
	                break;
	            case 4 :
	            	DietAnalysis da = new DietAnalysis();
	            	da.das();
	            	break;
	            default:
	                System.out.println("Choice must be a value between 1 and 4.");
	        }   
	    } while (option != 4);
		
	}

}
