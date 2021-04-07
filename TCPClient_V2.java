package chapter1;
// �Է°� ���ÿ� ����� ������ ������� ����ó ó���Ѵ�
import java.io.IOException;
import java.net.Socket;

public class TCPClient_V2 {

	public static void main(String[] args) {
		try {
			String ServerIp = "127.0.0.1";
			
			Socket socket = new Socket(ServerIp, 7777);
			
			System.out.println("������ ����Ǿ����ϴ�");
			
			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);
			
			sender.start();
			receiver.start();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}