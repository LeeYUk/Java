package casting;

public class BasicCasting {

	public static void main(String[] args) {
		//기본형 형변환
		
		byte b1=100;//1바이트 ,-128~127
		int i1=200;//4바이트 , -21억~21억
		
		//i1=b1; //자동형변환
		
		//b1=(byte)i1;//강제형변환
		
		//double(큰) <-int (작음)
		//double d1= i1;//자동형변환
		//i1=(int)d1;//강제형변환
		
		int i2=2000;
		byte b2=(byte)i2;//byte의 범위를 넘어선 127이상의 숫자는 강제형변환하지 말아야함 
		
	}

}
