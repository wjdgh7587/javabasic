package kr.or.ksmart;

abstract class Car {
	String carName;
	int move;

	public Car(String carName, int move) {
		this.carName = carName;
		this.move = move;
	}

	public abstract void movePrint();

	public String getCarName() {
		return carName;
	}

	public int getMove() {
		return move;
	}
}

class RacingCar extends Car {

	public RacingCar(String carName, int move) {
		super(carName, move);
	}

	@Override
	public void movePrint() {
		System.out.println(super.getCarName() + "를 타고 씽씽 " + super.getMove() + "만큼 이동했습니다.");
	}
}

class Bus extends Car {

	public Bus(String carName, int move) {
		super(carName, move);
	}

	@Override
	public void movePrint() {
		System.out.println(super.getCarName() + "를 요금을 지불하고 " + super.getMove() + "만큼 이동했습니다.");
	}
}

public class javaBasic06 {
	public static void main(String[] args) {
		/************************************
		 * 다형성 예제
		 ************************************/

		Car car = null;
		String carName = "버스"; // 파라미터 가정
		int move = 500;// 파라미터 가정

		if ("레이싱카".equals(carName)) {
			car = new RacingCar(carName, move);

		} else if ("버스".equals(carName)) {
			car = new Bus(carName, move);

		}
		car.movePrint();
	}
}
