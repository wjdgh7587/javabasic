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
		//1. private STPT(){}; 생성자 메소드의 접근 지정자가 private 임으로 직접 객체화 할 수 가 없다.
		//STPT st = new STPT();
		
		
		//2. private static STPT instance;
		//외부에서는 접근을 할 수 없는 필드에 나 자신을 담을 수 있어야 한다.
		//static 키워드를 활용하여 클래스 변수로 만든다.
		
		//3. getInstance 메소드를 생성하고
		//필드 값이 없을 경우 객체 생성 필드 값이 있을 경우 필드 값 리턴을 하도록 한다.
		//필드 > 나 자신 객체
		STPT st = STPT.getInstance();
	}
}
