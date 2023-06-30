package test0531;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성적 > ");
		int score = sc.nextInt();
		
		System.out.print("학년 > ");
		int age =  sc.nextInt();
		
		if((age == 4) && (score >=70)) {
			System.out.println("합격");
		}else if ((score >= 60) && (age < 4)) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		

	}

}
