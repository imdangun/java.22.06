package ch07.ex05.case01;

// generic type
public class Basket<E> {
	private E e;
	
	public E get() {
		return this.e;
	}
	
	public void set(E e) {
		this.e = e;
	}
}