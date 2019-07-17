public class main
{
	public static void main(String[] args)
	{
		myclass myobj = new myclass();
		myclass myobj2 = new myclass(10);
	}
}

public class myclass
{
	public myclass()
	{
		System.out.println("Class created");
	}
	public myclass(int i)
	{
		System.out.print("Class created with parameter ");
		System.out.println(i);
	}
}

