package garbageCollections;

public class CalculatorTest {
	public static void main(String args[])throws Exception
	{
		Calculator c1=new Calculator();
		c1.add(100,50);
		c1=null;
		Calculator c2=new Calculator();
		Calculator c3=new Calculator();

		Runtime rt=Runtime.getRuntime();//factorymethod
	     rt.gc();
	     c2=null;
	     c3=null;
	     rt.gc();
		System.in.read();
	}
}


