package javaGen;
class Test<T>
{
	T obj;
	
	Test(T obj)
	{
		this.obj=obj;
	}
	
	public T getObject()
	{
		return this.obj;
	}
}
public class GenericsExample {

	public static void main(String[] args) {
		//instance of integer type
		Test<Integer> iObj = new Test<Integer>(15);
		System.out.println(iObj.getObject());
		
		//instance of String type
		
		Test<String> sObj =new Test<String>("METCDAC");
		System.out.println(sObj.getObject());

	}

}
