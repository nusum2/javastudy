package chapter3.operator;

// 증감연산자 ++, --
// 변수앞 또는 변수뒤에 사용되느냐에 따라 동작(해석)이 달라진다.
public class OperationEx2_2 {

	public static void main(String[] args) {
        
		int gameScore = 150;
		
		// ++가 뒤에 사용되면 변수의 값을 먼저 읽어와서 좌측에 대입하고 나중에 +1을 변수에 적용한다
		int lastScore1 = gameScore++;
		System.out.println(lastScore1); // 150
		
		// --가 뒤에 사용되면 변수의 값을 먼저 읽어와서 좌측에 대입하고 나중에 -1을 변수에 적용한다
		int lastScore2 = gameScore--; // 151
		System.out.println(lastScore2);
		System.out.println(gameScore);
	}

}
