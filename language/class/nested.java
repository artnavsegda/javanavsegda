public class main
{
	public static void main(String[] args)
	{
		myclass myobj = new myclass();
		myobj.i = 10;
		myobj.printi();
	}
}

class myclass
{
	int i;
	public void printi()
	{
		System.out.println(i);
	}
	class nestclass
	{
		int y;
		public void printy()
		{
			System.out.println(y);
		}
	}
}

