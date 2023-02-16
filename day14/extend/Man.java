package extend;

public class Man extends Object{
	//사람의 기본적인 성질==> 멤버변수
	String name;
	int age;
	
	//사람의 동작 ==> 멤버 메소드
	public void eat() {
		System.out.println("먹다");
	}
	public void sleep() {
		System.out.println("자다");
	}
	@Override
	public String toString() {
		return "Man [name=" + name + ", age=" + age + "]";
	}
}
