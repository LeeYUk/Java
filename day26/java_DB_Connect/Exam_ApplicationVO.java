package java_DB_Connect;

public class Exam_ApplicationVO {
	private String id;
	private String cert_name;
	private String cert_day;
	private String cert_num;
	
	//id
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	//cert_name
	public String getCert_name() {
		return cert_name;
	}
	public void setCert_name(String cert_name) {
		this.cert_name = cert_name;
	}
	
	//cert_day
	public String getCert_day() {
		return cert_day;
	}
	public void setCert_day(String cert_day) {
		this.cert_day = cert_day;
	}
	
	//cert_num
	public void setCert_num(String cert_num) {
		this.cert_num = cert_num;
	}
	public String getCert_num() {
		return cert_num;
	}
	
	@Override
	public String toString() {
		return "Exam_ApplicationVO [id=" + id + ", cert_name=" + cert_name + ", cert_day=" + cert_day + ", cert_num="
				+ cert_num + "]";
	}
	
}
