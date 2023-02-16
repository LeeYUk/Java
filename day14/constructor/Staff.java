package constructor;

public class Staff {
	String name;
	int age;
	char gen;
	
	static int count;
	static int sum;
	
	
	public static void getAvg() {
		System.out.println(sum/count);
	}
	
	public Staff(String name, int age, char gen) {
		
		count++;
		sum+=age;
		this.name = name;
		this.age = age;
		this.gen = gen;
	}
	


	@Override
	public String toString() {
		return "직원 [이름=" + name + ", 나이=" + age + ", 성별=" + gen + "]";
	}
	
	
	
}
