public class main
{
	public static void main(String[] args)
	{
		myclass myobj = new myclass();
		myobj.i = 10;
		myobj.printsome();
		otherclass myobj3 = new otherclass();
		myobj3.i = 11;
		myobj3.x = 2;
		myobj3.printsome();
	}
}

public class myclass
{
	int i;
	public void printsome()
	{
		System.out.println(i);
	}
}

public class otherclass extends myclass
{
	int x;
	public void printsome()
	{
		System.out.println(i*x);
	}
}

