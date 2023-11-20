package 스태틱;

public class ddal{
	String name;
	String gender;
	static int money;
	static int count = 0;
	int 용돈=0;
	public void tv보다() {
		System.out.println("딸과 tv보는중");
	}

	public ddal(String name, String gender)  {
		super();
		this.name = name;
		this.gender = gender;
		count++;
		용돈 = 1000*count;
		// 용돈=용돈+count; (1000원주는거 해봐)
		
	}
@Override
	public String toString() {
		return "딸 [name=" + name + ", gender=" + gender + ", count=" + count + 용돈+"]";
	}
	
}
