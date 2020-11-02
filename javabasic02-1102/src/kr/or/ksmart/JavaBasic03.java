package kr.or.ksmart;

import java.util.ArrayList;
import java.util.List;

public class JavaBasic03 {
	String name;// 인스턴스 변수
	static String name2; // 클래스 변수

	static List<String> testlist = new ArrayList<String>();

	public static void main(String[] args) {
		/***********************************
		 * 인스턴스 변수, 인스턴스 메소드
		 ***********************************/
		/*
		 * - 인스턴스 변수 및 인스턴스 메소드는 객체화 후에 접근 할 수 있는(활용이 가능한) 변수와 메소드를 말한다.
		 * 
		 * - 인스턴스 변수 및 인스턴스 메소드는 this 키워드를 활용하여 자기 자신의 인스턴스 변수, 인스턴스 메소드에 접근이 가능하다.
		 */

		JavaBasic03 j = new JavaBasic03();
		j.print();
		j.name = "홍길동";
		System.out.println(j.name + " from j.name");
		System.out.println(j.name2 + " from j.name2");
		/***********************************
		 * 클래스 변수, 클래스 메소드
		 ***********************************/
		/*
		 * - 클래스에 연결된 변수와 메소드를 클래스 변수, 클래스 메소드라고 한다.
		 * 
		 * - static 이라는 키워드가 붙은 변수, 메소드를 말한다.
		 * 
		 * - static이 붙은 변수나 메소드는 stack 메모리 영역에 저장이 된다.
		 * 
		 * - 클래스 변수 및 클래스 메소드는 데이터가 공유가 된다.
		 * 
		 * - 클래스 명으로 클래스 변수, 클래스 메소드에 접근이 가능하다.
		 */

		// 클래스명.클래스메소드
		JavaBasic03.print2();// 클래스 메소드
		JavaBasic03.name2 = "이순신";// 클래스 메소드 값 대입
		System.out.println(JavaBasic03.name2 + " from JavaBasic03.name2");

		JavaBasic03 j2 = new JavaBasic03();
		j2.print(); // 인스턴스 메소드 호출
		j2.name = "고길동"; // 인스턴스 변수에 값 대입
		System.out.println(j2.name + " from j2.name");
		System.out.println(j2.name2 + " from j2.name2");

		for (int i = 0; i < 99; i++) {
			testlist.add("1");
		}
		String a = testlist.get(5);
		System.out.println(a);
	}

	// 객체화가 되어야만 접근이 가능한 메소드
	public void print() {
		System.out.println("프린트");
	}

	// static이 붙어 클래스와 연결된 메소드
	public static void print2() {
		System.out.println("test2");
	}
}
