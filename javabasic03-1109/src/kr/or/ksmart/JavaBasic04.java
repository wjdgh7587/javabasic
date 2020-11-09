package kr.or.ksmart;

interface Person {
	public String getPersonName();
}

interface School {
	public String getSchoolName();

	public int getSchoolClass();
}

interface Print{
	public void windowPrint();
	public void layerPrint();
}

class PrintAction {//확실하게 해야할 경우 추상메소드(abstract) 사용하고 일반적인 경우는 그냥 사용한다.
	//약간 생성자 메소드와 비슷한듯하다.
	public final void windowPrint() {
		System.out.println("윈도우 프린트");
	}
	public final void layerPrint() {
		System.out.println("레이어 프린트");
	}
}

class Student2 extends PrintAction implements Person, School, Print {

	@Override
	public String getSchoolName() {
		// TODO Auto-generated method stub
		return "한국스마트정보교육원";
	}

	@Override
	public int getSchoolClass() {
		// TODO Auto-generated method stub
		return 202;
	}

	@Override
	public String getPersonName() {
		// TODO Auto-generated method stub
		return "홍길동";
	}

}

class Teacher extends PrintAction implements  Person, School, Print {

	@Override
	public String getSchoolName() {
		// TODO Auto-generated method stub
		return "한국스마트정보교육원";
	}

	@Override
	public int getSchoolClass() {
		// TODO Auto-generated method stub
		return 202;
	}

	@Override
	public String getPersonName() {
		// TODO Auto-generated method stub
		return "이순신";
	}

}

public class JavaBasic04 {
	public static void main(String[] args) {

		/******************************************
		 * 인터페이스
		 ******************************************/
		/*
		 * - 추상 클래스와 비슷하다.
		 * 
		 * - interface 키워드로 접근한다.
		 * 
		 * - 추상 메소드와 상수만 가질 수 있다.
		 * 
		 * - 자기 자신을 객체화 할 수 없다.
		 * 
		 * - 서브 클래스에서 implements 키워드로 활용하여 다중 상속이 가능하다.
		 * 
		 * - 추상메소드만 선언이 가능하여, 서브클래스에서는 인터페이스에 명시된 메소드는 모두 오버라이딩 해야한다.
		 * 
		 * - 인터페이스는 확장을 extends 키워드로 가능하며, 다중 상속이 가능하다.
		 */

		// 서브클래스를 객체화하여 케스팅 하기

		Student2 student = new Student2();

		Person person = student;
		School shcool = student;

		Person person2 = new Student2();
		School shcool2 = (School) person2;

		String type = "student";
		Person person3 = null;
		School school3 = null;
		
		if ("student".equals(type)) {
			person3 = new Student2();
			//school3 = new Student2();
		} else if ("teacher".equals(type)) {
			person3 = new Teacher();
		}
		
		school3 = (School) person3;
		
		System.out.println(school3.getSchoolClass());
		System.out.println(school3.getSchoolName());
		System.out.println(person3.getPersonName());

	}
}
