package test0531;

import java.util.Scanner;

class Cal {
	
	public int add(int[] jumsu) {
		int sum = 0;
		for(int i = 0; i < jumsu.length; ++i) {
			sum += i;
		}
		return sum;
	}
	
	public double avg(int[] jumsu) {
		int sum = 0;
		for(int i = 0; i < jumsu.length; ++i) {
			sum += jumsu[i];
		}
		return sum / (double)jumsu.length;
	}
}

public class Test05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 > ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수 > ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수 > ");
		int math = sc.nextInt();
		
		Cal c = new Cal();
		int[]jumsu = new int[] {kor, eng, math};
		
		if((kor > 0) && (eng > 0) && (math > 0)) {
			
			System.out.print("총점 : " + c.add(jumsu) + "점, ");
			System.out.printf("평균 : %.2f점", c.avg(jumsu));
			
		}else {
			System.out.println("계산할 수 없습니다.");
		}
		
		
		
		
		

	}

}
