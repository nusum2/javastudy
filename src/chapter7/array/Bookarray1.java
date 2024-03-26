package chapter7.array;

public class Bookarray1 {

	public static void main(String[] args) {
		
		//스택영역(주소) -> 힙영역(데이터)
		//메모리구조 표현
		//new book(); 힙영역에 실제 데이터를 저장하기위한 기억장소가 생성(객체생성)
		Book b1 = new Book("인공지능", "홍길동");
		Book b2 = new Book("머신러닝", "손흥민");
		Book b3 = new Book("딥러닝", "김민재");
		
		System.out.println(b1.getBookName() + "/" + b1.getAuthor());
		System.out.println(b2.getBookName() + "/" + b2.getAuthor());
		System.out.println(b3.getBookName() + "/" + b3.getAuthor());
		
		//클래스배열(객체배열)
		//스택영역(주소) -> 힙영역(주소) -> 힙영역(데이터)
		//메모리 구조 표현
		Book[] bookArray = new Book[3]; //힙영역에서 실제 데이터가 생성되는 주소를 참조하는 기억장소
		bookArray[0] = new Book("인공지능", "홍길동"); //실제 데이터가 관리되는 힙영역의 기억장소 생성작업
		bookArray[1] = new Book("머신러닝", "손흥민");
		bookArray[2] = new Book("딥러닝", "김민재");
		
		System.out.println(bookArray[0].getBookName() + "/" + bookArray[0].getAuthor());
		System.out.println(bookArray[1].getBookName() + "/" + bookArray[1].getAuthor());
		System.out.println(bookArray[2].getBookName() + "/" + bookArray[2].getAuthor());
		
		for (int i = 0; i < bookArray.length; i++) {
			System.out.println(bookArray[i].getBookName() + "/" + bookArray[i].getAuthor());
		}
	}

}
