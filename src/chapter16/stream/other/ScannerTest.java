package chapter16.stream.other;

import java.util.Scanner;

//Scanner 클래스 사용 : 키보드를 통하여 입력받는 데이터를 더쉽고 편하게 만듦
public class ScannerTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름 : ");
		String name = scanner.nextLine();
		System.out.println(name);
	}

}
