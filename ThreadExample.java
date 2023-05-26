package javaGen;

class MultiThreading extends Thread
{
	void show()
	{
		System.out.println("Show...");
	}
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
	}
}
public class ThreadExample {
		
	public static void main(String[] args) {
		MultiThreading obj = new MultiThreading();
		//with the help of start we call the run method i.e Thread started to run
		obj.start();
		obj.show();

	}

}
