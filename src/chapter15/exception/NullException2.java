package chapter15.exception;

public class NullException2 {

	public static void main(String[] args) {
		//참조타입은 기본값으로 보통 null 사용
		String str = null;
		//예외처리
		try {
		System.out.println(str.toString()); //예외발생 오류데이터
		}catch (NullPointerException ex) {
			ex.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}

}
