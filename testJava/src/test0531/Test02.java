package test0531;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("영문 입력 > ");
			String str = sc.next();
			if(str.equals("END")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println(str.toUpperCase());
			}
		}

	}

}
