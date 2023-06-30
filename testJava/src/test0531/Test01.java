package test0531;

public class Test01 {

	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		int sum = 0;
		
		for(int i = 0; i < 1000; ++i) {
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
