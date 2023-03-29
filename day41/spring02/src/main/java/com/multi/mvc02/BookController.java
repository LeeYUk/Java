package com.multi.mvc02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class BookController {
	@Autowired
	BookDAO dao;	


	@RequestMapping("insert3")
	public void insert(BookDTO bag) {
		System.out.println("insert");
		System.out.println(bag);
		dao.insert(bag);
		
	}
	
	@RequestMapping("one")
	public void one(String id,Model model) {
		System.out.println("one");
		System.out.println(id);
		BookDTO bag =dao.one(id);
		//bag에 검색결과 다 들어있음
		//view 아래 one.jsp로 쓸수있도록 설정
		
		model.addAttribute("bag",bag);
	}
}
