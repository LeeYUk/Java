package classUse;

import classProduce.Tv;

public class TvMain {

	public static void main(String[] args) {
		// TV사용하기
		
		Tv tv1=new Tv();
		tv1.ch=10;
		tv1.vol=9;
		tv1.onOff=true;
		tv1.ChangeCh();
		System.out.println(tv1.ch+" "+tv1.vol+" "+tv1.onOff);
		
		
		Tv tv2=new Tv();
		tv2.ch=20;
		tv2.vol=15;
		tv2.onOff=false;
		tv2.Youtube();
		System.out.println(tv2.ch+" "+tv2.vol+" "+tv2.onOff);

	}

}
