package ch03.ex05;

public class Overflow {
	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 1_000_000;
		
		long c = a + b;
		System.out.println(c); // 2000000
		
		c = a * b;
		System.out.println(c); // -727379968
		
		c = (long)a * b;
		System.out.println(c); // 10Á¶
		
		int x = a * b / a;
		x = a / b * a;
		System.out.println(x);
	}
}
