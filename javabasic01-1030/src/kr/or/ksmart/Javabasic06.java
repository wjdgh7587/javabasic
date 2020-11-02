package kr.or.ksmart;

public class Javabasic06 {
	private String name;

	public static void main(String[] args) {
		/*********************************************
		 * 배멸 - 메모리 저장 공간을 분할하여 데이터를 저장
		 *********************************************/
		// 배열 선언
		// 구문 : 타입[] 식별자 = {};
		// 구문2 : 타입[] 식별자 = new 타입[배열의 크기];

		// 기본타입 배열 선언
		int[] intArray = new int[5];
		String[] strArray = new String[5];
		// 참조타입으로 배열이 선언되었을 경우 객체화(인스턴스화)된 객체만 배열에 저장이 가능하다.
		Javabasic06[] myClassArray = new Javabasic06[5];
		myClassArray[0] = new Javabasic06();
		myClassArray[1] = new Javabasic06();
		myClassArray[2] = new Javabasic06();
		myClassArray[3] = new Javabasic06();

		Javabasic06 j = new Javabasic06();
		j.setName("홍길동");
		myClassArray[4] = j;

		/*********************************************
		 * 다차원 배열 - 배열안에 배열
		 *********************************************/
		// 구문 : 타입[][] 식별자 = new 타입[크기][크기];

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
