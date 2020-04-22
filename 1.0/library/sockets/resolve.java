import java.net.InetAddress;

public class resolve {
	public static void main(String[] args) throws Exception
	{
		InetAddress address = InetAddress.getByName("artnavsegda.herokuapp.com");
		System.out.println(address.getHostAddress());
	}
}

