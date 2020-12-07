package kr.or.ksmart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GenericEx01<T>{
//	<>는 타입
	private T name;

	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}
	
}

class GenericEx02 <K, V>{
	
//	private Map<K, V> map;
//	
//	public GenericEx02() {
//		this.map = new HashMap<K, V>();
//	}
	private K[] kArray;
	private V[] vArray;
	
}

interface GenericSuperEx03<T>{
	
}
class GenericEx03<T> implements GenericSuperEx03<T>{
	
}

public class GenericEx {

	public static void main(String[] args) {
		/*
		 * 제네릭을 활용한 자바 컬렉션
		 * 제네릭 - > 객체화시 타입 (형) 확정
		 * */
		
		//제네릭 없이 객체화 하기
		
		List list1 = new ArrayList();
		list1.add("홍길동");
		list1.add(20);
		
		//제네릭이 없기 때문에 케스팅이 필요하다.
		
		String name = (String) list1.get(0);
		int age = (int) list1.get(1);
		
		//제네릭을 활용하여 객체화
		List<String> list2 = new ArrayList<String>();
		list2.add("홍길동");
		
		//제네릭 활용하여 객체화가 되었기 때문에 형변환 없이 값을 가지고 올 수 있다.
		
		String name2 = list2.get(0);

		///////////////////////////////////////////////////////////////
		// 제네릭 기법으로 클래스 선언과 호출 (객체화)
		
		/*
		 * 제네릭 기본 변수 표기
		 * T >> 자료형(자료형)
		 * E >> Element(배열 혹은 집합)
		 * K >> key
		 * V >> value 
		 */
		//////////////////////////////////////////////////////////////
		
		GenericEx01<String> ex01 = new GenericEx01<String>();
		ex01.setName("홍길동");
		String nameEx01 = ex01.getName();
		System.out.println(nameEx01);
		
		
		/********************************************************
		 * 실습2. GenericEx02를 생성하되 키와 값의 타입을 지정할 수 있는
		 * GenericEx02를 생성하도록 하여라.
		 * *******************************************************/
		
		GenericEx02<String, String> ex02 = new GenericEx02<String, String>();
		
		/**************************************************************
		 * 상속 제네릭 활용
		 **************************************************************/
		GenericSuperEx03<String> ex03 = new GenericEx03<String>();
		
	}

}
