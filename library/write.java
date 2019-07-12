import java.io.FileWriter;
import java.io.IOException;

public class write {

	public static void main(String[] args) 
		throws IOException {
			FileWriter myfile = new FileWriter("test.txt");
			myfile.write("Hello World");
			myfile.close();
		}
}

