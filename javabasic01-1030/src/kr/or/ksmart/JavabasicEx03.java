package kr.or.ksmart;

class Sum {
	public int action(MyNumber number) {
		number.setN1(20);
		number.setN2(80);
		int a = number.getN1();
		int b = number.getN2();
		return a + b;
	}
}


class MyNumber {
	private int n1;
	private int n2;

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

}

public class JavabasicEx03 {

	public static void main(String[] args) {
		/*
		 * 실습3. Sum 클래스에 action이라는 메소드가 있다.
		 * 
		 * action 메소드는 MyNumber이라는 객체를 매개변수로 받고 있다.
		 * 
		 * Sum 클래스의 action을 호출하여 MyNumber의 필드 n1과 n2의 값을 합산하여 그 결과 값을 콘솔에 출력하여라. (n1에 담을
		 * 숫자 20, n2에 담을 숫자 80)
		 * 
		 */
		Sum sum = new Sum();
		MyNumber mynumber = new MyNumber();

		System.out.println(sum.action(mynumber));

	}

}
