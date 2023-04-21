package com.multi.mvc902;

import java.util.Date;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

	@MessageMapping("/chat2")
	@SendTo("/topic/messages2")
	public OutputMessage2 send2(Message message) {
		String menu = "";
		switch (message.getText()) {
		case "1":
			menu = "여행지는 어디로 정하셨나요?>>  10) 산		20) 바다";
			break;
		case "2":
			menu = "여행은 다음기회에..";
			break;
		case "10":
			menu = "여행지는 :산  다음선택지로 이동: 교통을 입력해주세요";
			break;
		case "20":
			menu = "여행지는 : 바다 다음선택지로 이동: 교통을 입력해주세요";
			break;
		case "교통":
			menu = "교통수단>>  1000) 자동차	2000) 걸어다님";
			break;
		case "1000":
			menu = "챗 봇>> 자동차를 타셨군요! ,다음선택지로 이동: 활동을 입력해주세요";
			break;
		case "2000":
			menu = "챗 봇>> 걸어다님  ,다음선택지로 이동: 활동을 입력해주세요";
			break;
		case "활동":
			menu = "챗 봇>> 활동) 활동정인것이 좋음   휴식)휴식";
			break;
		case "활동적":
			menu ="활동적이네요 ,처음단계로 돌아가려면 1을 입력";
			break;
		case "휴식":
			menu ="쉬고싶어요  ,처음단계로 돌아가려면 1을 입력";
			break;
		default:
			menu = "챗 봇>>선택한 선택지는 없는 메뉴입니다. 다시 입력해주세요.";
			break;
		}
		OutputMessage2 outputMessage2 = new OutputMessage2(menu);
		return outputMessage2;
	}
	
	//ws프로토콜로 요청을 받음.
	@MessageMapping("/chat")
	@SendTo("/topic/messages")
	public OutputMessage send(Message message) {
		System.out.println("서버에서 받은 데이터>> " + message); //서버에서 받은 클라이언트의 채팅 내용을 확인 
		Date date = new Date(); //java.util.Date;
		int hour = date.getHours();//시 
		int min = date.getMinutes();//분 
		String time = hour + ":" + min;
		//채팅방에 들어와있는 모든 클라이언트에게 보낼 데이터 
		OutputMessage output = new OutputMessage(message.getFrom(), message.getText(), time);
		return output; //return데이터는 json으로 만들어서 클라이언트 브라우저에 보냄.
		//jackson-databind
	}
}
