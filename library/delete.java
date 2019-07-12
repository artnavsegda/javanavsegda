import java.io.File;

public class delete {

	public static void main(String[] args) {
		File myfile = new File("test.txt");
		myfile.delete();
	}
}

