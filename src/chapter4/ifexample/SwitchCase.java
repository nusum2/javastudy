package chapter4.ifexample;

public class SwitchCase {

	public static void main(String[] args) {
		
		int ranking = 1; // 1,2,3 기타 이외의 값
		char medalcolor;
		
		switch (ranking) {
		case 1 : medalcolor = 'G'; // gold
			break;
		case 2 : medalcolor = 'S'; // silver 
			break;
		case 3 : medalcolor = 'B'; // bronze
		    break;
		    default: // if문의 else와 유사하다
		    	medalcolor = 'A';
		}
		System.out.println(ranking + "등 메달의 색깔은? " + medalcolor + "입니다.");
	}

}
