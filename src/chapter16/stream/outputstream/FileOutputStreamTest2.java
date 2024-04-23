package chapter16.stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("output2.txt", true)) {
			
			byte[] bs = new byte[26]; //알파벳 26개 문자
			byte data = 65; //A
			
			//bs배열에 알파벳 대문자에 해당하는 숫자코드값을 변경하는 작업
			//bs[0]~bs[25]
			for (int i = 0; i < bs.length; i++) {
				bs[i] = data;
				data++;
			}
			fos.write(bs); //배열의 내용을 한번에 텍스트 파일에 쓰기작업
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력완료");
	}

}
