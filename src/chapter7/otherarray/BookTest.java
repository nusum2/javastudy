package chapter7.otherarray;

import chapter7.array.Book;

public class BookTest {
	public static void main(String[] args) {
		//생성자의 접근자 이해때문에 작성
		//default는 동일 패키지 접근, 다른 패키지 접근 불가
		//public은 패키지 상관없이 모두 접근
		Book b1 = new Book();
	}
}
