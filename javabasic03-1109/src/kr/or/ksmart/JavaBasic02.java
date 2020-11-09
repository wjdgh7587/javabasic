package kr.or.ksmart;

class My {

}

class My2 {
	// equals 메소드 오버라이드
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;// 안변하는 값
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
		// 즉 필드에 올라오는 값을 비교한다.
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		My2 other = (My2) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "My2 [name=" + name + "]";
	}

}

public class JavaBasic02 {
	public static void main(String[] args) {
		/*************************************
		 * Object 클래스
		 ***************************************/

		/*
		 * extends 가 없는 클래스는 Object 클래스를 상속받는다.
		 * 
		 * equals : 비교대상의 참조된 주소값이 같은지 확인.
		 * 
		 * toString : 객체를 나타내는 문자열을 반환.
		 * 
		 * getClass : Class 타입으로 클래스 정보 반환.
		 * 
		 * hashCode : 두 객체가 같은지 비교
		 *
		 * (hash Table에 저장되는 객체, 객체를 식별할 하나의 정수 값 즉 hashCode는 hasTable 에 저장되는 값들의 주소이다. )
		 */
		My my1 = new My();
		My my2 = new My();
		My my3 = my1;
		
		System.out.println(my1.toString());
		System.out.println(my1.hashCode());
		System.out.println(my1.getClass());
	

		System.out.println(my1.equals(my2));
		System.out.println(my1.equals(my3));
		//object의 toString()
		System.out.println(my1.toString()+ " << toString");
		//hashCode(), equals() 오버라이드
		
		//서로 다른 객체의 값이 같은지 확인하도록 오버라이드
		My2 my21 = new My2();
		my21.setName("홍길동");
		My2 my22 = new My2();
		my22.setName("이순신");
		My2 my23 = new My2();
		my23.setName("홍길동");

		System.out.println(my21.hashCode());
		System.out.println(my22.hashCode());
		
		System.out.println(my23.getClass());
		System.out.println(my21.equals(my22));
		System.out.println(my21.equals(my23));
		
		//오버라이드 된 toString();
		System.out.println(my21.toString()+" << 오버라이드");
	}
}
