package kr.or.ksmart;

class MyClass{
	String myName;
	int age;
}

public class Javabasic07 {

	public static void main(String[] args) {
		/*********************************************
		 * class
		 *********************************************/
		/*
		 * - java 프로그래밍에는 1개 이상의 클래스가 필요하다.
		 * - 클래스는 속성과 행동에 관련된 멤버로 이루어져 있다.
		 * - 속성 : 필드 (상태 및 특성, 값)
		 * - 필드 구문 : 접근 지정자 타입 식별자 로 선언가능
		 * - 행동 : 메소드
		 * - 메소드 구문 : 접근지정자 리턴타입 메소드명 (매개변수..)
		 * - 사물의 특성 및 상태에 맞는 주제로 클래스를 구성 하여야 한다.
		 * - 클래스를 사용하기 위해서는 객체화(인스턴스화)가 되어야 한다.
		 * - java 파일에는 1개 이상의 class가 있다.
		 * */
		
		/*********************************************
		 * 객체화(인스턴스화)
		 *********************************************/
		//구문 : 참조타입 식별자 = new 참조타입();
		/*
		 * - 객체화는 new 연산자 키워드로 가능하다.
		 * - 클래스의 멤버를 사용하기 위해서는 객체화가 되어야 한다.
		 * */
		MyClass my = null;
		
		
		my = new MyClass();// 참조되는 주소값이 아래와 다르다.
		my.age = 20;
		my.myName = "홍길동";
		System.out.println(my);
		System.out.println(my.age + " - "+my.myName);
		
		my = new MyClass();//참조되는 주소값이 아래와 다르다.
		my.age = 25;
		my.myName = "이순신";
		System.out.println(my);
		System.out.println(my.age + " - "+my.myName);
		
	}

}
