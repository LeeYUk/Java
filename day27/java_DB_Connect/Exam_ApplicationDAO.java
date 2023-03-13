package java_DB_Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Locale;



public class Exam_ApplicationDAO { //CRUD
	
	public int insert(Exam_ApplicationVO bag) {
		//1. 가방을 받아서 변수에 넣어주세요.
		int result = 0;
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");//오라클 11g드라이버연결
			System.out.println("드라이버연결.");
			
		
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); //Connection
			
			System.out.println("오라클 연결.");
			
			String sql ="INSERT INTO HR.EXAM_APPLICATION VALUES (?,?,?,?)";//String 쿼리문 저장 
			PreparedStatement ps =con.prepareStatement(sql);//sql 객체 생성 및 쿼리문 저장
			
			ps.setString(1, bag.getId()); //id
			ps.setString(2, bag.getCert_name());//과목명
			ps.setString(3, bag.getCert_day());//시험날짜
			ps.setString(4, bag.getCert_num());//수험번호
			
			System.out.println("SQL 객체 생성");
			
			result = ps.executeUpdate(); //1
			System.out.println("SQL문 오라클로 보내기 성공.");
			
			if(result == 1) {
				System.out.println("신청 성공");
			}
			else {
				System.out.println("신청 실패");
			}
			
		} catch (Exception e) {
			//예외처리
			//e.printStackTrace();
		}
		
		System.out.println(result);
		return result;
	}
	
	
	public int delete(Exam_ApplicationVO bag) {
		int result = 0;
		
		try {
			// 1.오라클 11g 드라이버 연결
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("오라클 드라이버 연결.");
			
			// 2.오라클 11g에 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); //Connection
			
			System.out.println("오라클 연결 성공.");
			
			
			String sql = "delete from HR.EXAM_APPLICATION where CERT_NUM = ? ";
			PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement
			ps.setString(1,bag.getCert_num());
			System.out.println("SQL 객체생성...");
			
			result = ps.executeUpdate(); 
			System.out.println("SQL문 오라클로 보내기 성공.");
			if(result == 1) {
				System.out.println("취소완료");
			}

		} 
		
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return result;
		
	}
	
		
	}
