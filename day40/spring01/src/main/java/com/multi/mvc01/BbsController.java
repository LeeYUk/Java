package com.multi.mvc01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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



}
