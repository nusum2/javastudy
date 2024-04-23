package chapter15.exception2;

//예외처리
import java.io.FileInputStream;
import java.io.FileNotFoundException;

// 예외전가(예외처리 미루기)
public class ThrowsException2 {

	//메서드를 호출한 쪽으로 예외가 넘어간다.
	//예외전가 : 메소드안에서 예외가 발생시 자체 예외처리를 하징낳고 호출한 쪽으로 다시 예외를 돌리는 것을 말함.
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}	
	public static void main(String[] args) {
		ThrowsException2 test = new ThrowsException2();
		
		// multi catch 사용시 여러 예외가 발생한 경우, 가장 큰 예외클래스가 맨마지막에 사용해야 한다.
		//이 메소드가 호출하면서 예외전가에 의하여 예외를 받으면 현재 이 코드에서 예외처리를 해줘야한다.
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (FileNotFoundException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		 

	}

}

