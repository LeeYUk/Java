
package com.multi.mvc901;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberDAO { // CRUD
//
//	// 메서드를 만드는 것 ==> 메서드 정의(define)!
//	// 메서드를 정의했다고 실행되는 것은 아니다.!
//	// 메서드를 쓰는 것 ==> 메서드 호출(call)!
	@Autowired
	SqlSessionTemplate my=null;//mybatis 싱글톤 객체 찾아서 주소 넣기
//
	public List<MemberVO> list() {
		List<MemberVO> list=my.selectList("member.all");
		System.out.println(list.size());
		return list;
	}

//	public int login(MemberVO bag) {
//		
//		return result;
//	}
//
	public MemberVO one(String id) {
		MemberVO bag= my.selectOne("member.one", id);
		
		return bag;
	}
//
	public int delete(String id) {
		int result =my.delete("member.del",id);
		return result;
	}
//
//	// 1. 가방을 받아서 저장해두자.
//	// 2. 필요할 때 가방에서 값들을 하나씩 꺼내자.
	public int update(MemberVO bag) {
		int result=my.update("member.up",bag);
		return result;
	}

	// public void add2() {
	public int insert(MemberVO bag) {
		int result=	my.insert("member.create",bag); //namespace.id
		
		return result;
	}

}