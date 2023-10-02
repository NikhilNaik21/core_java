package com.Day1Pune;

public class RepeatingAndMissingNum {   

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,6,3};
		int repeatingNum = -1;
		int MissingNum = -1;
		
		for(int i=0;i<arr.length;i++)
		{
			int index =  Math.abs(arr[i])-1;
			if(arr[index]>0) {
			arr[index]=-arr[index];
			}
			else
			{
				repeatingNum = Math.abs(arr[i]);
			}
			
			
		}
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
				MissingNum =i+1;
				break;
			}
		}
		System.out.println("repeating ="+repeatingNum);
		System.out.println("Missing ="+ MissingNum);
	}
}
