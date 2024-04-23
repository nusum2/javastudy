package chapter14.collection.map.hashmap;

import chapter14.collection.arraylist.Member;

public class MemberHashMapTest {
	public static void main(String[] args) {
		
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberSon = new Member(1001, "손흥민");
		Member memberKim = new Member(1002, "김민재");
		Member memberLee = new Member(1003, "이강인");
		Member memberHwa = new Member(1004, "황희찬");
		
		memberHashMap.addMember(memberSon);
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberHwa);
		
		memberHashMap.showAllMember(); //4개 member객체가 출력
		
		//memberHashSet.removeMember(memberHwa.getMemberId()); //황희찬객체 제거
		Member memberLee2 = new Member(1003, "이강인");
		memberHashMap.addMember(memberLee2);
		
		memberHashMap.showAllMember(); //5개 member객체가 출력
		
	}
}
