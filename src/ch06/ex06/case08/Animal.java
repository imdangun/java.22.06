package ch06.ex06.case08;

public interface Animal {
	default void eat() {
		System.out.println("������ �Դ�.");
	}
	
	void move();
}
