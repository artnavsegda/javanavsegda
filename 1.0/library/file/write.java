import java.io.FileWriter;

public class write {

	public static void main(String[] args) throws Exception
	{
		FileWriter myfile = new FileWriter("test.txt");
		myfile.write("Hello World");
		myfile.close();
	}
}

