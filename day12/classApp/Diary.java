package classApp;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Diary {
	//멤버변수 =>안써도 됨
	//멤버 메소드
	public void open() {
		//jframe화면이 보이게
		JFrame f=new JFrame();
		f.setTitle("일기장");
		f.setSize(450,500);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font = new Font("궁서", 1, 30);
		
		JLabel day = new JLabel("오늘의 날짜");
		JLabel title = new JLabel("오늘의 제목");
		JLabel content = new JLabel("오늘의 내용");
		day.setFont(font);
		title.setFont(font);
		content.setFont(font);
		
		
		JTextField dayText = new JTextField(10);
		JTextField titleText = new JTextField(10);
		dayText.setHorizontalAlignment(JTextField.CENTER);
		titleText.setHorizontalAlignment(JTextField.CENTER);
		dayText.setFont(font);
		titleText.setFont(font);
		
		JTextArea contentText=new JTextArea(5,10);
		contentText.setFont(font);
		
		JButton btn =new JButton("파일에 일기 저장");
		btn.setFont(font);
		
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼 클릭 시 발생 이벤트 처리
				String day2 = dayText.getText(); //daytext에 입력된 내용을 get함
				String title2 = titleText.getText();//titletext에 입력된 내용을 get함
				String content2 = contentText.getText();//contenttext에 입력된 내용을 get함
				
				//텍스트를 파일에 저장
				//파일도 만들어주고, 자바프로그램과 file간에 연결통로(강물,stream)을
				//외부에 있는 파일,네트워크나 cpu등을 자바에서 연결할 때는
				//아주 위험한 상활이라고 인식
				//이렇게 위험한 상황에서 만약 문제가 발생하면 어떻게 처리리할지를 꼭 써줘야함
				
				
			try
			{
				FileWriter file= new FileWriter(day2+ ".txt"); //파일 스트림
				file.write(day2+"\n");
				file.write(title2+"\n");
				file.write(content2+"\n");
				file.close();
			} 
			catch (Exception e1) {
				// 에외 처리
				System.out.println("파일로 저장하는 중 문제가 생김");
			}
		  }
			
		});
		
		f.add(day); f.add(dayText);
		f.add(title); f.add(titleText);
		f.add(content); f.add(contentText);
		f.add(btn);
		
		
		f.setVisible(true);
	}

}
