package chapter14.collection.linkedlist;

import java.util.LinkedList;

//자료구조 : 링크드리스트 예제
//데이터들이 다음 데이터의 주소를 가지고 있는 구조로 관리되고 있다.
public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList<String> mylist = new LinkedList<String>();
		
		mylist.add("A"); //0
		mylist.add("B"); //1
		mylist.add("C"); //2
		
		System.out.println(mylist); //[A,B,C]
		mylist.add(1, "D");
		
		System.out.println(mylist); //[A,D,B,C]
		
		mylist.addFirst("O");
		System.out.println(mylist); //[O,A,D,B,C]
		System.out.println(mylist.removeLast()); //C
		
		System.out.println(mylist); //[O,A,D,B]
	}

}
