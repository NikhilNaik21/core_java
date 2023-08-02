//program to count the words in file
package com.iopackage.q5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountOfWords {
	
	public static void wordCount(String file)
	{
		int count =0;
		try(FileReader reader = new FileReader(file);
			BufferedReader buf = new BufferedReader(reader);)
		{
			String x;
			
			while((x = buf.readLine()) != null)
			{
				String words[] = x.split(" ");
				count = count + words.length;
			}
			System.out.println("Count of words are : "+count);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the file name you want to count words : ");
		String file = sc.nextLine();
		
		wordCount(file);	
	}
}
