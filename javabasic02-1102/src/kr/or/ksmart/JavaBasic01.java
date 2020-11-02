package kr.or.ksmart;

import java.io.File;

class MemberDto {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

class MemberService {
	// 회원을 등록한다.
	public int addMember(MemberDto memberDto) {
		// 디비에 회원등록 코드
		return 0;
	}
	// 회원을 등록한다.
	/*
	 * 메소드의 리턴타입으로 메소드 오버로딩 불가 public Sting addMember(MemberDto memberDto) { // 디비에
	 * 회원등록 코드 return 0; }
	 */

	// 회원정보와 사진을 등록한다.
	public int addMember(MemberDto memberDto, File file) {
		this.addMember(memberDto);
		// 파일처리 관련 코드 추가 작업

		return 0;
	}
}

public class JavaBasic01 {
	/******************************
	 * 메소드 오버로딩
	 *******************************/

	/**
	 * 
	 * - 같은 메소드의 명이 2개 이상 정의 할 수 있다. - 매개변수 타입 및 매개변수의 갯수가 달라야한다. - 메소드의 리턴타입으로는 메소드
	 * 오버로딩을 할 수 없다.
	 */
	public static void main(String[] args) {

		File file = null;

		MemberDto memberDto = new MemberDto();
		memberDto.setAge(30);
		memberDto.setName("홍길동");

		int result = 0;

		MemberService memberService = new MemberService();
		if (file != null) {
			result = memberService.addMember(memberDto, file);
		} else {
			result = memberService.addMember(memberDto);
		}

	}

}
