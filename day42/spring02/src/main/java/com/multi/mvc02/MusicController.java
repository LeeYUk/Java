package com.multi.mvc02;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MusicController {
	@Autowired
	MusicDAO dao;
	
	@RequestMapping("one")
	public void one(String id,Model model) {
		System.out.println("one");
		System.out.println(id);
		MusicVO bag = dao.one(id);
		
		model.addAttribute("bag",bag);
	} 
	
	@RequestMapping("list")
	public void list(Model model) {
		//Model은 컨트롤러의 list를 view/list.jsp까지만 전달할 수 있는 객체
		ArrayList<MusicVO> list=dao.list();
		model.addAttribute("list",list);
	}
	

}
