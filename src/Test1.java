class A
{
	static
	{
		System.out.println("Static A");
	}
}

class B
{
	static
	{
		System.out.println("Static B");
	}
}
public class Test1 {
	
	static
	{
		System.out.println("Static C");
	}

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub

		Class.forName("A");
		Class.forName("B");
	}

}

/* Ques: three classes A,B,C which contain static blocks, But only A contains main method, I want to execute all classes
 * static block, what is the solution?
 * Ans: you need to use Class.forName() method inside the main block in class A to execute static block of other two classes._
 */ 
