package kr.or.ksmart;

class NewClass {
	private String name;

	// 매개변수가 있는 생성자 메소드 오버로딩
	public NewClass() {
		System.out.println("생성자 메소드 호출");
		this.name = null;
	}

	// 리턴타입이 없고 클래스 명과 같은 메소드명은 생성자 메소드이다.
	public NewClass(String name) {
		this(); // this 키워드를 활용하여
		System.out.println(name + "생성자 메소드 호출");
	}

}

public class JavaBasic02 {
	public static void main(String[] args) {
		/************************************
		 * 생성자 메소드
		 ************************************/

		/*
		 * - 기본적으로 생략된 메소드
		 * 
		 * - 클래스 명과 같은 메소드이며 리턴타입 지정이 없다.
		 * 
		 * - 클래스가 객체화 될때 자동 실행되는 메소드이다.
		 * 
		 * - 주로 멤버의 데이터를 초기 값으로 설정시 사용된다.
		 * 
		 * - 생성자 메소드로 오버로딩이 가능하다.
		 * 
		 * - this()를 활용하여 생성자 메소드를 호출 가능
		 */

		NewClass n = new NewClass("홍길동");
		System.out.println(n);
	}
}
