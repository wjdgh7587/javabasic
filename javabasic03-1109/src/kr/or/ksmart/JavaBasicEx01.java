package kr.or.ksmart;

class Car{
	public void move() {
		System.out.println("car 이동이 되었습니다.");
	}
}
class Bus2 extends Car{
	public void move() {
		System.out.println("Bus가 이동이 되었습니다.");
	}
}
class RacingCar extends Car{
	public void move() {
		System.out.println("RacingCar가 이동이 되었습니다.");
	}
}

public class JavaBasicEx01 {

	public static void main(String[] args) {
		/***********************************
		 * 다형성 및 오버라이딩 복습 
		 *********************************/
		/*
		 * 복습1. Car클래스를 상속받아 구현된 Bus와 RacingCar가 있다.
		 * Bus와 RacingCar를 객체화 하여 move라는 메서드를 실행하니
		 * 결과물이 'Bus가 이동되었습니다.'(Bus객체)와 
		 * 'RacingCar가 이동되었습니다.'(RacingCar객체)
		 * 라는 문구가 출력되었다. 위의 문구가 출력될 수 있도록
		 * 코드를 작성하고 출력하도록 하여라.
		 * 
		 * */
		
		Car car = null;
		car = new Bus2();
		car.move();
		car = new RacingCar();
		car.move();

	}

}
