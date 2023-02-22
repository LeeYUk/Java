package networkProgram;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPSender {

	public static void main(String[] args) throws Exception {
		// UDP용 소켓이 있어야 함
		//UDP용 패킷이 있어야함(데이터, 데이D터크기,ip ,port)
		//소켓을 이용해서 패킷을 보냄
		
		DatagramSocket socket= new DatagramSocket();
		String s="S.O.S";
		byte data[]=s.getBytes();//데이터를 보낼때 byte단위로 보냄 String데이터를 byte단위로 변환
		InetAddress ip=InetAddress.getByName("localhost");//ip를 설정
		DatagramPacket packet =new DatagramPacket(data,data.length,ip,8080);//udp통신은 데이터그램패킷을 사용하여 데이터를 담음
		
		socket.send(packet);//소켓을 사용해 패킷을 전송
		socket.close();//소켓 종료
	}

}
