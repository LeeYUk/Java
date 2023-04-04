package com.multi.mvc200;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {

	
	@RequestMapping("movie")
	public void com(MovieVO vo, Model model) {
		System.out.println(vo);
		model.addAttribute("vo", vo);
		
	}
	
	@RequestMapping("fruit")
	public void fruit(Model model) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("사과");
		list.add("딸기");
		list.add("배");
		list.add("블루베리");
		list.add("포도");
		model.addAttribute("list", list);
		
	}
	
	@RequestMapping("tour")
	public void tour(Model model) {
		
		//model.addAttribute("vo", vo);
		
	}
}
