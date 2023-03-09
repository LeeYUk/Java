package java_DB_Connect;

import java.util.Scanner;

import screen_DB_Connect.ProductVO;

public class Product_Join {

	public static void main(String[] args) {
		// 상품 등록
		Scanner sc=new Scanner(System.in);
		System.out.println("id, name, content 순서로입력");
		
		String id=sc.next();// 값을 입력받음
		String name=sc.next();
		String content=sc.next();
		
		ProductVO bag=new ProductVO();//bag 인스턴스 생성
		
		bag.setId(id); //sc에서 입력한 값을 VO로 저장 및 전달 
		bag.setName(name);
		bag.setContent(content);
		
		ProductDAO dao= new ProductDAO(); //dao인스턴스 생성
		dao.insert(bag);
	}

}
