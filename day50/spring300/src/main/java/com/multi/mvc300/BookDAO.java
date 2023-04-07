package com.multi.mvc300;
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
import org.springframework.web.bind.annotation.RequestMapping;


@Component
public class BookDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public int insert(BookVO bag) {
		System.out.println("------" + my);
		int result = my.insert("book.create", bag);
		return result;
	}
	
	@RequestMapping("one3")
	public BookVO one(int id) 
	{
		System.out.println(id);
		BookVO bag= my.selectOne("book.one" ,id);
		
		return bag;
		
	}
	public List<BookVO> list() {
		List<BookVO>list =my.selectList("book.all");
		return list;
	}
}