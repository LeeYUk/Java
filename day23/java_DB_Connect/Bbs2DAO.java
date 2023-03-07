package java_DB_Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Bbs2DAO {
	
	public void update(int no, String content) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //오라클 11g와 드라이버 연결(커넥터 연결)
			System.out.println("...커넥터 연결");
			
			String url="jdbc:oracle:thin:@localhost:1521:xe"; //오라클 11g에 연결(DB연결)
			String user= "system"; //oracle user계정
			String passward="oracle"; //oracle 계정 비밀번호
			 Connection con = DriverManager.getConnection(url,user,passward);
			 System.out.println("연결성공");
			 
			 
			 
			 String sql= "update HR.BBS2 set content = ?  where \"no\" = ?";//sql구문 입력후 저장
			 PreparedStatement ps =con.prepareStatement(sql);//저장한 sql문을 sql객체로 전환
			 ps.setString(1, content);
			 ps.setInt(2, no);
			 System.out.println("sql객체 생성");
			 
			 int result=ps.executeUpdate(); //sql객체를  db로 업데이트 전송 (insert,update, delete문만 사용가능) sql문 실행결과가 int이기 때문
			 System.out.println(result);
			 
		} 
		catch (Exception e) {
			// 예외처리
			System.out.println("오류발생");
			e.printStackTrace();
		}
	}
	
	public void delete(int no) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //오라클 11g와 드라이버 연결(커넥터 연결)
			System.out.println("...커넥터 연결");
			
			String url="jdbc:oracle:thin:@localhost:1521:xe"; //오라클 11g에 연결(DB연결)
			String user= "system"; //oracle user계정
			String passward="oracle"; //oracle 계정 비밀번호
			 Connection con = DriverManager.getConnection(url,user,passward);
			 System.out.println("연결성공");
			 
			 
			 String sql= "delete from HR.BBS2 where \"no\" = ?";//sql구문 입력후 저장
			 PreparedStatement ps =con.prepareStatement(sql);//저장한 sql문을 sql객체로 전환
			 ps.setInt(1, no);
			 System.out.println("sql객체 생성");
			 
			 int result=ps.executeUpdate(); //sql객체를  db로 업데이트 전송
			 System.out.println(result);
			 
		} 
		catch (Exception e) {
			// 예외처리
			System.out.println("오류발생");
			e.printStackTrace();
			}
	}

	public void insert(int no, String title, String content, String writer) {
		// 자바 연결 테스트
		//1.오라클 11g와 연결 부품설정
		//2.오라클 11g에 연결(java--oracle)
		
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
			 
			 String sql= "INSERT INTO HR.BBS2 VALUES(?,?,?,?)";//sql구문 입력후 저장
			 PreparedStatement ps =con.prepareStatement(sql);//저장한 sql문을 sql객체로 전환
			 ps.setInt(1, no);
			 ps.setString(2, title);
			 ps.setString(3, content);
			 ps.setString(4, writer);
			 System.out.println("sql객체 생성");
			 
			 int result=ps.executeUpdate(); //sql객체를  db로 업데이트 전송
			 System.out.println(result);
			 
		} 
		catch (Exception e) {
			// 예외처리
			System.out.println("오류발생");
			e.printStackTrace();
		}
		

	}

}
