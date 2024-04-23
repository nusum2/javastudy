package chapter14.collection.treemap;

import java.util.TreeMap;
import java.util.Iterator;

import chapter14.collection.arraylist.Member2;

//ArrayList클래스의 데이터로 Member클래스 사용하기 
public class MemberTreeMap {
	
	//기억장소를 인덱스로 관리하는 특징(순서가 있다.), 데이터 중복 허용
	private TreeMap<Integer, Member2> treeMap;
	
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member2>();
	}
	//데이터 추가
	public void addMember(Member2 member) {
		treeMap.put(member.getMemberId(), member);
	}
	//데이터 제거
	//Collection요소를 순회하는 Iterator작업
		public boolean removeMember(int memberId) {
			
			if(treeMap.containsKey(memberId)) {
				treeMap.remove(memberId);
					return true; 
				}
			
			return false;
			}
	//모든 데이터 보기
	public void showAllMember() {
		Iterator<Integer> ir = treeMap.keySet().iterator();
		while (ir.hasNext()) {
			int key = ir.next();
			//key로 저장된 데이터가 Member
			Member2 member = treeMap.get(key);
			System.out.println(member);
		}
		System.out.println();
 }
}
