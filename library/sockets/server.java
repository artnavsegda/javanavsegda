import java.net.Socket;
import java.net.ServerSocket;
import java.io.PrintWriter;

public class server {
	public static void main(String[] args) throws Exception
	{
		ServerSocket server = new ServerSocket(8888);
		Socket client = server.accept();
		PrintWriter out = new PrintWriter(client.getOutputStream(), true);
	}
}
