package D2;

import java.util.Scanner;

public class TextBoxEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 1st Box dims: ");
		Box b1= new Box(in.nextDouble(),in.nextDouble(),in.nextDouble());
		
		System.err.println("Enter 2nd Box dims: ");
		Box b2= new Box(in.nextDouble(),in.nextDouble(),in.nextDouble());
		
		System.out.println(b1.isEqual(b2)?"SAME":"DIFFERENT");
		in.close();
		
	}

}
