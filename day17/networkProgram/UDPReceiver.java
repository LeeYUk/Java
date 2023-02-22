package networkProgram;

import java.net.*;

public class UDPReceiver {

	public static void main(String[] args) throws Exception {
		// UDP 데이터 받기
		
		//받는 소켓이 있어야함(port)
		//패킷으로 보냈기 때문에 비어있는 패킷을 만들어야함
		//비어있는 패킷안에는 비어있는 byte[]이 있어야한다
		//소켓이 받아서 비어있는 패킷에 넣음
		//byte[]에 있는 String으로 형변환
		
		DatagramSocket socket= new DatagramSocket(8080);
		
		byte data[]=new byte[256];//패킷을 받을 공간을 만듬
		DatagramPacket packet= new DatagramPacket(data, data.length); //받을 패킷의 정보
		
		System.out.println("데이터 받을 준비..");
		socket.receive(packet);// 상대가 보낸 패킷을 받음
		
		
		System.out.println("받은 데이터는: "+ new String(data));// 받은 데이터는 byte형식이라서 강제형변환 시켜 받은 데이터를 출력
		
		socket.close();
	}

}
