package com.multi.mvc300;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
	
	@Autowired
	BookDAO dao;//100
	
	@RequestMapping("insert3.multi")
	public void insert(BookVO bag) {
		
		System.out.println("insert요청됨.");
		System.out.println(bag);
		System.out.println(dao);
		dao.insert(bag);
	}
	public void list(Model model) {
		List<BookVO>list =dao.list();
		model.addAttribute("list",list);
	}
}
