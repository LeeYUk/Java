package java_DB_Connect;

import screen_DB_Connect.ProductVO;

public class ProductDAO {
	public void insert(ProductVO bag) 
	{
		System.out.println("전달된 id는"+bag.getId());
		System.out.println("전달된 name는"+bag.getName());
		System.out.println("전달된 content는"+bag.getContent());
	}
}
