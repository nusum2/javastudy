package chapter15.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		//파일 입출력기능을 제공하는 클래스
		FileInputStream fis = null;
		//예외처리 : try~catch 구문작업을 강제적으로 하게됨		
		try {
			fis = new FileInputStream("a.txt"); //fis 객체 생성
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}finally {
			if (fis != null) {
				try {
					fis.close();
					
				}catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("예외발생과 상관없이 항상 실행됩니다.");
		}
		System.out.println("프로그램 종료");
	}

}
