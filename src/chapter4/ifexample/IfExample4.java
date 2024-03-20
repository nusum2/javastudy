package chapter4.ifexample;

public class IfExample4 {

	public static void main(String[] args) {
		
		// 변수 선언시 초기값을 주거나 코드내에서 변수가 조건에 의하여 값을 가지도록 코딩을 해야한다
		int age = 9; // 나이
		int charge = 0; // 입장료
		
		// 아래 다중 if문에서 조건식이 성립이 안되어 charge변수가 값을 갖지 못하는 경우는 에러 발생
		
		if(age >= 0 && age < 8) { // 0세 이상이고 8세 미만
			charge = 1000;
			System.out.println("미취학아동입니다.");
		}else if(age >= 8 && age < 14){ // 8세 이상 14세 미만
			charge = 2000;
			System.out.println("초등학생입니다");
		}else if(age >= 14 && age < 20) { // 14세 이상 20세 미만
			charge = 25000;
			System.out.println("중,고등학생입니다");
		}else if(age >= 20){ // 20세 이상
			charge = 3000;
			System.out.println("일반인입니다.");
		}
		System.out.println("입장료는 " + charge + "원입니다.");
	}

}
