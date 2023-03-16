package multi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Locale;

public class MovieDAO { // CRUD

	// 메서드를 만드는 것 ==> 메서드 정의(define)!
	// 메서드를 정의했다고 실행되는 것은 아니다.!
	// 메서드를 쓰는 것 ==> 메서드 호출(call)!

	
	// public void add2() {
	public int insert(MovieVO bag) {
		// 1. 가방을 받아서 변수에 넣어주세요.
		int result = 0;

		try {
			// 드라이번연결
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("mysql 자바 드라이브 연결 .");

			// mysql 연결
			String url = "jdbc:mysql://localhost:3306/multi";
			String user = "root";
			String password = "Good15951@";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
			System.out.println("mysql 연결 성공.");

			String sql = "INSERT INTO movie VALUES (?, ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement

			ps.setString(1, bag.getId()); // ps.setInt(1, no);
			ps.setString(2, bag.getTitle());
			ps.setString(3, bag.getContent());
			ps.setString(4, bag.getLocation());
			ps.setString(5, bag.getDirector());

			// ==> insert into hr.MEMBER values ('a','a','a','a');
			System.out.println(" SQL객체 생성");

			result = ps.executeUpdate(); // 1
			System.out.println("SQL문mysql로 전송.");
			if (result == 1) {
				System.out.println("전송완료!");
			}
			// System.out.println(result);
		} catch (Exception e) {
			// insert가 제대로 안된 경우, 위험한 상황이라고 판단하고
			// catch가 실행
			// 실행된 Row수가 없으므로 Result에 0을 넣어주자.!
			// result = 0;
			e.printStackTrace();
		}

		System.out.println(result);
		return result;
	}
}