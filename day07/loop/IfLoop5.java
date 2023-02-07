package loop;

public class IfLoop5 {

	public static void main(String[] args) {
		//if 문
		
		
	String ssn = "1055111";// 주민번호 뒷자리
	
	//String은 기본형 데이터가 아니여서 명령어(함수)를 사용해야함
	if(ssn.equals("2055111")) {
		System.out.println("동일한 지역에서 태어나셨군요!!");
	}
	else {
		System.out.println("동일한 지역에서 태어난게 아니시군요");
	}
	
	char gender = ssn.charAt(0);//첫번쨰 자리는 0 즉 첫번쨰자리에 있는 문자 추출
	
	switch (gender) {
	case '1': case '3':
		System.out.println("man");
		break;
	case 2: case 4:
		System.out.println("woman");
		break;
	}
	
 }

}
