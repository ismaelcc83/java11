package jeps_286;

public class test2 {
	
	public static void main(String args[]) throws Exception {
		try {
			var car = 'a';
			var num = 1;
			num = car;
			System.out.println("Num: " + num);
		} catch (Exception e) {
			System.out.println("Exception in method main");
		}
	}
}
