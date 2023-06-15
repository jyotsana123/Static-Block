
public class Test {
	
	{
		System.out.println("Instance block 1");
	}
	
	{
		System.out.println("Instance block 2");
	}

	static
	{
		System.out.println("Static block 1");
	}
	
	static
	{
		System.out.println("Static block 2");
	}
	
	Test()
	{
		System.out.println("0-args constructor");
	}
	
	Test(int a)
	{
		System.out.println("1-args constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Test();
		new Test(5);
	}

}
