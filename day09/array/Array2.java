package array;

public class Array2 {

	public static void main(String[] args) {
		// 1.배열에 일주일간 공부한 시간을 저장해보세요 {1,2,3,4,5,6,7}; 벼열 이름을 week
		//2. 첫번째 위치와 두번쨰 위치값을 출력
		//3. week배열에 들어있는 데이터 수를 출력
		//4.세번째 위치값을 10으로 넣어주세요
		//다섯번째 위치값을 12로 넣어주세요.
		//5.세번째 다섯번째 위치값을 출력
		//----------------------------
		//6.배열을 처을에 만들때 값을 모름 크기는 4개
		//저장공간을 안단 만들어두자. 배열이름 tour
		//7.첫번째 인덱스 에20,세번쨰 위치에 30을 넣고나서 출력
		//8.tour변수의 개수를 출력
		
		
		int week[]= {1,2,3,4,5,6,7};//1
		System.out.println(week[0]+","+week[1]);//2
		System.out.println("데이터의 수는"+week.length);//3
		week[2]=10;//4
		week[4]=12;//5
		System.out.println(week[2]+","+week[4]);
		
		System.out.println("-----------------------------");
		int tour[]=new int[4];//6
		
		tour[0]=20;//
		tour[2]=30;//
		System.out.println(tour[0]+","+tour[2]);//7
		System.out.println("공간의 수는 "+tour.length);//8
		
		
	}

}
