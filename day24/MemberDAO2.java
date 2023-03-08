package java_DB_Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDAO2 {

	public int delete(String id) {
		int result=0;
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver"); //오라클 11g와 드라이버 연결(커넥터 연결)
		System.out.println("...커넥터 연결");
		
		String url="jdbc:oracle:thin:@localhost:1521:xe"; //오라클 11g에 연결(DB연결)
		String user= "system"; //oracle user계정
		String passward="oracle"; //oracle 계정 비밀번호
		 Connection con = DriverManager.getConnection(url,user,passward);
		 System.out.println("연결성공");
		 
		 
		 //ipaddress ==>InetAddress;
		 //String url="http://www.naver.com";
		 //URL u =new URL(url);
		 //자바는 String에 넣은 문자열을 특정한 객체로 인식하지 못함
		 //SQL객체로 만들어줘야함
		 
		 
		 
		 String sql= "delete from HR.MEMBER2 where id= ?";//sql구문 입력후 저장
		 PreparedStatement ps =con.prepareStatement(sql);//저장한 sql문을 sql객체로 전환
		 ps.setString(1, id);
		 System.out.println("sql객체 생성");
		 
		 result=ps.executeUpdate(); //sql객체를  db로 업데이트 전송
		 if(result==1) {
			 System.out.println("탈퇴성공");
		 }
		 else {
			 System.out.println("탈퇴실패");
		 }
	} 
	catch (Exception e) {
		// 예외처리
		System.out.println("오류발생");
		e.printStackTrace();
		}
		
		System.out.println(result);
		return result;
	}
	
	
	public int update(String id, String tel) {
		int result=0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //오라클 11g와 드라이버 연결(커넥터 연결)
			System.out.println("...커넥터 연결");
			
			String url="jdbc:oracle:thin:@localhost:1521:xe"; //오라클 11g에 연결(DB연결)
			String user= "system"; //oracle user계정
			String passward="oracle"; //oracle 계정 비밀번호
			 Connection con = DriverManager.getConnection(url,user,passward);
			 System.out.println("연결성공");
			 
			 
			 //ipaddress ==>InetAddress;
			 //String url="http://www.naver.com";
			 //URL u =new URL(url);
			 //자바는 String에 넣은 문자열을 특정한 객체로 인식하지 못함
			 //SQL객체로 만들어줘야함
			 
			 String sql= "update HR.MEMBER2 set tel=? where id=?";//sql구문 입력후 저장
			 PreparedStatement ps =con.prepareStatement(sql);//저장한 sql문을 sql객체로 전환
			 ps.setString(1, tel);
			 ps.setString(2, id);
			 System.out.println("sql객체 생성");
			 
			 result=ps.executeUpdate(); //sql객체를  db로 업데이트 전송 (insert,update, delete문만 사용가능) sql문 실행결과가 int이기 때문
			 if(result==1) {
				 System.out.println("수정성공");
			 }
			 else {
				 System.out.println("수정실패");
			 }
			 
		} 
		catch (Exception e) {
			// 예외처리
			System.out.println("오류발생");
			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}
	
	
	public int insert(String id, String pw, String name, String tel) {
		// 자바 연결 테스트
		//1.오라클 11g와 연결 부품설정
		//2.오라클 11g에 연결(java--oracle)
		int result=0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //오라클 11g와 드라이버 연결(커넥터 연결)
			System.out.println("...커넥터 연결");
			
			String url="jdbc:oracle:thin:@localhost:1521:xe"; //오라클 11g에 연결(DB연결)
			String user= "system"; //oracle user계정
			String passward="oracle"; //oracle 계정 비밀번호
			 Connection con = DriverManager.getConnection(url,user,passward);
			 System.out.println("연결성공");
			 
			 
			 //ipaddress ==>InetAddress;
			 //String url="http://www.naver.com";
			 //URL u =new URL(url);
			 //자바는 String에 넣은 문자열을 특정한 객체로 인식하지 못함
			 //SQL객체로 만들어줘야함
			 
			 
			 
			 String sql= "INSERT INTO HR.MEMBER2 VALUES(?,?,?,?)";//sql구문 입력후 저장
			 PreparedStatement ps =con.prepareStatement(sql);//저장한 sql문을 sql객체로 전환
			 ps.setString(1, id);
			 ps.setString(2, pw);
			 ps.setString(3, name);
			 ps.setString(4, tel);
			 System.out.println("sql객체 생성");
			 
			 result=ps.executeUpdate(); //sql객체를  db로 업데이트 전송
			 
			 
		} 
		catch (Exception e) {
			// 예외처리
			System.out.println("오류발생");
			result=0;
			e.printStackTrace();
		}
		System.out.println(result);
		return result;
		

	}

}
