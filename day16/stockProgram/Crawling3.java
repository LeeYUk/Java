package stockProgram;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawling3 {
	// 네이버 증권 크롤링
	//크롤링은 인터넷 문서를(html)을 받아와서
	//html 문서를 분석(parser)을 해서 내가 원하는 정보를 추줄하는것
	//select("a") :tag<a>
	//select(".code") :<a class="code">
	//selcet("#userId") : <a id="userId">

	public static void main(String[] args) {
		Connection con1 = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930");
		Connection con2 = Jsoup.connect("https://finance.naver.com/item/main.naver?code=035720");
		Connection con3 = Jsoup.connect("https://finance.naver.com/item/main.naver?code=035420");
		
		Document doc = null; //로컬변수 초기화! 수동으로!
		Document doc2 = null; //로컬변수 초기화! 수동으로!
		try {
			doc = con1.get();
			Elements codelist = doc.select(".code"); //<a class="txt_pctop">
			System.out.println(codelist.size());
			Element tag1 = codelist.get(0);
			String code =tag1.text();
			System.out.println(code);
			
			Elements list=doc.select("span.blind");
			System.out.println(list.size());
			System.out.println(list);
			System.out.println();
			System.out.println(list.get(12));
			Element tag2 = list.get(12);
			String today=tag2.text();
			System.out.println("현재 가 "+today);
			
			System.out.println(list.get(20));
			Element tag3 = list.get(20);
			String low=tag3.text();
			System.out.println("저가 "+low);
			
			System.out.println(list.get(16));
			Element tag4 = list.get(16);
			String high=tag4.text();
			System.out.println("고가 "+high); 
			
			
			
			
			
//			Elements textlist = doc.select(".sptxt.sp_txt9"); //<a class="txt_pctop">
//			System.out.println(textlist.size());
//			Element tag2 = textlist.get(0);
//			String text1 =tag2.text();
//			System.out.println(text1);
//			
//			Elements textlist2 = doc.select(".sptxt.sp_txt10"); //<a class="txt_pctop">
//			System.out.println(textlist2.size());
//			Element tag3 = textlist2.get(0);
//			String text2 =tag3.text();
//			System.out.println(text2);
		} 
		catch (IOException e) 
		{
			//e.printStackTrace();
		} //html코드를 다 가지고 와서 doc변수에 넣어놨음.
		
		
		try {
			doc2 = con2.get();
			Elements codelist2 = doc2.select(".code"); //<a class="txt_pctop">
			System.out.println(codelist2.size());
			Element tag5 = codelist2.get(0);
			String code2 =tag5.text();
			System.out.println(code2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
	}
}


