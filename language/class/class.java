public class main
{
	public static void main(String[] args)
	{
		myclass myobj = new myclass();
		myobj.i = 10;
		myobj.printi();
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

