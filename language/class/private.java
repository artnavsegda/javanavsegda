public class main
{
	public static void main(String[] args)
	{
		myclass myobj = new myclass();
		myobj.seti(10);
		myobj.printi();
	}
}

public class myclass
{
	private int i;
	public void printi()
	{
		System.out.println(i);
	}
	public void seti(int itoset)
	{
		i = itoset;
	}
}

