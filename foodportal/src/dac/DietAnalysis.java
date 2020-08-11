package dac;

import java.util.Scanner;

public class DietAnalysis {
	@SuppressWarnings("resource")
	public void das() {
		
		 Scanner input = new Scanner(System.in);

	        double weight;
	        int feet;
	        int inches;

	        System.out.print("Enter weight in kilo: ");
	        weight = input.nextFloat();

	        System.out.print("Enter feet: ");
	        feet = input.nextInt();

	        System.out.print("Enter inches: ");
	        inches = input.nextInt();


	       
	        double heightInMeters = (((feet * 12) + inches) * .0254);
	        double bmi = weight / Math.pow(heightInMeters, 2.0);
	        System.out.println("Your BMI is: " + bmi);

	      
	        if (bmi < 18.5 ) {
	            System.out.println("Underweight");
	            System.out.println("you have to eat more dude!!!");
	        }

	        else if (bmi >= 18.5 && bmi < 25) {
	            System.out.println("Normal");
	            System.out.println("your diet was good dude!!");
	        }

	        else if (bmi >= 25 && bmi < 30) {
	            System.out.println("Overweight");
	            System.out.println("Control your diet dude!!");
	        }

	        else if (bmi >= 30) {
	            System.out.println("Obese");
	            System.out.println("DUDE!!!! STOP EATING AND DO EXERCISE");
	        }
	        NavigationMenu mn = new NavigationMenu();
			mn.menu();

	       

	}
	
}
