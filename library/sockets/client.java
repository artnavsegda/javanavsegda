import java.net.Socket;

public class client {
	public static void main(String[] args) throws Exception
	{
		Socket mysocket = new Socket("localhost", 8888);
	}
}

