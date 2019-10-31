import java.net.Socket;
import java.net.ServerSocket;
import java.io.PrintWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class server {
	public static void main(String[] args) throws Exception
	{
		ServerSocket server = new ServerSocket(8888);
		Socket client = server.accept();
		//PrintWriter out = new PrintWriter(client.getOutputStream(), true);
    InputStream in = client.getInputStream();
    OutputStream out = client.getOutputStream();
    Scanner s = new Scanner(in, "UTF-8");
    String data = s.useDelimiter("\\r\\n\\r\\n").next();
		Matcher get = Pattern.compile("^GET").matcher(data);
	}
}
