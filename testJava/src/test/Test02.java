package test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1. 영문자를 입력한 후 입력한 영문자를 대문자로 변환하여 출력하시오.
			//이름.Uppercase()
			//scanner, next, nextLine
			
//		System.out.print("영문 입력 > ");
//		String s = sc.next();
//		System.out.println(s.toUpperCase());
		
		//2. 사용자가 q를 누를 때까지는 계속 반복하시오.
//		while > switch
//		while > if
		
		//1. 영문자를 입력받아 대문자로 변경하는 프로그램 완성하시오
		//2. q를 입력받기 전까지는 계속해서 프로그램은 실행되어야 한다.
		//3. q를 입력받으면 '시스템이 종료되었습니다.' 라는 메시지를 출력한다.
		while(true) {
			System.out.print("영문 입력 > ");
			String s = sc.next();
			if(s.equals("q")) {
				System.out.println("stop");
				break;
			}else {
//				System.out.println(s);
				System.out.println(s.toUpperCase());
			}
		}
		
		
		

	}

}
