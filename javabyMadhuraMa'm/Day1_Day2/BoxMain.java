package D2;
import java.util.Scanner;


public class BoxMain {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter box dimensions ");
		System.out.println("Enter width: ");
		double width=in.nextDouble();
		
		System.out.println("Enter height: ");

		double height=in.nextDouble();
		
		System.out.println("Enter depth: ");

		double depth=in.nextDouble();
		
		System.out.println("Enter side of cube");
		double side =in.nextDouble();
		Box b1 = new Box(width,height,depth);
		Box B2 =new Box(side);
		System.out.println(b1.getBoxDims());
		System.out.printf("%.2f",b1.computeVolume());
  
		
		in.close();
	}

}
