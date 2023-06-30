package test;

class Calcu {
	//홀수, 짝수 판단하는 메소드 : % 2 == 0 false 아니면 true
	public boolean isoddEven(int num) {
//		if(num % 2 == 0) {
//			return false;
//			
//		}else {
//			return true;
//		}
		return num % 2 != 0;
		
		
	}
		
	}

public class Test03 {

	public static void main(String[] args) {
		
		//입력한 숫자가 홀수인지, 짝수인지를 구분하시오
				//단, 홀수면 true, 짝수면 false 를 출력(글자x)
				//홀수, 짝수 판단은 메소드 작성
				//홀수, 짝수 판단은 Calculator 클래스를 생성 후 메소드 작성
				int num1 = 5;
				int num2 = 10;

				Calcu cal = new Calcu();
				System.out.println(cal.isoddEven(num1));
				System.out.println(cal.isoddEven(num2));
				
				
				

	}

}
