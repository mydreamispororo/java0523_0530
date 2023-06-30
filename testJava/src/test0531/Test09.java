package test0531;

public class Test09 {

	public static void main(String[] args) {
		String jumin = "001234-2234567";
		
		int a = Integer.parseInt(jumin.substring(7,8));
		
		if(a % 2 == 1) {
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
	}
}
