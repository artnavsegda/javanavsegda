import java.net.Socket;
import java.net.ServerSocket;
import java.io.PrintWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Base64;
import java.security.MessageDigest;

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
    if (get.find())
    {
      Matcher match = Pattern.compile("Sec-WebSocket-Key: (.*)").matcher(data);
      match.find();
      byte[] response = ("HTTP/1.1 101 Switching Protocols\r\n"
          + "Connection: Upgrade\r\n"
          + "Upgrade: websocket\r\n"
          + "Sec-WebSocket-Accept: "
          + Base64.getEncoder().encodeToString(MessageDigest.getInstance("SHA-1").digest((match.group(1) + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").getBytes("UTF-8")))
          + "\r\n\r\n").getBytes("UTF-8");
      out.write(response, 0, response.length);

			byte[] decoded = new byte[6];
			byte[] encoded = new byte[] { (byte) 198, (byte) 131, (byte) 130, (byte) 182, (byte) 194, (byte) 135 };
			byte[] key = new byte[] { (byte) 167, (byte) 225, (byte) 225, (byte) 210 };
			for (int i = 0; i < encoded.length; i++) {
			  decoded[i] = (byte) (encoded[i] ^ key[i & 0x3]);
			}
    }
	}
}
