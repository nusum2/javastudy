package chapter4.ifexample;

public class IfExample2 {

	public static void main(String[] args) {
		
		int age = 9; // 나이
		int charge; // 입장료
		
		if(age < 8) {
			charge = 1000;
			System.out.println("미취학아동입니다.");
		}else if(age < 14){
			charge = 2000;
			System.out.println("초등학생입니다");
		}else if(age < 20) {
			charge = 25000;
			System.out.println("중,고등학생입니다");
		}else {
			charge = 3000;
			System.out.println("일반인입니다.");
		}
		System.out.println("입장료는 " + charge + "원입니다.");
	}

}
