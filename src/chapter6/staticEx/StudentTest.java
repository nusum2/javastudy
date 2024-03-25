package chapter6.staticEx;

public class StudentTest {

	public static void main(String[] args) {
		//JVM이 main()메소드를 호출하면서 프로그램이 실행될 때 Student클래스의 static필드와 메소드를 이용하여 static area에 메모리를 생성
		//static area에 메모리를 단 1번만 생성
		
		Student stu1 = new Student();
		stu1.setStudentName("손흥민");
		//static메소드는 클래스명.메소드명()으로 호출해야한다. 객체.메소드명()으로 호출은 되나 사용하지 말것
		Student.getSerialNum();
		System.out.println(Student.getSerialNum()); //1
		
		Student stu2 = new Student(); //스택영역과 힙영역에 메모리 생성
		stu2.setStudentName("김민재");
		Student.getSerialNum();
		System.out.println(Student.getSerialNum()); //2
	}

}
