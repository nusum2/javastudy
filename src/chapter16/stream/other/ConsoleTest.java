package chapter16.stream.other;

import java.io.Console;

//jdk 버전 차이로 인해 예제 실행 안됨
//Console 클래스 : 내부적으로 System.in을 사용하지않고 콘솔 내용을 입출력
public class ConsoleTest {

	public static void main(String[] args) {
		
		Console console = System.console();
		
		System.out.println("이름 : ");
		String name = console.readLine();
		System.out.println("직업 : ");
		String job = console.readLine();
		
		System.out.println("비밀번호 : ");
		char[] pass = console.readPassword();
		String strPass = new String(pass);
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(strPass);
	}

}
