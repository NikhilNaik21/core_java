package com.iopackage.q1;

import java.util.Date;
import java.util.Scanner;

public class CopFileMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the source file : ");
		String source = sc.nextLine();
		
		System.out.println("Enter the destination file : ");
		String dest = sc.nextLine();
		
		CopyFileFromSrcToDest obj = new CopyFileFromSrcToDest();
		Date d = new Date();
		System.out.println("File copy started at : " + d);
		obj.CopyFileFromSrcToDest(source,dest);
		d = new Date();
		System.out.println("File copy ended at : " + d);
		
	}
}
