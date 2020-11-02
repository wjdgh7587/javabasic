package kr.or.ksmart;

class Person {
	String name;
	int age;
	public Person() {
		System.out.println("슈퍼클래스 기본 생성자 메소드");
}

	public Person(String name, int age) {
		System.out.println("슈퍼클래스 생성자");
	}
}

class Student extends Person {
	int classNumber;
	String schoolName;
	public Student() {
		//super("홍길동", 20);
		System.out.println("서브 클래스 기본 생성자 메소드");
	}
	
	public Student(String name, int age) {
		super(name, age);
		System.out.println("서브 클래스 생성자");
	}
}

public class JavaBasic04 {
	/*******************************************
	 * 상속
	 * 
	 * *****************************************
	 */
	public static void main(String[] args) {

		/*
		 * - 이미 만들어진 클래스를 확장 한다.
		 * 
		 * - 확장 대상은 슈퍼 클래스라고 하며, 확장하는 클래스는 서브클래스라고 한다.
		 * 
		 * - 서브 클래스에서 슈퍼 클래스를 상속받는다.(확장한다.)
		 * 
		 * - extends 키워드로 상속을 받을 수 있다.
		 * 
		 * - 서버 클래스는 슈퍼 클래스의 멤버를 가지고 있다.
		 * 
		 * - 슈퍼 클래스의 생성자 메소드의 실행은 super() 이다.
		 * 
		 * - 슈퍼클래스의 생성자 메소드에 매개변수가 받도록 되어 있다면, 서브 클래스에서 그 해당 값을 받아 슈퍼 클래스의 생성자 메소드 실행시
		 * 값을 전달해 주어야 한다.
		 * 
		 * - 슈퍼 클래스  및 서브 클래스의 생성자 메소드 오버로딩이 가능하다.
		 */

		Student s = new Student();
		s.age = 20;
		s.schoolName = "한국스마트정보교육원";
		s.classNumber = 1;

	}
}
