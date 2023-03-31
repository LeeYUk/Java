package com.multi.mvc01;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {
	@Autowired
	BbsDAO dao;

	@RequestMapping("insert2")
	public void insert(BbsVO bag) 
	{
		System.out.println(bag);
		dao.insert(bag);
	}
	
	@RequestMapping("delete2")
	public void delete(BbsVO bag) 
	{
		System.out.println(bag);
		dao.delete(bag);
	}
	
	@RequestMapping("update2")
	public void update(BbsVO bag) 
	{
		System.out.println(bag);
		dao.update(bag);
	}
	
	@RequestMapping("one2")
	public void one(int no ) 
	{
		System.out.println(no);
		dao.one(no);
		
	}
	
	@RequestMapping("list2")
	public void list(Model model) {
		//Model은 컨트롤러의 list를 view/list2.jsp까지만 전달할 수 있는 객체
		ArrayList<BbsVO> list=dao.list();
		model.addAttribute("list",list);
	}



}
