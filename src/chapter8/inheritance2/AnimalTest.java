package chapter8.inheritance2;

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal animal = new Lion();
		animal.run();
		animal.cry();
		
		if(animal instanceof Lion) {
			Lion lion = (Lion)animal;
			lion.play();
			
		}
	}

}
