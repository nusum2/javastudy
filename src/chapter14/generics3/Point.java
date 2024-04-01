package chapter14.generics3;

//멀티타입 파라미터
public class Point<T, V> {
	
	//필드
	T x;
	V y;
	
	//생성자
	public Point(T x, V y) {
		this.x = x;
		this.y = y;
	}
	public T getX() {
		return x;
	}
	public V getY() {
		return y;
	}
	//제네릭클래스 객체생성
	/*
	 * Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0);
	 * Point<Integer, Double> p1 = new Point<>(10, 10.0);
	 */
}
