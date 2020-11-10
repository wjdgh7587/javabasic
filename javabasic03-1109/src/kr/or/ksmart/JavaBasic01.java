package kr.or.ksmart;

//상속을 할 수 없는 클래스로 만들기
final class Super{
}
//슈퍼 클래스에 final이 붙어 상속이 불가능
//class Sub extends Super{}
//상속 혹은 가공이 불가능하게 만들어진 클래스들은 final이 붙어 있다.
//class Sub1 extends Integer{}

class Super1{
	//final이 붙은 메서드는 서브클래스에서 오버라이딩을 할 수 없다.
	public final void print() {}
}
class Sub2 extends Super1{
	//슈퍼클래스의 print()메서드에 final이 붙어 오버라이딩이 불가능
	//public void print() {}
}


public class JavaBasic01 {
	
	//상수에는 final static 같이 붙는다.
	private final static String NAME = "홍길동";
	
	public static void main(String[] args) {
		/********************************
		 * final
		 *******************************/
		/*
		 * - 클래스, 메서드, 필드(상수) 에 붙을 수 있는 키워드
		 * - 주로 변하지 않는 값들 혹은 변하지 않아야할 대상에 붙인다.
		 * - 클래스 : 상속을 할 수 없다.
		 * - 메서드 : 오버라이딩을 할 수 없다.
		 * - 필드(상수) : 값을 변화 시킬 수 없다.
		 * */
		
		//final이 붙은 클래스 변수는 값을 변화 시킬 수 없다.
		//NAME = "이순신";
		
	}

}
