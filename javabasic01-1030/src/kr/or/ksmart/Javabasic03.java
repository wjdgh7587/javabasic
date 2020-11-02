package kr.or.ksmart;

public class Javabasic03 {
	public static void main(String[] args) {

		/*
		 * 자바에서 다루는 데이터 형
		 * 
		 * boolean -> true or false
		 * 
		 * char -> 2byte 문자(1개 문자열)
		 * 
		 * bye -> 1byte 정수(-128 ~ 127 까지 정수 표현)
		 * 
		 * short -> 2byte 정수(-3276 ~ 32767)
		 * 
		 * int -> 4byte 정수(-2147483648 ~ 2147483647)
		 * 
		 * long -> 8byte 정수(-9223372036854775808 ~ 9223372036854775807)
		 * 
		 * float -> 4byte 부동 소수
		 * 
		 * double -> 8byte 부동 소수
		 * 
		 * 
		 */

		byte b = 127; // 128이 저장이 안됨
		short s = 32767; // 32678 저장이 안됨
		int i = 2147483647; // 2147483648저장이 안됨
		long l = 9223372036854775807L;
		float f = 2147483648.22f;
		double d = 9223372036854775807.0;

	}
}
