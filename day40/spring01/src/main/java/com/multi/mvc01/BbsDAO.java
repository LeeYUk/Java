package com.multi.mvc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Locale;

import org.springframework.stereotype.Component;

@Component
public class BbsDAO {

	public ArrayList<BbsVO> list() {
		ResultSet rs = null; // 항목명 + 결과 데이터를 담고 있는 테이블

		// 가방들 넣어줄 큰 컨테이너 역할을 부품이 필요!
		// ArrayList<MemberVO> ==> MemberVO만 들어간 arraylist라는 의미
		ArrayList<BbsVO> list = new ArrayList<>();

		BbsVO bag = null;
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("mySQL과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); // 맥 locale에러나신 분들만!!!

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			// String url = "jdbc:mysql://localhost:3306/multi";
			String url = "jdbc:mysql://localhost:3306/multi";
			String user = "root";
			String password = "Good15951@";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
			System.out.println("mySQL 연결 성공.");
			// 컨트롤 + 쉬프트 + f : 코드 자동 정리!

			// ipaddress ==> InetAddress
			// String url = "http://wwww.naver.com";
			// URL u = new URL(url);
			// 자바는 부품조립식이여서,String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야 함.
			// PreparedStatement가 SQL부품!!

			String sql = "select * from bbs";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			// 삭제!!!! ps.setString(1, id);
			System.out.println("SQL문 객체생성.");

			rs = ps.executeQuery(); // select문 전송시
			System.out.println(" SQL문 mtsql로 보내기 성공.");
			while (rs.next()) { // 검색결과가 있는지 여부는 rs.next()
				// true이면 있다라는 의미, false이면 없다라는 의미
				// 1. 검색겨로가가 있으면,
				// System.out.println("검색결과 있음. 성공.");
				// 2. 각 컬럼에서 값들을 꺼내오자.
				int no = rs.getInt(1);
				String title = rs.getString(2);
				String content = rs.getString(3);
				String writer = rs.getString(4);
				System.out.println(no + " " + title + " " + content + " " + writer);
				// 검색결과를 검색화면 UI부분을 주어야 함.
				// 3. 가방을 만들자.
				bag = new BbsVO();
				bag.setNo(no);
				bag.setTitle(title);
				bag.setContent(content);
				bag.setWriter(writer);

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

	public BbsVO one(int no) {
		ResultSet rs = null;
		BbsVO bag = new BbsVO();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("mysql 자바 드라이브 연결 .");

			// mysql 연결
			String url = "jdbc:mysql://localhost:3306/multi";
			String user = "root";
			String password = "Good15951@";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
			System.out.println("mysql 연결 성공.");

			String sql = "select * from bbs where no = ?";// sql구문 입력후 저장
			PreparedStatement ps = con.prepareStatement(sql);// 저장한 sql문을 sql객체로 전환
			ps.setInt(1, no);
			System.out.println("sql객체 생성");

			rs = ps.executeQuery(); // sql객체를 db로 업데이트 전송

			if (rs.next()) {
				System.out.println("검색결과있음");

				int no2 = rs.getInt(1); // no
				String title = rs.getString(2); // title
				String content = rs.getString(3);// content
				String writer = rs.getString(4);// writer

				System.out.println(no2 + " " + title + " " + content + " " + writer);
				bag.setNo(no2);
				bag.setTitle(title);
				bag.setContent(content);
				bag.setWriter(writer);
			} else {
				System.out.println("검색결과 없음");
			}

		} catch (Exception e) {
			// 예외처리
			System.out.println("오류발생");
			e.printStackTrace();
		}
		return bag;
	}

	public void update(BbsVO bag) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("mysql 자바 드라이브 연결 .");

			// mysql 연결
			String url = "jdbc:mysql://localhost:3306/multi";
			String user = "root";
			String password = "Good15951@";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
			System.out.println("mysql 연결 성공.");

			String sql = "update bbs set content = ?  where no = ?";// sql구문 입력후 저장
			PreparedStatement ps = con.prepareStatement(sql);// 저장한 sql문을 sql객체로 전환
			ps.setString(1, bag.getContent());
			ps.setInt(2, bag.getNo());
			System.out.println("sql객체 생성");

			int result = ps.executeUpdate(); // sql객체를 db로 업데이트 전송 (insert,update, delete문만 사용가능) sql문 실행결과가 int이기 때문
			System.out.println(result);

		} catch (Exception e) {
			// 예외처리
			System.out.println("오류발생");
			e.printStackTrace();
		}
	}

	public void delete(BbsVO bag) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("mysql 자바 드라이브 연결 .");

			// mysql 연결
			String url = "jdbc:mysql://localhost:3306/multi";
			String user = "root";
			String password = "Good15951@";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
			System.out.println("mysql 연결 성공.");

			String sql = "delete from bbs where no = ?";// sql구문 입력후 저장
			PreparedStatement ps = con.prepareStatement(sql);// 저장한 sql문을 sql객체로 전환
			ps.setInt(1, bag.getNo());
			System.out.println("sql객체 생성");

			int result = ps.executeUpdate(); // sql객체를 db로 업데이트 전송
			System.out.println(result);

		} catch (Exception e) {
			// 예외처리
			System.out.println("오류발생");
			e.printStackTrace();
		}
	}

	public void insert(BbsVO bag) {
		// 자바 연결 테스트
		// 1.오라클 11g와 연결 부품설정
		// 2.오라클 11g에 연결(java--oracle)

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("mysql 자바 드라이브 연결 .");

			// mysql 연결
			String url = "jdbc:mysql://localhost:3306/multi";
			String user = "root";
			String password = "Good15951@";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
			System.out.println("mysql 연결 성공.");

			// ipaddress ==>InetAddress;
			// String url="http://www.naver.com";
			// URL u =new URL(url);
			// 자바는 String에 넣은 문자열을 특정한 객체로 인식하지 못함
			// SQL객체로 만들어줘야함

			// String sql ="insert into bbs(null,?,?,?)";
			String sql = "insert into bbs(title,content,writer) VALUES (?,?,?)";// sql구문 입력후 저장
			PreparedStatement ps = con.prepareStatement(sql);// 저장한 sql문을 sql객체로 전환
			// ps.setInt(1, bag.getNo());
			ps.setString(1, bag.getTitle());
			ps.setString(2, bag.getContent());
			ps.setString(3, bag.getWriter());
			System.out.println("sql객체 생성");

			int result = ps.executeUpdate(); // sql객체를 db로 업데이트 전송
			System.out.println(result);

		} catch (Exception e) {
			// 예외처리
			System.out.println("오류발생");
			e.printStackTrace();
		}

	}

}
