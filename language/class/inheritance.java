public class main
{
	public static void main(String[] args)
	{
		myclass myobj = new myclass();
		myobj.i = 10;
		myobj.printi();
		otherclass myobj3 = new otherclass();
		myobj3.i = 11;
		myobj3.x = 12;
		myobj3.printi();
	}
}

public class myclass
{
	int i;
	public void printi()
	{
		System.out.println(i);
	}
}

public class otherclass extends myclass
{
	int x;
}

