package day2;

import java.util.Scanner;

public class CalculateGrade {

	public static void main(String[] args) 
	{
		double percentage;
		double sub1 = 50.60;
		double sub2 = 54.50;
		double sub3 = 51.70;
		
		percentage = (((sub1+sub2+sub3)*100)/300);
		System.out.println(percentage);
		
		if (percentage >=70)
			System.out.println("Distinction..");
		else if ((percentage >=60)&& (percentage <70))
			System.out.println("First Class..");
		else if ((percentage >50)&& (percentage <=55))
			System.out.println("Second Class..");
		else if ((percentage >55)&& (percentage <=59.99))
			System.out.println("Higher Second Class..");
		else if (percentage < 35)
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Re-exam (YES/NO)...??");
			String str = scan.next();
			if(str.equals("YES"))
			{
				System.out.println("Enter Percentage..");	
				percentage = scan.nextDouble();
				
				if (percentage >=70)
					System.out.println("Distinction..");
				else if ((percentage >=60)&& (percentage <70))
					System.out.println("First Class..");
				else if ((percentage >50)&& (percentage <=55))
					System.out.println("Second Class..");
				else if ((percentage >55)&& (percentage <=59.99))
					System.out.println("Higher Second Class..");
				
				
			}
			
			
			
		
		}
		
		
		
		
		
		
		
	}

}
