package kr.or.ksmart;



interface Sauce{
	public void oysterSauce();
	public void redPepper();
	public void fishSauce();
	public void mustard();
}

interface FoodIngredient{
	public void rice();
	public void cabbage();
	public void noodle();
	public void meat();
}

interface Chobab extends Sauce, FoodIngredient{
	@Override
	default void mustard() {
		// TODO Auto-generated method stub
		
	}
}
interface Kimchi extends Sauce, FoodIngredient{
	@Override
	default void redPepper() {
		// TODO Auto-generated method stub
		
	}@Override
	default void fishSauce(){
		// TODO Auto-generated method stub
		
	}
	
}
interface Jjambbong extends Sauce, FoodIngredient{
	@Override
	default void oysterSauce() {
		// TODO Auto-generated method stub
		
	}
}
class FoodStyle implements Kimchi, Chobab,Jjambbong{

	@Override
	public void oysterSauce() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mustard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rice() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cabbage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void noodle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void meat() {
		// TODO Auto-generated method stub
		
	}
	
}
//interface foodStyle extends Chobab, Jjambbong, Kimchi{
//	public void korenFood();
//	public void chineseFood();
//	public void japaneseFood();
//}


class TotalFood extends FoodStyle{
	public void koreanFood() {
		
	}
	public void japaneseFood() {
		
	}
	public void chineseFood() {
		
	}
		
	
}

public class JavaBasicEx01 {
	public static void main(String[] args) {
		/**************************************
		 * 인터페이스 복습
		 ****************************************/
		
		/*
		 * 복습1, '초밥' , '짬통', '김치' 등의 음식이 있다. 위의 음식의 공통점을 찾아 인터페이스로 표현을 할 것이다.
		 * 코드를 작성하도록하여라. 
		 */
		TotalFood total = new TotalFood();
		
		total.koreanFood();
		total.chineseFood();
		total.japaneseFood();
		
		Kimchi kimchi = total;
		Jjambbong jjambbong = total;
		Chobab chobab = total;
		
		kimchi.cabbage();
		kimchi.redPepper();
		kimchi.fishSauce();
		
		jjambbong.meat();
		jjambbong.noodle();
		jjambbong.redPepper();
		
		chobab.rice();
		chobab.mustard();
		
		
		
		
		
	}
}
