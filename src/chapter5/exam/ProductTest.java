package chapter5.exam;

public class ProductTest {

	public static void main(String[] args) {
		
		Product p1 = new Product();
		
		System.out.println("p1.name의 값은? " + p1.name);
		System.out.println("p1.price의 값은? " + p1.price);
		
		Product p2 = new Product("TV", "5만원");
		System.out.println("p2.name의 값은? " + p2.name);
		System.out.println("p2.price의 값은? " + p2.price);
	}

}
