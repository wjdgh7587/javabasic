package kr.or.ksmart;

class MyException extends Exception {
	public MyException() {
		super();
	}
	public MyException(String msg) {
		super(msg);
	}
}

class Member{
	public void print(String memberName) {
		try {
			if(memberName == null) {
				throw new MyException("Member name의 값이 null");
			}
		} catch (MyException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public void print(String memberName, String path) throws MyException {
			if(memberName == null || path ==null) {
				throw new MyException("Member name의 값이 null");
			}
		
	}
}
/****************************************
 *  예외처리를 만들어서 사용했기 때문에 얼마든지 가공이 가능하다.
 * 
 * @author Jeongho
 *
 */

public class JavaBasic02 {
	public static void main(String[] args) {
		Member m = new Member();
		m.print(null);
		try {
			m.print(null,null);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
