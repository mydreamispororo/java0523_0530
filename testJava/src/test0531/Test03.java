package test0531;

import java.util.Scanner;

class Calculator {
	//홀수, 짝수 판단하는 메소드 : % 2 == 0 false 아니면 true
	public boolean isoddEven(int num) {
		return num % 2 != 0;
	}
}

public class Test03 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 > ");
		int num = sc.nextInt();
		

		Calculator cal = new Calculator();
		System.out.println(cal.isoddEven(num));
		
		
		
		
		
		
		
		
		

	}

}
