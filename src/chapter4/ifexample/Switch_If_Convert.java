package chapter4.ifexample;

public class Switch_If_Convert {

	public static void main(String[] args) {
		
		int ranking = 1; // 1,2,3 기타 이외의 값
		char medalcolor = 'A';
		
		if(ranking == 1) {
			medalcolor = 'G';
		}else if(ranking == 2) {
			medalcolor = 'S';
		}else if(ranking == 3) {
			medalcolor = 'B';
		}
		System.out.println(ranking + "등 메달의 색깔은? " + medalcolor + "입니다.");
	}

}
