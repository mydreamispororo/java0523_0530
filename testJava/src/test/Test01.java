package test;

public class Test01 {

	public static void main(String[] args) {
		//1에서 10까지 3의 배수, 5의 배수의 합을 구하시오
//		3의 배수는 3으로 나눴을때 0
//		5의 배수는 5으로 나눴을때 0
		
		
		//반복, 조건문, 산술연산 %
		//AND : 이고, 이면서 - &&
		//OR : 이거나, 또는 - ||
		//sum += i;
		
//		int total = 0;
//		
//		for(int i = 0; i <= 10; ++i) {
//			if((i % 3 == 0) || (i % 5 == 0)) {
//				total += i;
//			}
//		}
//		System.out.println(total);
		
		int a = 0;
		int b = 0;
		int sum = 0;
		
		for(int i = 0; i <= 10; ++i) {
			if(i % 3 == 0) {
				a += i;
			}
			
			if(i % 5 == 0) {
				b += i;
			}
		}
		sum = a + b;
		System.out.println(sum);

	}

}
