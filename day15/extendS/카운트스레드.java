package extendS;

import java.util.Date;

public class 카운트스레드 extends Thread {

	@Override
	public void run() {
		for (int i = 1000; i > 0; i--) {
			Date date = new Date();
			System.out.println("타이머>> " + date);
			try {
				Thread.sleep(1000); //1초재워라!
			} catch (InterruptedException e) {
				System.out.println("cpu 연결 문제 생김.");
			}
		}
	}
}
