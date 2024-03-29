package chapter14.generics;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		//제네릭 클래스를 사용 객체생성
		GenericPrinter<Power> pow = new GenericPrinter<Power>();
		pow.setMaterial(new Power());
		Power power = pow.getMaterial();
		System.out.println(pow);
		
		GenericPrinter<Plastic> pla = new GenericPrinter<Plastic>();
		pla.setMaterial(new Plastic());
		Plastic plastic = pla.getMaterial();
		System.out.println(pla);
	}

}
