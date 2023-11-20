package 생성자복습;

public class Bbs {
	// 1.멤버변수
	public int no;
	public String title;
	public String content;
	public String writer;

	// 객체생성시 4개의 멤버변수를 초기화하고 싶으면 클래스와 동일한 대문자로 시작하는 메서드를 하나만들면된다.
	// 생성자(메서드), constructor
	// 객체생성시 자동호출됨 하지만 다른 생성자가 없으면 파라메터없는 생성자가 묵시적으로 하나 자동생성된다.(보이지는 않음)

	// 2.생성자
	public Bbs(int no, String title, String content, String writer) {
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	// 3.toString()
	@Override
	public String toString() {
		return "Bbs [no=" + no + ", title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}

}
