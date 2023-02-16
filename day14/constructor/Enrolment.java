package constructor;

public class Enrolment {
	//수강신청
	
	String sub;
	String time;
	String name;
	
	public Enrolment(String sub, String time, String name) {
		this.sub = sub;
		this.time = time;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Enrolment [과목=" + sub + ", 시간=" + time + ", 이름=" + name + "]";
	}
	
	

}
