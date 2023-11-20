package 생성자;

public class 컴퓨터 {

	// 멤버변수
	int price;
	String name;
	int size;

	// 멤버변수값 초기화 역활
	public 컴퓨터(int price, String name, int size) {
		super();
		this.price = price;
		this.name = name;
		this.size = size;
	}

	@Override
	public String toString() {
		return "컴퓨터 [price=" + price + ", name=" + name + ", size=" + size + "]";
	}

}
