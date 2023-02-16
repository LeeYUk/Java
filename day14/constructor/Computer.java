package constructor;

public class Computer {
	
	int num;//가격
	String str;//제조회사
	int size;//모니터 크기
	
	
	public Computer(int num, String str, int size) {
		
		this.num = num;
		this.str = str;
		this.size = size;
	}
	

	@Override
	public String toString() {
		return "모니터 견적 [가격=" + num +"원"+ ", 제조회사=" + str + ", 모니터크기="+ size +"인치" +"]";
	}
	
	
}
