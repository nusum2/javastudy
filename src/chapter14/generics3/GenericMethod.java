package chapter14.generics3;

public class GenericMethod {
	
	//제네릭 메소드 문법형식
	//<T,V> : 메소드 타입파라미터
	//제네릭 메소드 호출 : GenericMethod.<Integer, Double>makeRectangle(null, null);
	//<T,V> double makeRectangle(Point<T,V> p1, Point<T,V> p2)
	public static <T, V> double makeRectangle(Point<T,V> p1, Point<T,V> p2) {
		double left = ((Number)p1.getX()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;
		
		return width * height;
	}
	public static void main(String[] args) {
		//제네릭 메소드 호출
		Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0);
		Point<Integer, Double> p2 = new Point<>(10, 10.0);
		
		//제네릭 메소드 호출
		double rect = GenericMethod.<Integer, Double>makeRectangle(p1, p2);
		System.out.println("두 점으로 만들어진 사각형의 넓이는 " + rect + "입니다.");
		
		//GenericMethod.<Long, Double>makeRectangle(null, null);
	}
}
