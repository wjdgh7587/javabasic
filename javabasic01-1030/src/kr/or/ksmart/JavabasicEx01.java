package kr.or.ksmart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavabasicEx01 {
	/*
	 * 실습 1. 키보드 입력 값을 숫자로 받아 해당 단수에 맞는 구구단을 출력하도록 하여라.
	 * */
	
	public static void main(String[] args) throws IOException {
//		System.out.println("구구단 단수를 입력하세용");
//		
//		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
//		
//		String str = buffer.readLine();
//		int str_num = Integer.parseInt(str);
//		
//		for(int i= 1; i < 10; i++) {
//			int result = str_num * i;
//			System.out.println(str_num + "X" + i + "=" + result);
//
//		}
		/*
		 * 실습 2. 사용자에게 키보드 입력을 받아 그 결과를 출력한 결과이다. 아래의 결과물대로 출력되도록 코드를 작성하고 실행하도록 하여라.
		 * 
		 * 결과물 
		 * 키와 몸무게를 입력해주세요
		 *  160 
		 *  72 
		 *  당신의 키는 160이며, 몸무게는 72 입니다.
		 */

		System.out.println("결과물");
		System.out.println("키와 몸무게를 입력해주세요");
		
		BufferedReader buffer1 = new BufferedReader(new InputStreamReader(System.in));

		String height = buffer1.readLine();
		String weight = buffer1.readLine();
		System.out.println("당신의 키는 "+height+" 몸무게는 "+weight+" 입니다.");
	}
}
