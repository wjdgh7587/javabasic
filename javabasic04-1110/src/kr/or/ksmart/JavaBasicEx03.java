package kr.or.ksmart;

class UserException extends Exception{
	public UserException(String msg) {
		super(msg);
	}
}

class User{
	public void userPrint(String userName) throws UserException {
			if(userName == null) {
				throw new UserException("userName is null");
			}
		
	}
}
public class JavaBasicEx03 {
	public static void main(String[] args){
		/****
		 * 예외처리 실습2
		 */
		
		/*
		 * 실습2. User 클래스의 userPrint 메소드 호출시 userName의 매개변수 값이 null 일 경우 UserException 클래스로 
		 * 예외가 발생하였다.
		 * 또한 userPrint 메소드를 호출 시에 try catch 블럭 안에서 userPrint를 호출이 되도록 작성이 되어 있다.
		 * 위의 내용대로 코드를 작성하고 userPrint 메소드를 호출하여라.
		 */
		User user = new User();
		try {
			user.userPrint(null);
			
		} catch (UserException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
