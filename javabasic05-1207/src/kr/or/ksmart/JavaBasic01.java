package kr.or.ksmart;

import java.text.SimpleDateFormat;
import java.util.Calendar;

class STPT{
	private static STPT instance;
	
	private STPT() {};
	
	public static STPT getInstance() {
		if(instance == null) instance = new STPT();
		return instance;
	}
}

public class JavaBasic01 {
	/*
	 * 싱글톤 패턴으로 만들어진 켈린더
	 * getInstance 메소드를 호출하여 객체화
	 * */
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal.getTime());
		System.out.println(cal.getTimeZone());
		System.out.println(cal.getWeekYear());
		System.out.println(cal.getFirstDayOfWeek());
		
		cal.add(Calendar.MONTH, -1);
		
//		데이터 포멧양식으로 출력
		//SimpleDateFormat df = new SimpleDateFormat();
		//기본 양식
//		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		//새롭게 양식 세팅
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		또다른 양식
		df.setCalendar(cal);
		df.getTimeZone();
		String dataStr = df.format(cal.getTime());
		System.out.println(dataStr);
		/*yyyy-MM-dd HH:mm:ss
		 * */

		/*직접 싱글톤 패턴 만들기*/
		// private STPT(){}; 생성자 메소드의 접근 지정자가 private 임으로 직접 객체화 할 수 가 없다.
		//STPT st = new STPT();
		
		STPT st = STPT.getInstance();
	}
}
