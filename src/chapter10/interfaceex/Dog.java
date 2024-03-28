package chapter10.interfaceex;

public class Dog implements Animal {

	@Override
	public void run() {
		System.out.println("강아지가 달린다.");
	}

	@Override
	public void cry() {
		System.out.println("강아지가 운다.");
	}

}
