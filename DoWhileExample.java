package day2;

import java.util.Scanner;

public class doWhileExample {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int x = 20;
		
		System.out.println("How many elements");
		int n = scan.nextInt();
		
		int arry[] = new int[n];		
		
		
		for(int i=0;i<arry.length;i++)
		{
			System.out.println("Enter Value...");
			arry[i] = scan.nextInt();
			
		}
		
		for(int i=0;i<arry.length;i++)
			System.out.println(arry[i]);
			
		
		
		
		
		int arry1[] = new int[4];		
		
		arry1[0] = 100;
		arry1[1] = 200;
		arry1[2] = 300;
		arry1[3] = 400;
		
		System.out.println(arry[0]);
		System.out.println(arry[1]);
		System.out.println(arry[2]);
		System.out.println(arry[3]);
		
		
		for(int i=0;i<10;i++)
		{
			
			System.out.println("CDAC..."+i);
			
		}
		
		int no = 0;
		do
		{
			System.out.println("CDAC...");
			//no--;
			no = no-1;
		}while(no>0);
		
		
		
		
		
	}

}
