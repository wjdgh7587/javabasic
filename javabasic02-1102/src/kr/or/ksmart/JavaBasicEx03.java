package kr.or.ksmart;

class Sum {
	int n1;
	int n2;
	private int result;

	public Sum(int n) {
		this.n1 = n;
		result = n1 * n1;

		// System.out.println(result);
	}

	public Sum(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
		result = n1 * n2;
		// System.out.println(result);
	}

	public int action() {
		return result;
	}
}

public class JavaBasicEx03 {
	/*********************************
	 * 생성자 메소드 오버로딩 실습
	 **********************************/

	/**
	 * 실습2. Sum 클래스 객체화시 인수를 1개 삽입 혹은 2개 삽입하여 객체화를 할 수 있다. 객체화 이후에 action메소드를 호출을
	 * 하고, 그 결과 값을 확인하니 인수 1개를 삽입하여 객체화 했을 경우, 결과 값은 인수 값의 제곱근이며 인수 2개일 경우 2개의 곱이
	 * 나왔다. 결과값 출력
	 */
	public static void main(String[] args) {
		Sum sum = null;
		sum = new Sum(5);
		System.out.println(sum.action());
		sum = new Sum(5, 10);
		System.out.println(sum.action());

	}
}
