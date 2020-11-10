package kr.or.ksmart;

class ExceptionSample{
	public void print(String a) throws Exception{
		if(a==null)throw new Exception("a is null");

		System.out.println("예외 처리 후에 실행되는 코드 : " + a);
	}
	public void print(String a, String b) throws Exception{
		if(a==null || b==null)throw new Exception("a or b is null");

		System.out.println("예외 처리 후에 실행되는 코드 : " + a);
		System.out.println("예외 처리 후에 실행되는 코드 : " + b);
	}
}

public class JavaBasicEx02 {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		
		/*
		 * 실습1. ExceptionSample 클래스에 print라는 메소드가 2개가 존재한다.
		 * 매개변수 1개인 print 메소드 호출시 매개변수값이 null이면
		 * 자체적으로 예외처리하며, 매개변수 2개인 print 메소드는 매개변수 2개의 값이 2개중 하나라도 null 이면 예외하는 메소드이다.
		 * 위의 내용대로 코드를 작성하고 메소드를 호출 하도록 하여라.
		 * */
		
		ExceptionSample es = new ExceptionSample();
		
		try {
			es.print("h", null);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		es.print(null);
		
	}

}
