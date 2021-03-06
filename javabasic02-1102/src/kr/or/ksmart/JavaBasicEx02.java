package kr.or.ksmart;

class Calculator {

	public int action(int n1, int n2) {
		int result = n1 * n2;

		return result;
	}

	public int action(int n1) {
		int result = n1 * n1;
		
		return result;
	}

}

public class JavaBasicEx02 {
	public static void main(String[] args) {
		/**
		 * 실습1. Calculator 클래스의 action이라는 메소드를 호출할 것이다. action 메소드 호출시 2개의 int형 인수를 삽입하여
		 * 호출시 결과값은 2개의 int형의 곱하기의 결과값이 나오고, 1개의 인수를 삽입하여 호출하게 되면 1개의 인수의 제곱근의 결과값이 나온다.
		 * 코드를 완성시키고 실행하도록하여라. (모든 결과 값을 리턴하도록 하기)
		 */

		Calculator calculator = new Calculator();
		// calculator.action(10, 10);
		// calculator.action(5);

		System.out.println(calculator.action(5));
		System.out.println(calculator.action(10, 10));

	}
}
