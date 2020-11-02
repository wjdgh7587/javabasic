package kr.or.ksmart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Javabasic04 {
	public static void main(String[] args) throws IOException {
		System.out.println("문자열을 입력하세요");

		// System.in : 일반적으로 키보드
		/*
		 * in public static final InputStream in
		 * 
		 * The "standard" input stream. This stream is alreadyopen and ready to supply
		 * input data. Typically this streamcorresponds to keyboard input or another
		 * input source specified bythe host environment or user.
		 */
		InputStream in = System.in;
		//표준 입력 장치에서 입력된 값을 전달하는 통로
		InputStreamReader isr = new InputStreamReader(in);
		//입력된 값을 임시적으로 저장하는 공간
		BufferedReader br = new BufferedReader(isr);
				
		//임시적으로 저장을 하겠다고 명령하는 메소드(사용자에게 키보드 입력을 요구)
		//개행에 관련된 문자가 들어왔을 경우 버퍼에 저장된 값을 전달 
		String str = br.readLine();
		System.out.println(str + " : 입력 값");
		
		System.out.println("숫자를 입력하세요");
		String str2 = br.readLine();
		
		int num=0;
		if(str2 != null && !"".equals(str2)) {			
			num = Integer.parseInt(str2);
		}
		
		//평가 내용 부분입니다. ^^
		/*
		 * 문바열을 입력하십시오.
		 * 안녕하세요
		 * 안녕하세요. <입력 값
		 * */
		System.out.println(num + " : 숫자 입력 값");

	}
}
