package stockProgram;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawling2 {
	//다음 크롤링
	//크롤링은 인터넷 문서를(html)을 받아와서
	//html 문서를 분석(parser)을 해서 내가 원하는 정보를 추줄하는것

	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://comic.naver.com/index");
		
		Document doc = null; //로컬변수 초기화! 수동으로!
		try {
			doc = con.get();
			Elements list = doc.select(".menu span"); //<a class="txt_pctop">
			System.out.println(list.size());
			for (int i = 0; i < list.size(); i++) {
				Element tag = list.get(i);
				System.out.println(tag.text());
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		} //html코드를 다 가지고 와서 doc변수에 넣어놨음.
	}
}


