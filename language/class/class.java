public class main
{
	public static void main(String[] args)
	{
		myclass myobj = new myclass();
		myobj.i = 10;
		System.out.println(myobj.i);
		myobj.printi();
	}
}

public class myclass
{
	int i;
	static void printi()
	{
		System.out.println(11);
	}
}

