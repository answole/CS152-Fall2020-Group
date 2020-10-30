import java.awt.Rectangle;

public class Tester
{
	public static void main (String args[]) 
	{
		Object e = new Rectangle();
		
		Class c = e.getClass();
		System.out.println(c);
		c  = Rectangle.class;
		System.out.println(c);
		double [] a = new double[10];
		int [] b = new int [20];
	c= a.getClass();
	Class d = b.getClass();
	System.out.println(d.getComponentType());
		
		
	}
}


