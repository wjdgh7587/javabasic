package kr.or.ksmart;

import java.io.File;
import java.io.IOException;

class My {
	/*
	 * 강제 예외 던지기 및 내부에서 예외 처리
	 * public void print() {
		String str = null;
		try {
			if (str == null)
				throw new Exception("str 이 null 임");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		System.out.println("예외 처리 후에 실행되는 코드");
	}*/

	//강제 예외 던지기 및 예외 위임
	public void print() throws Exception {
		String str = null;
		if(str==null)throw new Exception("Str 이 null 임");
		System.out.println("예외 처리 후에 실행되는 코드");
	}
}

public class JavaBasic01 {
	public static void main(String[] args) throws Exception {
		// File file = new File("D:\\load-text.txt");
		// file.getName();
		//
		// System.out.println(file.getName());
		// try {
		// //file.createNewFile();
		// file.createTempFile("", "");
		// } catch (IOException e) {
		// // TODO: handle exception
		// e.printStackTrace();
		// System.out.println(e.getMessage()+ "111");
		// }
		// try {
		//// String str = null;
		//// boolean isCheck = str.equals("");
		//// System.out.println(isCheck);
		//
		// int[] intArray = new int[1];
		// intArray[1] = 100;
		//
		// }catch(ArrayIndexOutOfBoundsException e){
		// e.printStackTrace();
		// System.out.println(e.getMessage() + " << ArrayIndexOutOfBoundsException");
		// }
		// catch (NullPointerException e) {
		// // TODO: handle exception
		// e.printStackTrace();
		// System.out.println(e.getMessage()+" << NullPointerException");
		// }
		// System.out.println("예외 발생 됬을 경우 아래 코드 실행 여부 확인");

		My m = new My();
		// try {
		// m.print();
		// } catch (Exception e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		m.print();

	}
}
