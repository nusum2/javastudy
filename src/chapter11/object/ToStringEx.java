package chapter11.object;

class Book /* extends Object */ {

	// 필드
	int boolNumber;
	String bookTitle;

	public Book(int bookNumber, String bookTitle) {
		super();
		this.boolNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	// 재정의 : 필드의 정보를 확인하는 목적
	
	  @Override 
	  public String toString() {
	  
	  return "Book [bookNumber=" + boolNumber + ", bookTitle=" + bookTitle + "]"; 
	  
	}
	 

}

public class ToStringEx {

	public static void main(String[] args) {

		Book book1 = new Book(200, "개미");

		// toString()메소드를 재정의 안하면 Object클래스의 toString()메소드는
		// 다음과 같이 출력된다. chapter11.object.Book@75a1cd57
		// 재정의 한 경우에는 Book [bookNumber=200, bookTitle=개미]가 출력된다.
		System.out.println(book1); //System.out.println(book1.toString());
	}

}
