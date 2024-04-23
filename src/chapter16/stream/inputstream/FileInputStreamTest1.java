package chapter16.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//입출력스트림을 바이트 단위로 작업하는 예제
//input.txt 파일의 내용을 읽어오는 작업
public class FileInputStreamTest1 {

	public static void main(String[] args) {
		
		//읽기(입력), 바이트단위, 파일
		FileInputStream fis = null;
		
		try {
			//fis객체 : 연결통로(빨대)
			//fis = new FileInputStream("C:\\Dev\\Lecture\\JavaWork\\study\\src\\chapter16\\stream\\inputstream\\input.txt"); //파일이 존재 하지않을 경우 대비 예외처리
			
			//study프로젝트 밑에 파일을 위치해야 동작됨
			fis = new FileInputStream("input.txt"); //파일이 존재 하지않을 경우 대비 예외처리
			
			System.out.println((char)fis.read()); //a
			System.out.println((char)fis.read()); //b
			System.out.println((char)fis.read()); //c
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(fis != null) {
				try {
					fis.close();
				}catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("프로그램 종료");
	}

}
