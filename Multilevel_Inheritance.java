import java.text.DecimalFormat;
import java.util.Scanner;
class Customer
{
	Scanner in = new Scanner(System.in);
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone_num() {
		return Phone_num;
	}

	public void setPhone_num(String phone_num) {
		Phone_num = phone_num;
	}

	private String name ;
	private String Phone_num;
	
	public void setdata()
	{
		System.out.println("Enter Name :");
		name=in.nextLine();
		
		System.out.println("Enter Phone_num :");
		Phone_num=in.nextLine();
		
		
	}
}

class Depositor extends Customer
{
	public String getAccNum() {
		return AccNum;
	}

	public void setAccNum(String accNum) {
		AccNum = accNum;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	private String AccNum;
	private int balance;
	
	public void setdata()
	{
		super.setdata();
		System.out.println("Enter AccNum :");
		AccNum=in.nextLine();
		
		System.out.println("Enter Balance:");
		balance=Integer.parseInt(in.nextLine());	
	}
}
class Borrower extends Depositor
{
	private String loan_no;
	private int loan_amt;
	public void setdata()
	{
		super.setdata();
		System.out.println("Enter loan_no :");
		loan_no=in.nextLine();
		
		System.out.println("Enter loan_amt :");
		loan_amt=Integer.parseInt(in.nextLine());	
	}
	public void getdata()
	{
		System.out.println();
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.printf("%-10s %10s %10s %10s %10s %10s" ,super.getName(), super.getPhone_num(), super.getAccNum(),super.getBalance(),loan_no,loan_amt);
	}	
}
public class Q3 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int size;
		System.out.println("Enter size of array : ");
		size = Integer.parseInt(in.nextLine());
		Borrower arr[]= new Borrower[size];
		
		for(int i=0;i<size;i++)
		{
			arr[i]=new Borrower();
			arr[i].setdata();
		}
		System.out.println();
		System.out.printf("%-10s %10s %10s %10s %10s %10s","NAME", "PHONE NUM", "ACC NUM", "BALANCE", "LOAN NUM", "LOAN AMT");
		for(int i=0;i<size;i++)
		{
			
			arr[i].getdata();
		}

	}

}
