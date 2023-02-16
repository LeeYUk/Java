package test;

public class Daughter {
	String name;//이름
	char gen;//성별
	
	static int wallet=10000;//아빠 지갑
	static int count;
	
	
	public void WatchTv(String name, char gen) {
		
		count++;
		wallet-= 1000;
		
		this.name = name;
		this.gen = gen;
	}


	@Override
	public String toString() {
		return "자식 [이름=" + name + ", 성별=" + gen + "]";
	}
	
	
}
