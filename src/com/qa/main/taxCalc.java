package com.qa.main;

public class taxCalc {
	
	public int taxBracket(int wage){
		
		if (wage < 14999){
			System.out.println("You will be taxed 0%! Prolitariats dream");			
		}else if (wage >= 15000 && wage <= 19999 ){
			System.out.println("First tax bracket! 10%");
		}
		else if (wage >= 20000 && wage <= 29999){
			System.out.println("Second tax bracket! 15%");
		}else if(wage >= 29999 && wage <= 44999){
			System.out.println("Third tax bracket! 20%");
		}else if (wage >= 44999){
			System.out.println("C-c-c-combo:  25% ");
		}
		
		
		
		return 0; 
	}
	
public double taxCalculated(int wage){
	
	double processedWage = 0.0;
	
		if (wage < 14999){
			System.out.println("You will be taxed 0%! Prolitariats dream");	
			System.out.println("no tax no calc needed");
			
			
		}else if (wage >= 15000 && wage <= 19999 ){
		    processedWage = wage * 0.1;
			System.out.println("Your losses due to th-taxation: " + processedWage);
			double returnWage = wage - processedWage;
			System.out.println("Your wage now big gov has had its slice: "+ returnWage);
			return returnWage; 
			
		}
		else if (wage >= 20000 && wage <= 29999){
			processedWage = wage * 0.15;
			System.out.println("Your losses due to the gov wanting a cut: " + processedWage);
			double returnWage = wage - processedWage;
			System.out.println("Your wage now is : " +returnWage);
			return returnWage;
			
		}else if(wage >= 29999 && wage <= 44999){
			processedWage = wage *0.20;
			System.out.println("Government wants this cut of your wage: "+ processedWage);
			double returnWage = wage - processedWage;
			System.out.println("Your wage now is : "+ returnWage);
			return returnWage; 
			
		}else if (wage >= 44999){
			processedWage = wage * 0.25;
			System.out.println("You're wage gets the chop: " +processedWage);
			double returnWage = wage - processedWage; 
			System.out.println("Your wage now is : " + returnWage);
			return returnWage; 
			
		}
		
		
		
		return 0.0; 
	}
	
	

}
