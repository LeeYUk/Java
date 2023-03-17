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

	public ArrayList<MovieVO> list() {
		ResultSet rs = null; // 항목명 + 결과 데이터를 담고 있는 테이블

		// 가방들 넣어줄 큰 컨테이너 역할을 부품이 필요!
		// ArrayList<MemberVO> ==> MemberVO만 들어간 arraylist라는 의미
		ArrayList<MovieVO> list = new ArrayList<>();

		MovieVO bag = null;
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이드 연결");
			Locale.setDefault(Locale.US); // 맥 locale에러나신 분들만!!!

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			// String url = "jdbc:mysql://localhost:3306/multi";
			String url = "jdbc:mysql://localhost:3306/multi";
			String user = "root";
			String password = "Good15951@";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
			System.out.println(" mySQL 연결 성공.");
			// 컨트롤 + 쉬프트 + f : 코드 자동 정리!

			// ipaddress ==> InetAddress
			// String url = "http://wwww.naver.com";
			// URL u = new URL(url);
			// 자바는 부품조립식이여서,String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야 함.
			// PreparedStatement가 SQL부품!!

			String sql = "select * from movie";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			// 삭제!!!! ps.setString(1, id);
			System.out.println(" SQL 객체생성");

			rs = ps.executeQuery(); // select문 전송시
			System.out.println("SQL문 mysql로 보내기 성공.");
			while (rs.next()) { // 검색결과가 있는지 여부는 rs.next()
				// true이면 있다라는 의미, false이면 없다라는 의미
				// 1. 검색겨로가가 있으면,
				// System.out.println("검색결과 있음. 성공.");
				// 2. 각 컬럼에서 값들을 꺼내오자.
				String id = rs.getString("id"); 
				String title = rs.getString("title"); 
				String content = rs.getString("content"); 
				String location = rs.getString("location"); 
				String director = rs.getString("director"); 
			
				// 검색결과를 검색화면 UI부분을 주어야 함.
				// 3. 가방을 만들자.
				bag = new MovieVO();
				bag.setId(id);
				bag.setTitle(title);
				bag.setContent(content);
				bag.setLocation(location);
				bag.setDirector(director);

				// 4. list에 bag을 추가해주자.
				list.add(bag);
			}
			// System.out.println(result);
			ps.close();
			rs.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// return id, pw, name, tel은 XXXXX!
		// return 뒤에는 반드시 여러 데이터를 묶어서 리턴해주어야 함.
		// 검색결과가 있을 때는 bag에 데이터가 들어있음.
		// 검색결과가 없을 때는 bag에 무엇이 들어있나? null
		return list;

	}
	
	public MovieVO one(String id) {

		ResultSet rs = null; // 테이블 값을 받을때 사용하는 레퍼런스 형 주소를 포함하고있다
		MovieVO bag = new MovieVO();// VO생성
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

			// ipaddress ==> InetAddress
			// String url = "http://wwww.naver.com";
			// URL u = new URL(url);
			// 자바는 부품조립식이여서,String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야 함.
			// PreparedStatement가 SQL부품!!

			String sql = "select * from movie where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1, id);
			System.out.println("SQL 객체 생성");

			rs = ps.executeQuery(); // 테이블형태

			System.out.println("SQL문 mysql로 보내기 성공.");
			if (rs.next()) { // 검색결과가 있는지 여부틑 rs.next() ,true면 있다 ,false는 없다
				System.out.println("검색결과 있음.");

				String id2 = rs.getString("id");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String location = rs.getString("location");
				String director = rs.getString("director");
				// 검색결과를 GUI로 보여줘야함

				System.out.println(id2 + " " + title + " " + content + " " + location+" "+director);
				bag = new MovieVO();
				bag.setId(id2);
				bag.setTitle(title);
				bag.setContent(content);
				bag.setLocation(location);
				bag.setDirector(director);
			} else {
				System.out.println("결과 없음");
			}

			// System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bag;

	}
	
	

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