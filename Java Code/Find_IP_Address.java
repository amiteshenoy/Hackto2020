import java.net.*;


class FindIP
{
public static void main(String…s)throws Exception
{
System.out.println(InetAddress.getLocalHost());
System.out.println(InetAddress.getByName(“www.google.com”));
}
}
