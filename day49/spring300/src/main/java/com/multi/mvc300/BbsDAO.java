package com.multi.mvc300;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Locale;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BbsDAO {
	
	@Autowired
	SqlSessionTemplate my=null;

//	public ArrayList<BbsVO> list() {
//		ResultSet rs = null; // 항목명 + 결과 데이터를 담고 있는 테이블
//
//		// 가방들 넣어줄 큰 컨테이너 역할을 부품이 필요!
//		// ArrayList<MemberVO> ==> MemberVO만 들어간 arraylist라는 의미
//		ArrayList<BbsVO> list = new ArrayList<>();
//
//		return list;
//
//	}
//
//	public BbsVO one(int no) {
//	
//		return bag;
//	}
//
//	public void update(BbsVO bag) {
//
//		
//	}
//
//	public void delete(BbsVO bag) {
//		
//	}

	public int insert(BbsVO bag) {
		
		int result=my.insert("bss.create",bag);
		
		return result;
	}

}
