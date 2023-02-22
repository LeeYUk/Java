package networkProgram;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {

	public static void main(String[] args) throws Exception{
		for (int i = 0; i < 50; i++) {
			// TCP 클라이언트
			//서버와 클라이언트에 연결 소켓이 있어야함
			Socket socket = new Socket("localhost", 8080);
			System.out.println("클라이언트 승인 요청 보냄"+i);
		}
		
	}

}
