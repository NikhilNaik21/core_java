/*2.Write a package for Games, which have two classes Indoor and Outdoor.  Use a function 
display () to generate the list of players for the specific games. 
Use Parameter less and parameterized constructors. */
package Games;
import java.util.Scanner;

class Indoor
{
	Scanner in = new Scanner(System.in);
	String  chess;
	String name1;
	String name2;
	public Indoor()
	{
	}
	public Indoor(String  name1 ,String name2 )
	{
		this.name1=name1;
		this.name2=name2;
	
	}
	
	public void display()
	{
		System.out.println("Chess Team");
		System.out.println("Player 1 = "+name1);
		System.out.println("Player 2 = "+name2);

	}
}


class outdoor 
{
	Scanner in = new Scanner(System.in);
	String  cricket;
	String P1;
	String P2;
	String P3;
	
	public outdoor(String  P1 ,String P2,String P3 )
	{
		this.P1=P1;
		this.P2=P2;
		this.P3=P3;
	
	}
	public void display()
	{
		
		System.out.println("cricket Team");
		System.out.println("Player 1 = "+P1);
		System.out.println("Player 2 = "+P2);
		System.out.println("Player 3 = "+P3);
		
	}
}

public class Question2 {

	public static void main(String[] args) 
	{	Scanner in = new Scanner(System.in);
	
	
	System.out.println("Enter name of chess player");

		System.out.println("1.chess team\n2.cricket team\nEnter choice");
		int choice =Integer.parseInt(in.nextLine());
		
		
		
		if(choice==1)
		{
			Indoor obj = new Indoor("Nikhil" , "Sham");
			obj.display();
		}
		else if (choice==2)
		{
			outdoor obj1 = new outdoor("RAM","MOHAN","ROHAN");
			obj1.display();
		}
				

	}

}
