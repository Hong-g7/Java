package 상속_문제;

public class 직원 {
	String name = "고명보";
	String address = "송천동 에코시티";
	int salary = 1234;
	int rrn = 123;
	
	@Override
	public String toString() {
		return "직원 [name=" + name + ", address=" + address + ", salary=" + salary + ", rrn=" + rrn + "]";
	}
}
