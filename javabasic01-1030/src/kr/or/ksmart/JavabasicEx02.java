package kr.or.ksmart;

//내풀이
class User2 {
	public Member getMember(Member member) {
		// System.out.println(member);
		return member;
	}
}

// 쌤풀이
class User {
	public Member getMember() {
		return new Member();
	}
}

class Member {

}

public class JavabasicEx02 {

	public static void main(String[] args) {
		/*
		 * 실습2. User라는 클래스에 getMember라는 메소드가 있다. 이 메소드는 Member 객체를 리턴을 한다. user 클래스를
		 *  객체화하여 getMember 호출하고 Member를 받아 그 객체 주소 값을 콘솔에 출력시켜라.
		 * 
		 */
		User2 user2 = new User2();
		User user1 = new User();

		Member member = new Member();

		System.out.println(user2.getMember(member));

		System.out.println(user1.getMember());

	}

}
