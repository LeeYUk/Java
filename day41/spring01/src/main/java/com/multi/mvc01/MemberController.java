package com.multi.mvc01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //@어노테이션 컨트롤러 제어하는 역할 스프링에서는 extends를 사용하지 않는다 
public class MemberController {
	@Autowired
	MemberDAO dao;
	 //컨트롤 기능(CRUD)
	//회원가입, 수정, 탈퇴, 정보검색
	
	//클래스 내에서 기능처리 담당
	//멤버변수 + 멤버 메소드(기능 처리 담당)
	//하나의 요청 하나의 메소드
	//하나의 버튼호출 하나의 함수 연결
	
	@RequestMapping("insert")//바로 아래에 있는 메소드가 호출이 될때 써주기
	//메소드의 인자로 변수를 선언해두면, 컨트롤러내의 메소드에서는 bag을 만들어서, 클라이언트로 부터 전달된 데이터도 받아줌
	public void insert(MemberVO bag ) {
		//dao에게 insert요청
		System.out.println("insert");
		System.out.println(bag);
		dao.insert(bag);
	}
	
	@RequestMapping("update")
	public void update(MemberVO bag) {
		System.out.println("update");
		System.out.println(bag);	
		dao.update(bag);
	}
	
	@RequestMapping("delete")
	public void delete(String id) {
		System.out.println("delete");
		System.out.println(id);
		dao.delete(id);
	}
	
	@RequestMapping("one")
	public void one(String id,Model model) {
		System.out.println("one");
		System.out.println(id);
		MemberVO bag =dao.one(id);
		//bag에 검색결과 다 들어있음
		//view 아래 one.jsp로 쓸수있도록 설정
		
		model.addAttribute("bag",bag);
	}
	
	@RequestMapping("login")
	public String login(MemberVO bag) {
		System.out.println("login");
		System.out.println(bag);
		int result = dao.login(bag);
		
		if(result ==1)
		{
			return "ok"; //view아래 파일이름.jsp
		}
		else {
			return "redirect:member.jsp";
		}
		
	}
	
	@RequestMapping("list")
	public void list() {
		
	}

}
