package kr.or.ksmart;

//��Ǯ��
class User2 {
	public Member getMember(Member member) {
		// System.out.println(member);
		return member;
	}
}

// ��Ǯ��
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
		 * �ǽ�2. User��� Ŭ������ getMember��� �޼ҵ尡 �ִ�. �� �޼ҵ�� Member ��ü�� ������ �Ѵ�. user Ŭ������
		 *  ��üȭ�Ͽ� getMember ȣ���ϰ� Member�� �޾� �� ��ü �ּ� ���� �ֿܼ� ��½��Ѷ�.
		 * 
		 */
		User2 user2 = new User2();
		User user1 = new User();

		Member member = new Member();

		System.out.println(user2.getMember(member));

		System.out.println(user1.getMember());

	}

}
