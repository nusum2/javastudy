package chapter5.classpart2;

public class StudentTest1 {

	public static void main(String[] args) {
		
		// 메모리구조 : https://lucas-owner.tistory.com/38
		// 운영체제로부터 JVM이 메모리 할당을 위임받아서 메모리를 여러개의 영역으로 나누어 관리한다
		// 메모리영역 : 여러개로 나누어진다
		// 1)Stack Area 2)Heap Area 3) Method Area(Static Area)
		// Stack Area : 메소드안에 볓수 및 매개변수를 선언하면 메소드가 실행이 될떄 변수 또는 매개변수의
		// Heap Area : 클래스로 객체를 선언하고 실행이 될때 이 영역에 기억장소가 생성
		// 객체생성
		// new : 힙영역의 공간에 메모리(기억장소)를 생성하는 연산자
		
		// 기본데이터타입 8 정수형 : byte, short, int, long
		// 실수형 : float, double 논리형 : boolean
		// 기본데이터타입을 이용하여 메소드 안에서 변수를 선언하면 기억장소는 스택영역에 생성된다
		// 클래스로 변수(객체) 선언하면 스택영역에 4바이트 크기로 생성된다
		// 생성된 기억장소에는 앞으로 힙영역에 생성될 주소가 저장된다
		// 예) Person ps1; ps1 객체는 null을 초기값으로 갖게된다
		int a = 10; // stack area
		char c = '가'; // stack area
		
		Student stu1 = new Student();
		stu1.studentName = "손흥민";
		Student stu2 = new Student();
		stu2.studentName = "이강인";
		
		// chapter5.classpart2.Student@75a1cd57 : 패키지명.클래스명@주소값
		// 주소값을 해시코드(hash code)값이라고도 한다.
		
		System.out.println(stu1); // chapter5.classpart2.Student@75a1cd57
	}

}
