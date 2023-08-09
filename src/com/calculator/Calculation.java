package com.calculator;

import java.util.Scanner;

public class Calculation  implements Demo{
	
	
	int num1;
	int num2;
	int sum;
	

	Scanner sc= new Scanner(System.in);
	
	

	
	
	@Override
	public int Addition() {
		try {
		
		System.out.println("Enter first number");
		num1= sc.nextInt();
         } catch(Exception e){
			
			System.out.println("Please add only number " );
         }
		try {
		System.out.println("Enter Second number");
		num2= sc.nextInt();
		}
	    catch(Exception e){
		
		System.out.println("Please add only number " );
     }
		
		sum = num1+num2;
		System.out.println("Addition of two number is " );
		
		return sum;
	}

	@Override
	public int Substraction() {
		System.out.println("Enter first number");
		num1= sc.nextInt();
		System.out.println("Enter Second number");
		num2= sc.nextInt();
		sum = num1-num2;
	
			System.out.println("Substraction of number is" );
			return sum;
		
		}
		
		
		@Override
	public int Mul() {
		System.out.println("Enter first number");
		num1= sc.nextInt();
		System.out.println("Enter Second number");
		num2= sc.nextInt();
		
		sum = num1*num2;
		System.out.println("Multiplication of two number is " );
		return sum;
	}

	@Override
	public int Div() {
		System.out.println("Enter first number");
		num1= sc.nextInt();
		System.out.println("Enter Second number");
		num2= sc.nextInt();
		
		sum = num1/num2;
		System.out.println("Division of two number is " );
		return sum;
	}
	
	
	

	@Override
	public int Modules() {
		System.out.println("Enter first number");
		num1= sc.nextInt();
		System.out.println("Enter Second number");
		num2= sc.nextInt();
		
		sum = num1%num2;
		System.out.println("The module is " );
		return sum;
	}

	@Override
	public int Square() {
		System.out.println("Enter number");
		num1= sc.nextInt();
		
		
		sum = num1*num1;
		System.out.println("The square is " );
		return sum;
	}

	@Override
	public int Cube() {
		System.out.println("Enter number");
		num1= sc.nextInt();
		
		
		sum = num1*num1*num1;
		System.out.println("The cube is " );
		return sum;
	}

	@Override
	public int Average() {
		System.out.println("Add the number for average ");
		num1= sc.nextInt();
		System.out.printf("Enter your %d number \n" , num1);
		double average =0;
		for(int i=1; i<=num1; i++) {
			
			average+=num1;
		}
		System.out.println("Average of number is " +num1+ " is :" +average/num1);
		
		return 0;
	}

	@Override
	public int Factor() {
		System.out.println("Enter the number for Factor : ");
		num1= sc.nextInt();
		System.out.printf("The factor of %d is : \n" , num1);
		for(int i=1;i<=num1;i++){
			if(i%2==0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		return num1;
	}

	@Override
	public int EvenOdd() {
		System.out.println("Enter the number to check number is even or odd : ");
		num1= sc.nextInt();
		if (num1%2 ==0)
		{
			
			System.out.println(" number is even ");
		}
		else 
		{
			System.out.println(" number is odd");
		}
		return num1;
	}
	
	public void Cal()
	{
		boolean loop= true;
		System.out.println("----------------Caclulator----------------");
		
		System.out.println(" Here you can Perform :- \n  1 .Addition  \t\t 2.Substraction\n"
				+  "  3. Multiplication \t 4. Division\n "
				+ " 5. Module \t\t 6. Square \n "
				+ " 7. Cube \t\t 8. Average \n  "
				+ "9. Factor  \t\t 10.Even and odd\n  "
				+ "0. close ");
		System.out.println("------------------------------------------");
		do {
			
			
			System.out.println("Please select the calculation type here :-");
			String Operation=sc.next();
			
			
			switch (Operation) {
			case "0":
				loop=false;
				break;
			case "1" :
				System.out.println(Addition());
				break;
			case "2" :
				System.out.println(Substraction());
				break;
			case "3" :
				System.out.println(Mul());
				break;
			case "4" :
				System.out.println(Div());
				break;
			case "5" :
				System.out.println( Modules());
				break;
			case "6" :
				System.out.println( Square());
				break;
			case "7" :
				System.out.println( Cube());
				break;
			case "8" :
				System.out.println( Average());
				break;
			case "9" :
				System.out.println( Factor());
				break;
			case "10" :
				System.out.println( EvenOdd());
				break;
				default:
					System.out.println("Invalid statement");
					break;
			}
			System.out.println("------------------------------------------");
		}
			while(loop);
		}
	

}
	
	

