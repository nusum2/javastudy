package chapter7.array;

//생성자를 하나도 만들지 않으면 컴파일 과정에서 자동생성
//클래스 배열(객체배열)을 만들기위한 클래스
public class Book {
	
	//필드
	private String bookName; //제목
	private String author; //저자
	
	//Book(){} //접근자가 default 의미가 생략됨
	
	//생성자 중복정의, 생성자는 리턴타입을 사용하지 않는다
	public Book() {}
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	//getter / setter 메소드 작성
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	//일반메소드
	public void showBookInfo() {
		System.out.println(bookName + "," + author);
	}
}
