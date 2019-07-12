import java.io.FileReader;

public class write {

	public static void main(String[] args) throws Exception
	{
		FileReader myfile = new FileReader("test.txt");
		int i;
		while ((i=myfile.read()) != -1)
			System.out.print((char) i);
		myfile.close();
	}
}

