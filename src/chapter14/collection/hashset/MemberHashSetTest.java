package chapter14.collection.hashset;

import chapter14.collection.arraylist.Member2;

public class MemberHashSetTest {
	public static void main(String[] args) {
		
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member2 memberSon = new Member2(1001, "손흥민");
		Member2 memberKim = new Member2(1002, "김민재");
		Member2 memberLee = new Member2(1003, "이강인");
		Member2 memberHwa = new Member2(1004, "황희찬");
		
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberHwa);
		
		memberHashSet.showAllMember(); //4개 member객체가 출력
		
		//memberHashSet.removeMember2(memberHwa.getMemberId()); //황희찬객체 제거
		Member2 memberLee2 = new Member2(1003, "이강인");
		memberHashSet.addMember(memberLee2);
		
		memberHashSet.showAllMember(); //5개 member객체가 출력
		
	}
}
