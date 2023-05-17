/*Write a program create super class as Student with member variable
Roll_No Name of students and Total_Marks of students.

create sub class Marks with mebmer variable as percentage
calculate percentage=Total_Marks/3;
(Assume 3 is number of subjects)*/




package Exam;
import java.util.Scanner;
class Student
{
	Scanner in = new Scanner(System.in);
	private int Roll_No;
	private String name;
	private int total_marks;
	int sub1,sub2,sub3;
	
	public void set_data()
	{
		System.out.println("Enter Roll Number");
		setRoll_No(Integer.parseInt(in.nextLine()));
		
		System.out.println("Enter name");
		setName(in.nextLine());
		
		System.out.println("marks in science");
		sub1 =Integer.parseInt(in.nextLine());
		
		System.out.println("marks in Maths");
		sub2 =Integer.parseInt(in.nextLine());
		
		System.out.println("marks in java");
		sub3 =Integer.parseInt(in.nextLine());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll_No() {
		return Roll_No;
	}

	public void setRoll_No(int roll_No) {
		Roll_No = roll_No;
	}

	public int getTotal_marks() {
		return total_marks;
	}

	public void setTotal_marks(int total_marks) {
		this.total_marks = total_marks;
	}
}

class marks extends Student
{
	int total_marks;
	private float percentage;
	public void set_data()
	{
		super.set_data();
	 total_marks = sub1 +sub2+sub3;
		percentage = total_marks/3;
	}
	
	public void getdata()
	{System.out.println();
		System.out.println(super.getName()+ "\t" + super.getRoll_No() + "\t" +total_marks +"\t"+ percentage);
	}
}
public class Q1 {

	public static void main(String[] args) {
		marks obj = new marks();
		obj.set_data();
		System.out.println();
		System.out.print("NAME   ROLL NUM  TOTAL PERCENTAGE");
		obj.getdata();

	}

}
