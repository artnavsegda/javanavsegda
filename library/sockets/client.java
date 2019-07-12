import java.net.Socket;
import java.io.PrintWriter;

public class client {
	public static void main(String[] args) throws Exception
	{
		Socket mysocket = new Socket("localhost", 8888);
		PrintWriter out = new PrintWriter(mysocket.getOutputStream(), true);
	}
}

