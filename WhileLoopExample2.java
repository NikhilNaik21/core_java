package day2;

import java.util.Scanner;

public class WhileLoopExample2 {

	public static void main(String[] args) 
	{
		double percentage;
		int attemp = 1;
		//boolean flag = true;
		while(true)
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Percentage..");	
			percentage = scan.nextDouble();
			
			if(percentage<=0 || percentage >100)
			{
				System.out.println("Invalid Input..");
				
			}else if (percentage >=70 && percentage <=100)
			{
				System.out.println("Distinction..");
				break;
			}
				else if ((percentage >=60)&& (percentage <70))
				{
					System.out.println("First Class..");
					break;
				}
			else if ((percentage >50)&& (percentage <=55))
			{
				System.out.println("Second Class..");
				break;
			}	
			else if ((percentage >55)&& (percentage <=59.99))
			{
				System.out.println("Higher Second Class..");
				break;
			}	
				else if (percentage < 35)
				System.out.println("Fails..");
			attemp++;	
			
			
		}
		System.out.println("Passed with "+attemp+" Attemps");
		
	}
	}
	


