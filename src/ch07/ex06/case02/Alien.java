package ch07.ex06.case02;

public class Alien extends Life {
	//@Override
	public static void eat() {
		System.out.println("Alien 먹다.");
	}
	
	@Override
	public void shout() {
		System.out.println("Alien 소리치다.");
	}
}
