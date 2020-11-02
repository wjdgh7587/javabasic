package kr.or.ksmart;

class Gugu {
	public String[] action(int num) {
		String[] strArray = new String[10];

		for (int i = 1; i < strArray.length; i++) {
			int result = num * i;
			// String String_result = Integer.toString(result);
			String total_result = num + "X" + i + "=" + result;
			strArray[i] = total_result;
		}
		
		return strArray;
	}
}

public class JavabasicEx04 {
	public static void main(String[] args) {
		/**
		 * 실습4. Gugu라는 클래스에 action이라는 메소드가 존재한다. action 메소드는 int 형 숫자를 매개변수로 받고 리턴은
		 * String[] 형을 리턴한다. action 실행시 넘어온 매개변수 값 기준으로 구구단을 실행시키고 결과값을 배열에 담아 리턴하고, 그
		 * 결과 값을 콘솔에 출력하도록 하여라.
		 * 
		 */
		Gugu gugu = new Gugu();
		String[] guguArray = gugu.action(5);
		for(int i=0; i<guguArray.length;i++) {
			System.out.println(guguArray[i]);
			}

	}
}
