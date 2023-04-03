package first.java;

class Test
{
	public void show()
	{
		System.out.println("HI from method");
	}
}
public class TestObject {
	public static void main(String[] args) {
		Test xyz=new Test();
		xyz.show();
		System.out.println("Hi from main");
	}
}
