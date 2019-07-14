public class method {
	static void myfunc2(int number)
	{
		if (number == 34)
		{
			throw new ArithmeticException("Number is thirty four");
		}
		System.out.println(number);
	}
	static void myfunc(int number)
	{
		try
		{
			myfunc2(number);
		}
		catch (Exception e)
		{
			System.out.println("error");
		}
	}
	public static void main(String[] args)
	{
		myfunc(22);
		myfunc(34);
	}
}

