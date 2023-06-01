package day2;

import java.util.Scanner;

public class WhileLoopExample {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		//sub1 = scan.nextDouble();
		System.out.println("Input");
		String ans = scan.next();
		if(ans.equals("YES"))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		int i=5;	
		while(i>0)
		{	
			System.out.println("CDAC "+i);
			i--;
		}	
		
		
		
		
	}

}
