
public class Test3 {
	
	int a = 10;  //instance variable
	static int b=20;  //static variable
	
	void m1(int a)  //instance method
	{
		System.out.println("Instance method");
	}
	
	static void m2(String str)  //static method
	{
		System.out.println("Static method");
	}
	
	Test3()  //constructor
	{
		System.out.println("0-args constructor");
	}
	
	Test3(int a)  //constructor
	{
		System.out.println("1-args constructor");
	}
	
	{  //instance block
		System.out.println("Instance block");  
	}
	
	static  //static block
	{
		System.out.println("static block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test3 t = new Test3();
		Test3 t1 = new Test3();
		t.m1(10);
		Test3.m2("hello");
	}

}
