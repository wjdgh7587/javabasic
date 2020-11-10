package kr.or.ksmart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
interface Character{
	final String jong = "human";
	final String startMap = "단풍나무 언덕";
	public void mainaction();
}

interface Warrior extends Character{
	final int Strength = 10; 
	final int Intelligence = 5;
}
interface Wizard extends Character{
	final int Strength = 5; 
	final int Intelligence = 10;
}

class Hero implements Warrior {
	@Override
	public void mainaction() {
		System.out.println("검을 휘두른다.");
		System.out.println(Strength*5 +"만큼의 피해를 입혔다.");
	}
}
class Paladin implements Warrior {
	@Override
	public void mainaction() {
		System.out.println("방패로 막는다.");
		System.out.println(Strength*6 +"만큼의 피해를 막았다.");
	}
}
class Fire implements Wizard{
	@Override
	public void mainaction() {
		System.out.println("파이어볼 던진다");
		System.out.println(Intelligence*8 +"만큼의 피해를 입혔다.");
	}
}
class Cold implements Wizard{
	@Override
	public void mainaction() {
		System.out.println("얼음 던진다");
		System.out.println(Intelligence*7 +"만큼의 피해를 입혔다.");
	}
}

class Move implements Character{
	@Override
	public void mainaction() {
		System.out.println("이동했습니다.");
	}
}

public class Game {

	public static void main(String[] args) throws IOException {
		System.out.println("직업을 선택하세요.");
		System.out.println("1. 히어로");
		System.out.println("2. 팔라딘");
		System.out.println("3. 불마법사");
		System.out.println("4. 얼음마법사");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String job = br.readLine();
		Character character = null;
		Character moveCharacter = null;
		
		switch (job) {
		case "1":
			character = new Hero();
			break;
		case "2":
			character = new Paladin();
			break;
		case "3":
			character = new Fire();
			break;
		case "4":
			character = new Cold();
			break;
		default:
			System.out.println("보기에 있는 번호를 선택해 주세요");
			break;
		}
		
		System.out.println("행동을 선택하세요.");
		System.out.println("1. 이동");
		System.out.println("2. 공격");
		String action = br.readLine();
		switch (action) {
		case "1":
			moveCharacter = new Move();
			moveCharacter.mainaction();
			break;
		case "2":
			character.mainaction();
			break;
		default:
			System.out.println("보기에 있는 번호를 선택해 주세요");
			break;
		}
	}
}

