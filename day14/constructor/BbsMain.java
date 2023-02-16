package constructor;

public class BbsMain {

	public static void main(String[] args) {
		// class Bbs 메인
		
		Bbs bb1=new Bbs(1, "자바", "오늘은 생성자", "홍길동");
		System.out.println(bb1);
		
		Bbs bb2=new Bbs(2, "JSP", "오늘은 웹", "김길동");
		System.out.println(bb2);
		
		Bbs bb3=new Bbs(3, "SPRING", "오늘은 실무웹", "이길동");
		System.out.println(bb3);
	}

}
