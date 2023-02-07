package loop;

public class IfLoop2 {

	public static void main(String[] args) {
		//if 문
		
		int x=0;
		int y=0;
		
		//x와y가 같은지 비교해보고,같으면 "동일" 다르면 "동일하지않음" 출력
		if(x==y) {
			System.out.println("동일");
		}
		else {
			System.out.println("동일하지않음");
		}
		
		
		
		int id =1111;
		int id2=2222;
		//id와 id2가 같은지 비교해보고, 같으면 "로그인 성공",아니면 "로그인 실패" 출력
		
		if(id==id2) {
			System.out.println("로그인성공");
		}
		else if(id!=id2) {
			System.out.println("로그인실패");
		}
	}

}
