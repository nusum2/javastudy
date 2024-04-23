package chapter14.collection.linkedlist;

import chapter14.collection.arraylist.Member;

public class MemberLinkedListTest {
	public static void main(String[] args) {
		
		MemberLinkedList memberLinkedList = new MemberLinkedList();
		
		Member memberSon = new Member(1001, "손흥민");
		Member memberKim = new Member(1002, "김민재");
		Member memberLee = new Member(1003, "이강인");
		Member memberHwa = new Member(1004, "황희찬");
		
		memberLinkedList.addMember(memberSon);
		memberLinkedList.addMember(memberKim);
		memberLinkedList.addMember(memberLee);
		memberLinkedList.addMember(memberHwa);
		
		memberLinkedList.showAllMember(); //4개 member객체가 출력
		
		memberLinkedList.removeMember(memberHwa.getMemberId()); //황희찬객체 제거
		
		memberLinkedList.showAllMember(); //3개 member객체가 출력
		
	}
}
