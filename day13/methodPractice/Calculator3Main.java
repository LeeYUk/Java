package methodPractice;

public class Calculator3Main {

	public static void main(String[] args) {
		//Calculator3 class 메인
		
		Calculator3 cal3=new Calculator3();//메소드 호출
		int price=7000;
		int count1=5;//오전에 온 손님
		int count2=4;//오후에 온 손님
		
		//Calculator3 이용
		//1. 전체 손님 수를 반환 받아서 다음과 같이 출력
		//  오늘 온 손님의 총 합은 9명
		int data1= cal3.add(count1,count2);
		System.out.println("오늘 온 손님의 총 합은 "+data1+"명");
		
		//2. 오전과 오후의 손님수 차이는?
		//  손님 수 차이는 1명입니다
		int data2= cal3.minus(count1,count2);
		System.out.println("오전과 오후의 손님수 차이는 "+data2+"명");
		
		//3. 오전에 들어온 손님의 결제 금액은?
		//  오전결제금액은35000 입니다
		int data3=cal3.mul(price, count1);
		System.out.println("오전에 들어온 손님의 결제 금액 "+data3+"명");
		
		//4.오후에 들어온 손님의 결제 금액은?
		//  오후 결제 금액은28000원입니다
		int data4=cal3.mul(price, count2);
		System.out.println("오전에 들어온 손님의 결제 금액 "+data4);
		
		//5. 오전과 오후에 들어온 손님의 총 결제 금액은?
		//  오늘 하루 총 결제 금액은 63000원 입니다.
		int data5=cal3.add(data3, data4);
		System.out.println("오전 오후 손님의 총 결제 금액 "+data5);
		
		//6. 5번에서 계산한 결제 금액으로 1인당 결제 금액을 계산해주세요
		//  1인당 결제 금액은 7000원 입니다
		double data6=cal3.div(data5, data1);
		System.out.println("1인당 결제 금액은"+data6);
		
	
		
	}

}
