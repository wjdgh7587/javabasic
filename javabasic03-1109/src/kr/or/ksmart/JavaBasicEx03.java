package kr.or.ksmart;

class Member{

	@Override
	public String toString() {
		return "Member 클래스입니다.";
	}
	
}

public class JavaBasicEx03 {
	public static void main(String[] args) {
		/**********************************
		 * Object 클래스 오버라이드 실습
		 **********************************/
		
		/*
		 * 실습2. Member 클래스에서 Object toString() 메소드를
		 * 오버라이딩을 하여 메소드를 가공하였다.
		 * 그 결과물은 Member 클래스입니다. 라는 결과이 출력되었다.
		 * 위의 내용대로 출력되도록 코드를 작성하고 결과물을 출력하여라.
		 */
		Member member = new Member();
		System.out.println(member.toString());
	}
}
