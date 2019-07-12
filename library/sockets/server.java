import java.net.Socket;
import java.net.ServerSocket;
import java.io.PrintWriter;

public class server {
	public static void main(String[] args) throws Exception
	{
		ServerSocket mysocket = new ServerSocket(8888);
		Socket othersocket = mysocket.accept();
		PrintWriter out = new PrintWriter(othersocket.getOutputStream(), true);
	}
}
