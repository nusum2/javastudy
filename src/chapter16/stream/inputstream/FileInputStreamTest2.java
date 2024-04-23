package chapter16.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//파일의 내용이 끝인지 아닌지를 while문으로 확인하여 끝까지 읽어오는 예제
public class FileInputStreamTest2 {

	public static void main(String[] args) {
		
		//try() : 객체를 생성하면 자동으로 close()메소드가 내부적으로 호출됨
		//단 사용클래스는 Closeable 인터페이스를 상속 받아야 한다.
		try(FileInputStream fis = new FileInputStream("input.txt")) {
			int i;
			//read()메소드가 읽어온 값이 없을때 -1을 리턴한다.
			while((i = fis.read()) != -1) {
				System.out.println((char)i);
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
