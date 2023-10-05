package com.Day1Pune;

public class StrongNumber {
	
	static boolean isStrong(int num)
	{
		int sum=0;
		int no = num;
		while(no>0)
		{
			int digit = no%10;
			sum = sum + fact(digit);
			no/=10;
		}
		
		return sum==num;
	}
	
	 static int fact(int data)
	{
//		 if(data==0) {
//			 return 1;
//		 }
		int fact=1;
		for(int i =data;i>1;i--)
		{
		fact *=i;
		}
		return fact;
	}
	public static void main(String[] args) {
		for(int j=1;j<=100000;j++)
		{
			if(isStrong(j))
			{
				System.out.println(j);
			}
		}

	}

}
