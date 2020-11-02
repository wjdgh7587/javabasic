package kr.or.ksmart;

class Super {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class Sub extends Super {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

class SampleSuper {
	public void print() {
		System.out.println("슈퍼클래스 프린트");
	}
}

class SampleSub extends SampleSuper {
	public void print() {
		super.print();
		System.out.println("서브클래스 프린트");
	}
}

class SampleSub2 extends SampleSuper {
	public void print() {
		System.out.println("서브클래스 프린트2");
	}
}

class SampleSub3 extends SampleSuper {
	public void print() {
		System.out.println("서브클래스 프린트3");
	}
}

class SampleSub4 extends SampleSuper {
	public void print() {
		System.out.println("서브클래스 프린트4");
	}
}

class SampleSub5 extends SampleSuper {
	public void print() {
		System.out.println("서브클래스 프린트5");
	}
}

public class JavaBasic05 {
	public static void main(String[] args) {
		/************************************
		 * 상속2
		 ***********************************/

		/*
		 * - 슈퍼 클래스에서 private이라고 지정된 멤버들은 서브 클래스에서 접근을 할 수 없다..
		 */

		/**********************************
		 * 오버라이딩
		 ***********************************/
		/*
		 * - 서버클래스는 슈퍼클래스의 동일한 메소드를 선언할 수 있다. - 서브클래스에서 슈퍼클래스의 동일한 메소드를 대체한다.
		 */

		SampleSub s = new SampleSub();
		s.print();

		/****************************************
		 * 다형성
		 *****************************************/
		/**
		 * 객체화된 서브클래스가 슈퍼클래스의 참조타입으로 대체할 수 있는 방식으로 하나의 참조타입 식별자로 여러개의 서브클래스가 참조 할 수 있다.
		 * 
		 * 서브클래스는 슈퍼 클래스의 멤버를 가지고 있음으로 슈퍼클래스로 케스팅이 가능하다.
		 * 
		 * 서브클래스는 슈퍼 클래스의 멤버를 가지고 있음으로 슈퍼클래스 참조 타입으로 객체화가 가능하다.
		 * 
		 * 상속이라는 조건이 있어야 한다.
		 * 
		 * 서브 클래스 객체화 되었을 경우 업케스팅, 다운 케스팅이 이루어 질 수 있다.
		 * 
		 * - 업케스팅 : 서브클래스 타입에서 슈퍼클래스 타입으로 케스팅.
		 * 
		 * - 다운 케스팅 : 슈퍼클래스 타입에서 서브클래스 타입으로 케스팅.
		 */

		// 슈퍼클래스 참조타입으로 서브클래스 객체화 하기
		SampleSuper ss = new SampleSub();

		// 객체화된 서브 클래스에서 슈퍼클래스로 케스팅하기.
		SampleSub ss2 = new SampleSub();
		SampleSub ss3 = ss2; // 업케스팅
		SampleSub ss4 = (SampleSub) ss3; // 다운케스팅

		// 슈퍼클래스가 객체화 될 당시에 서브 클래스의 객체를 가지고 객체화가 될 수 없다.
		// 슈퍼클래스는 서브클래스타입으로 객체화를 할 수 없다.
		// SampleSub ss4 = new SampleSuper();

		// java.lang.ClassCastException 에러 발생
		// 객체화 되었을 경우 서브클래스 객체를 가지고 있지 않음으로 에러 발생
		// SampleSuper sp = new SampleSuper();
		// SampleSub sp2 = (SampleSub) sp;

		// 다형성
		SampleSuper ssArgs = null;
		int type = 4; // 클라이언트에서 값이 넘어온다는 가정

		if (type == 1) {
			ssArgs = new SampleSub();
		} else if (type == 2) {
			ssArgs = new SampleSub2();
		} else if (type == 3) {
			ssArgs = new SampleSub3();
		} else if (type == 4) {
			ssArgs = new SampleSub4();
		} else if (type == 5) {
			ssArgs = new SampleSub5();
		}
		ssArgs.print();
	}
}
