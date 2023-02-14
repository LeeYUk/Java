package classApp;

import java.awt.Desktop.Action;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Login {

	public static void main(String[] args) {
		// 로그인 화면

		JFrame f = new JFrame();
		f.setTitle("내 일기장 로그인");
		f.setSize(450, 600);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("궁서", 1, 30);

		JLabel top = new JLabel();
		JLabel id = new JLabel("id : ");
		JLabel pw = new JLabel("pw : ");
		id.setFont(font);
		pw.setFont(font);

		ImageIcon icon1 = new ImageIcon("waf.PNG");
		ImageIcon icon2 = new ImageIcon("icon2.png");
		ImageIcon icon3 = new ImageIcon("icon3.png");
		top.setIcon(icon1);

		JTextField idText = new JTextField(10);
		JTextField pwText = new JTextField(10);
		idText.setFont(font);
		pwText.setFont(font);

		JButton login = new JButton();
		JButton reset = new JButton();
		login.setIcon(icon2);
		reset.setIcon(icon3);

		f.add(top);
		f.add(id);
		f.add(idText);
		f.add(pw);
		f.add(pwText);
		f.add(login);
		f.add(reset);

		// 1.버튼에 액션기능을 add

		reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 리셋버튼 클릭시 발생이벤트 처리 , id pw 텍스트박스 초기화
				idText.setText("");
				pwText.setText("");
			}
		});

		// =============================================

		login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// login버튼 클릭시 발생 이벤트 처리
				String id2 = idText.getText();// id텍스트 박스에 입력된 값을 가져옴
				String pw2 = pwText.getText();// pw 텍스트 박스에 입력된 값을 가져옴

				if (id2.equals("root") && pw2.equals("1234")) {
					JOptionPane.showMessageDialog(f, "로그인 성공");
					
					Diary d=new Diary(); //메소드 호출
					d.open();
					f.setVisible(false);
				} 
				else 
				{
					JOptionPane.showMessageDialog(f, "로그인 실패");
				}

			}
		});

		f.setVisible(true);
	}

}
