package constructor;

public class BankBook {
//통장
	String name;//이름
	String ssn;//주민번호
	int  money;//돈
	


	// 이름, 주민번호, 돈을 입력해야 통장을 만들게 함
	public BankBook(String name, String ssn, int money) {
		this.name = name;
		this.ssn = ssn;
		this.money = money;
	}



	@Override
	public String toString() {
		return "BankBook [name=" + name + ", ssn=" + ssn + ", money=" + money + "]";//toString
	}
	
	
}
