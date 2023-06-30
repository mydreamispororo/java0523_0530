package member;


import java.util.ArrayList;
import java.util.List;

import member.domain.Member;

public class Member_Ex {

	public static void main(String[] args) {
		List<Member> aList = new ArrayList<Member>();
		Member member = null;
//		Member mem = new Member();
//		
//		//저장할 변수값 : html 폼으로 입력받은 값
//		
//		String num = "100";
//		String name = "1234";
//		String pwd = "0000";
//		
//		//객체지향언어 캡슐화 방법론에 따라 객체명.set필드명(변수명)
//		//데이터베이스 사용x -> 작업 내용은 메모리 지정(주기억장치)에 저장
//		mem.setMemID(num);
//		mem.setMemName(name);
//		mem.setMemPWD(pwd);
//		
//		aList.add(mem); //row(레코드, 줄)를 만들기 위한 구문
//		
//		//list 가변배열 : size();
//		//array 고정배열 : length
//
//		mem.disp(aList);
		
		//10명 입력
		String num = "A";
		String name = "홍길동";
		String pwd = "pass";
		
		//객체10
		for(int i = 0; i < 10; ++i) {
			member = new Member();
			member.setMemID(num + " - " + i);
			member.setMemName(name + " - " + i);
			member.setMemPWD(pwd + " - " + i);
		
			aList.add(member);
		}
		
		member.disp(aList);
		
		
		

	}

}
