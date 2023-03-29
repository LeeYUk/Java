package com.multi.mvc02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Component;



@Component
public class BookDAO {
	
	public BookDTO one(String id) {

		ResultSet rs = null; // 테이블 값을 받을때 사용하는 레퍼런스 형 주소를 포함하고있다
		BookDTO bag = new BookDTO();// VO생성
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

			String sql = "select * from book where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1, id);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			rs = ps.executeQuery(); // 테이블형태

			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (rs.next()) { // 검색결과가 있는지 여부틑 rs.next() ,true면 있다 ,false는 없다
				System.out.println("검색결과 있음.");

				int id2 = rs.getInt(1);
				String name = rs.getString(2);
				String url2 = rs.getString(3);
				String img = rs.getString(4);
				// 검색결과를 GUI로 보여줘야함

				System.out.println(id2 + " " + name + " " + url2 + " " + img);
				bag = new BookDTO();
				bag.setId(id2);
				bag.setName(name);
				bag.setUrl(url2);
				bag.setUrl(img);
			} else {
				System.out.println("결과 없음");
			}

			// System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bag;

	}
	public void insert(BookDTO bag) {
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
			String sql = "insert into book(name,url,img) VALUES (?,?,?)";// sql구문 입력후 저장
			PreparedStatement ps = con.prepareStatement(sql);// 저장한 sql문을 sql객체로 전환
			// ps.setInt(1, bag.getNo());
			ps.setString(1, bag.getName());
			ps.setString(2, bag.getUrl());
			ps.setString(3, bag.getImg());
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
