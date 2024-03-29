package chapter14.generics;

//제네릭 기능이 있는 클래스
//<T> : 타입 파라미터
public class GenericPrinter<T> {
	
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	@Override
	public String toString() {
		
		return material.toString();
	}
	
}
