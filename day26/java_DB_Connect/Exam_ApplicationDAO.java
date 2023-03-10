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
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");//오라클 11g드라이버연결
			System.out.println("드라이버연결.");
			
			// 2.오라클 11g에 연결해보자.(java --- oracle) 
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); //Connection
			
			System.out.println("오라클 연결.");
			
			String sql ="INSERT INTO HR.EXAM_APPLICATION VALUES (?,?,?,?)";//String 쿼리문 저장 
			PreparedStatement ps =con.prepareStatement(sql);//sql 객체 생성 및 쿼리문 전달
			
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
	
	
	public int delete(String id) {
		int result = 0;
		
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); //맥 locale에러나신 분들만!!!
			
			// 2.오라클 11g에 연결해보자.(java --- oracle) 
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); //Connection
			//String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개 
			System.out.println("2. 오라클 연결 성공.");
			
			
			String sql = "delete from HR.EXAM_APPLICATION where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement
			ps.setString(1, id);
			System.out.println("SQL 객체생성...");
			
			result = ps.executeUpdate(); 
			System.out.println("SQL문 오라클로 보내기 성공.");
			if(result == 1) {
				System.out.println("취소완료");
			}
			//System.out.println(result);
		} catch (Exception e) {
			//e.printStackTrace();
		}
		
		return result;
		
	}
	
		
	}
