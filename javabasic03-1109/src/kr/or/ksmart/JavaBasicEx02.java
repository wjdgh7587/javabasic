package kr.or.ksmart;

class User{
	private String name;
	private int age;
	public User(String name, int age) {
		this.age=age;
		this.name=name;
	}
	public final String getName() {
		return name;
	}
	public final int getAge() {
		return age;
	}
	public void print() {
		System.out.println(name+""+age+"살"+" 입니다.");
	}
}
class Student extends User{
	public Student(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		//super.print()
		System.out.println(getName()+""+getAge()+"살 입니다.");
	}
}
public class JavaBasicEx02 {
	public static void main(String[] args) {
		/*************************************
		 * final 실습
		 ************************************/
		
		/*
		 * 실습 1. User 클래스를 Student가 상속을 받아 구현을 하는 클래스이다.
		 * User 클래스에는 Student에서 오버라이딩이 불가능한 getName과 getAge라는 메소드가 있으며,
		 * 오버라이딩이 가능한 print라는 메소드가 있다.
		 * Student 클래스가 객체화 되어 print라는 메소드 실행시 출력 문구가 '홍길동 20살 입니다.' 출력이 되었다.
		 * 위의 문구가 출력이 되도록 코드를 작업하고 실행하여라.
		 * 
		 */
		User user = new Student("홍길동", 20);
		user.print();
		
	}
}
