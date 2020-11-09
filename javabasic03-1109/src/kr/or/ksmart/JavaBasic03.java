package kr.or.ksmart;

abstract class Vehicle {
	abstract void show();
}

class SportCar extends Vehicle {
	@Override
	void show() {

	}
}

class Bus extends Vehicle{
	@Override
	void show() {
		
	}
}

public class JavaBasic03 {
	public static void main(String[] args) {
		/*********************************
		 * 추상클래스
		 *********************************/

		/*
		 * - abstract 라는 키워드가 붙는다.
		 * 
		 * - abstract 라는 키워드가 붙은 메소드를 만들 수 있다.
		 * 
		 * - abstract 키워드가 붙은 메소드는 추상메도스이며, 몸체만 같는다.
		 * 
		 * - 자기 자신이 직접 객체화를 할 수 없다.
		 * 
		 * - 서브 클래스에서 추상 메소드를 구현 해줘야 한다.
		 * 
		 * - 추상메소드와 일반 메소드를 가질 수 있다.
		 * 
		 * - 추상클래스는 extends로 확장 할 수 있다.
		 * 
		 * - 인스턴스 변수(필드), 상수를 가질 수 있다.
		 * 
		 * 구문 : abstract class 클래스명 {}
		 * 
		 * 추상메소드 구문 : 접근지정자 abstract 리턴타입 메소드명 {}
		 * 
		 * 
		 */

		// 추상 클래스는 자기 자신을 객체화 할수 없다.
		//Vehicle v = new Vehicle();
		
		Vehicle v = new SportCar();
		v.show();
		
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
		 */
	}
}
