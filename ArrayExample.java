package day2;
import java.util.Scanner;
public class Array 
{
	public static void main(String[] args) 
	{ 
	Scanner in=new Scanner(System.in);
int i=1,n,array1[],array2[],array3[],k=0,j=0,m=0;
	array1=new int[5];
	array2=new int[5];
	array3=new int[5];
	
	System.out.println("Enter 10 Number");
	while(i<=10)
	{
		System.out.println("Enter Number");
		n=in.nextInt();
		if(n>=1 && n<=100)
		{
			array1[k]=n;
			k++;
		}
		else
			if(n>=101 && n<500)
			{
			array2[j]=n;
			j++;
			}
			else
			{
			array3[m]=n;
			m++;
			}			
		i++;
	}
	System.out.println("ARRAY1");
	for(i=0;i<k;i++)
	{
		System.out.println("a1["+i+"]="+array1[i]);
	}
	System.out.println("ARRAY2");
	for(i=0;i<j;i++)
	{
		System.out.println("a2["+i+"]="+array2[i]);
	}
	System.out.println("ARRAY3");
	for(i=0;i<m;i++)
	{
		System.out.println("a2["+i+"]="+array3[i]);
	}
	}
}
