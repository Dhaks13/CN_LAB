import java.util.Scanner;
public class Client
{
	public static void main(String [] args)
	{
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter server ip:");
		String ip = myObj.nextLine(); 
		chat_client client = new chat_client(ip);
		client.startRunning();
	}
}
