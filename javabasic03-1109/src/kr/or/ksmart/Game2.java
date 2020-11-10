package kr.or.ksmart;

interface Server2{
	public String getServer();
	public String getChannel();
}

interface Character2{
	public String getTribe();
	public String getgender();
	public String getJob();
	public String getMorality();
	public String getNickname();
}

interface item{
	void potion(int a);
	void food(String b);
}

interface CharactersSlot2{
	public String getChracterNumber();
}

class Something implements item{
	@Override
	public void potion(int a) {
		System.out.println("물약을 "+ a + "개 먹었습니다.");
	}

	@Override
	public void food(String b) {
		System.out.println(b +" 먹었습니다.");		
	}
}
class Character12 extends Something implements Server2, Character2 ,CharactersSlot2{
	@Override
	public String getNickname() {
		return "두목님";
	}

	@Override
	public String getMorality() {
		return "착한사람";
	}

	@Override
	public String getJob() {
		return "야만용사";
	}

	@Override
	public String getgender() {
		return "여자";
	}

	@Override
	public String getTribe() {
		return "거란족";
	}

	@Override
	public String getChannel() {
		return "한국스마트정보교육원";
	}

	@Override
	public String getServer() {
		return "37기";
	}

	@Override
	public String getChracterNumber() {
		return "1번";
	}
	
}

public class Game2 {
	public static void main(String[] args) {
		Character12 c12 = new Character12();
		Server2 s2= c12;
		Character2 cs= c12;
		CharactersSlot2 css = c12;
		
		System.out.println(s2.getChannel()); 
		System.out.println(s2.getServer()); 
		System.out.println(cs.getgender()); 
		System.out.println(cs.getJob()); 
		System.out.println(cs.getMorality()); 
		System.out.println(cs.getNickname()); 
		System.out.println(cs.getTribe());
		System.out.println(css.getChracterNumber());
		
		Something sm = c12;
		
		sm.potion(4);
		sm.food("기름진고기");
	}
	

}
