package com.multi.mvc02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Locale;

import org.springframework.stereotype.Component;


@Component
public class MusicDAO {

	
	public ArrayList<MusicVO> list() {
		ResultSet rs = null; // 항목명 + 결과 데이터를 담고 있는 테이블

		// 가방들 넣어줄 큰 컨테이너 역할을 부품이 필요!
		// ArrayList<MemberVO> ==> MemberVO만 들어간 arraylist라는 의미
		ArrayList<MusicVO> list = new ArrayList<>();

		MusicVO bag = null;
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.mySQL과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); // 맥 locale에러나신 분들만!!!

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			// String url = "jdbc:mysql://localhost:3306/multi";
			String url = "jdbc:mysql://localhost:3306/multi";
			String user = "root";
			String password = "Good15951@";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
			System.out.println("2. mySQL 연결 성공.");
			// 컨트롤 + 쉬프트 + f : 코드 자동 정리!

			String sql = "select * from music";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			// 삭제!!!! ps.setString(1, id);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			rs = ps.executeQuery(); // select문 전송시
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			while (rs.next()) { // 검색결과가 있는지 여부는 rs.next()
				// true이면 있다라는 의미, false이면 없다라는 의미
				// 1. 검색겨로가가 있으면,
				// System.out.println("검색결과 있음. 성공.");
				// 2. 각 컬럼에서 값들을 꺼내오자.
				String id2 = rs.getString(1); 
				String name = rs.getString("name"); 
				String singer = rs.getString(3); 
				String genre = rs.getString(4); 
				String album = rs.getString(5); 

				bag = new MusicVO();
				bag.setId(id2);
				bag.setName(name);
				bag.setSinger(singer);
				bag.setGenre(genre);
				bag.setAlbum(album);

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
		return list;

	}
	
	
	public MusicVO one(String id) {

		ResultSet rs = null; // 테이블 값을 받을때 사용하는 레퍼런스 형 주소를 포함하고있다
		MusicVO bag = new MusicVO();// VO생성
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


			String sql = "select * from music where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1, id);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			rs = ps.executeQuery(); // 테이블형태

			System.out.println(" SQL문 오라클로 보내기 성공.");
			if (rs.next()) { // 검색결과가 있는지 여부틑 rs.next() ,true면 있다 ,false는 없다
				System.out.println("검색결과 있음.");

				String id2 = rs.getString(1);
				String name = rs.getString(2);
				String singer = rs.getString(3);
				String genre = rs.getString(4);
				String album = rs.getString(5);
				// 검색결과를 GUI로 보여줘야함

				System.out.println(id2 + " " + name + " " + singer + " " + genre+" "+album);
				bag = new MusicVO();
				bag.setId(id2);
				bag.setName(name);
				bag.setSinger(singer);
				bag.setGenre(genre);
				bag.setAlbum(album);
			} else {
				System.out.println("결과 없음");
			}

			// System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bag;

	}
}
