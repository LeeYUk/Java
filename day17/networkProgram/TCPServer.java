package networkProgram;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws Exception {
		// TCP소켓 통신 서버
		//서버는 계속살리기 위해 무한루프 돌리기
		//요청이 있으면 승인을 해주고, 통신할수있는 소켓만들기
		
		ServerSocket server = new ServerSocket(8080); //소켓 사용할떄 예외처리해야함
		System.out.println("서버 연결");
		System.out.println("연결 대기중");
		int count=0;
		
		while(true) {
			Socket socket=server.accept();
			count++;
			System.out.println(count+"소켓 생성됨");
		}
		

	}

}
