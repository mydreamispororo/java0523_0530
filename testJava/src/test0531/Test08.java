package test0531;

public class Test08 {

	public static void main(String[] args) {
		int[] array = new int[] {8,3,1,6,2,4,5,9};
		
		for(int i = 0; i < array.length; ++i) {
			if(array[i] % 2 == 0) {
				System.out.println(array[i]);
			}
		}
	}
}
