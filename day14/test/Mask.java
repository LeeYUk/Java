package test;

public class Mask {
	String color;//색
	int price;//가격
	int num;//갯수
	
	public Mask(String color, int price, int num) {
		this.color = color;
		this.price = price;
		this.num = num;
	}

	@Override
	public String toString() {
		return "마스크 [색=" + color + ", 가격=" + price + ", 갯수=" + num + "]";
	}
	
	
	
	
}
