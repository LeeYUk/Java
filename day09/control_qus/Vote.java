package control_qus;

import java.util.Random;
import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
	// 인기투표 시스템
		//1)아이유 2)방탄 3)뉴진스 4)종료 >>
		Scanner sc=new Scanner(System.in);
		System.out.println("인기투표시스템");
		System.out.println("==================");
		
		int iu  = 0;
		int bts=0;
		int njs=0;
		
		for (; ; ) {
			System.out.println("당신의 1등에게 투표하세요!");
			System.out.print("1)아이유 2)방탄 3)뉴진스 4)종료 >>");
			int num = sc.nextInt();
			
			if (num == 4) {
				System.out.println("시스템 종료");
				break;
				
			} else if (num == 2) {
				bts++;
				
			} else if (num == 3) {
				njs++;
				
			} else if (num == 1) {
				iu++;
			} 
			else {System.out.println("해당 번호가 없습니다");}
		}
		System.out.println("-----------------");
			System.out.println("아이유"+iu+"표");
			System.out.println("방탄"+bts+"표");
			System.out.println("뉴진스"+njs+"표");
		
		sc.close();
		
		System.out.println("아이유"+iu+"방탄"+bts+"뉴진스"+njs);
	}

}
