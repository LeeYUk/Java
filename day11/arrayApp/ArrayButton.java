package arrayApp;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ArrayButton {

	public static void main(String[] args) {
		// 극장예매시스템

		JFrame f = new JFrame();
		f.setTitle("극장예매시스템");// 프레임 타이틀
		f.setSize(800, 800);
		f.getContentPane().setBackground(Color.GREEN);
		JLabel result = new JLabel("결과 나오는곳");

		// 배치해주는 부품 -FlowLayout
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);// 추가한 순서대로 f에 붙임

		// 버튼배열 생성
		JButton btn[] = new JButton[101];
		// 반복해서 배열에 버튼 만들기
		Font font = new Font("궁서", Font.BOLD, 30);
		// 배열 여부를 저장하는 배열 생성
		int seat[] = new int[101];
		
		// 각 자리에 저장된 값이 0이면 아직 예약이 안되었음0, 예약되면1
		for (int i = 1; i < btn.length; i++) {
			btn[i] = new JButton(i + "");// 버튼에는 int형 데이터가 혼자 못들어감
			btn[i].setFont(font);
			f.add(btn[i]);

			// 버튼에 액션기능 추가
			btn[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// 클릭했을 때 처리할 이벤트 추가
					String text = e.getActionCommand();// 클릭한 버튼의 글자를 가지고 옴
					result.setForeground(Color.blue);
					int no = Integer.parseInt(text);// 버튼의 글자를 int형으로 변환
					// 이미 해당 좌석번호가 1로 저장되어있는지 확인하고 ,1이 아니면 예약가능
					if (seat[no] == 1) {// 이미 예약됨

						result.setText("이미 예약됨");
						result.setForeground(Color.red);
					} else// 아직 예약이 안되어서 0이 들어있어 ,예약가능
					{
						seat[no] = 1;// 예약 완료
						result.setText(text + "번 예약완료");
					}

				}

			});

		}

		result.setForeground(Color.blue);
		result.setFont(font);

		f.add(result);

		JButton total = new JButton("전체 예약 내역");
		total.setBackground(Color.cyan);
		total.setBackground(Color.gray);
		total.setFont(font);

		f.add(total);

		total.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// total클릭했을때 이벤트 추가
				// 배열안에 저장된 수 몇개가 1인지 체크해서 카운트.
				int count = 0;
				for (int x : seat) {
					if (x == 1) {
						count++;
					} 
				} 
				JOptionPane.showMessageDialog(f, (count * 10000) + " 원 결제");
				// 영화예매비 1장동 1만원, 결제금액 출력
			}
		});

		f.setVisible(true);
	}

}
