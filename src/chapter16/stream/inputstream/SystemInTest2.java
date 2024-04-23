package chapter16.stream.inputstream;

import java.io.IOException;

public class SystemInTest2 {

	public static void main(String[] args) {
		System.out.println("알파벳 여러개를 쓰고 엔터를 누르세요.");
		
		int i;
		
		try {
			//괄호안이 먼저 해석
			//임의의 키를 누르고 마지막에 엔터를 누르면 10진수 13으로 처리되고, 문자로 표현시 \n으로 나타낸다.
			while ((i = System.in.read()) != '\n') { //엔터키를 누르지 않았을 동안에는
				System.out.println((char)i);
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
