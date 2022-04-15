package calculator;

import java.util.*; 
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class App {
	private static final Logger logger = LogManager.getLogger(App.class);
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		int opn, flag=0;
		double num, exp;
		int numm;
		System.out.println("------------ Calc+--------------");
		System.out.println("------------ WELCOME TO CALC+ --------------");

		do{
			System.out.println("Select what you want to do:");
            System.out.println("");
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Log");
            System.out.println("4. Power");
            System.out.println("5. Exit");
			System.out.println("");
            System.out.print("Select operation : ");
			System.out.println("");
			opn = reader.nextInt();
			if(opn==5) flag = 1;
			else{				
				switch(opn){
					
					case 1:  // Square Root
						System.out.println("Let's do a Square Root!!");
						System.out.println("");
						System.out.print("Enter number: ");
						num = reader.nextDouble();
						find_square_root(num);
					break;

					case 2: //Factorial
						System.out.println("Let's do a Factorial!!");
						System.out.println("");
						System.out.print("Enter number: ");
						numm = reader.nextInt();
						find_factorial(numm);
					break;

					case 3: //Natural Log
						System.out.println("Let's do a Natural Log!!");
						System.out.println("");
						System.out.print("Enter number: ");
						num = reader.nextDouble();
						find_naturalLog(num);
					break;

					case 4: //Power
						System.out.println("Let's do a Raise to!!");
						System.out.println("");
						System.out.print("Enter number: ");
						num = reader.nextDouble();
						System.out.print("Answer : ");
						exp = reader.nextDouble();
						find_power(num,exp);
					break;

					default: 
						System.out.println("Please enter a valid input !!!...");
						logger.info("Invalid number");
					}
				}		
		    }while(flag == 0);
		}

	public static double find_square_root(double num){
		if(num <=0){
			System.out.println("Enter a positive number");
			logger.info("Error in Square Root function");
			return -1.0;
		}
		double c = Math.sqrt(num);
		System.out.println("");
		System.out.println("The Square Root is "+c);
		System.out.println("");
		logger.info("SQUARE ROOT");
		return c;
	}

	public static int find_factorial(int num){
	    int c = num ;
		if(c == 0) return 1;
		if(num <=0){
			System.out.println("Enter a positive number");
			logger.info("Error in factorial function");
			return -1;
		}
		for(int i=num-1; i>=1; i--) c = c*i;
		System.out.println("");
		System.out.println("The Factorial is "+c);
		System.out.println("");
		logger.info("FACTORIAL");
		return c;
	}
	public static double find_naturalLog(double num){
		if(num <=0){
			System.out.println("Enter a positive number");
			logger.info("Error in log function");
			return -1.0;
		}
		double c = Math.log(num);	
		System.out.println("");
		System.out.println("The Logarithm is "+ c);
		System.out.println("");
		logger.info("LOGARITHM");
		return c;
	}
	  public static double find_power(double num, double exp){
		double c = Math.pow(num,exp);
		System.out.println("");
		System.out.println("The Raised to power is "+ c);
		System.out.println("");
		logger.info("RAISE TO");
		return c;
	}

}
