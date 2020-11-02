package kr.or.ksmart;

class User {
	private String name;

	public User(String name) {
		this.name = name;
	}

	public void print() {
		System.out.println(name + " 안녕하세요!");
	}
	// get, set, 을 사용하여 접근도 가능하지만, 이렇게도 접근이 가능하다.
}

public class JavaBasicEx01 {
	public static void main(String[] args) {
		/*
		 * 복습1. User class의 print 메소드를 실행했더니 결과값이 '홍길동 안녕하세요' 라는 문자열이 출력이 되었다. 이 문자열이
		 * 출력이 되도록 User 추가 코드 작업을 하고 실행하여 위 문자열이 출력 되도록 하여라.
		 */
		String a = "홍길동";
		User user = new User(a);
		user.print();

	}
}
