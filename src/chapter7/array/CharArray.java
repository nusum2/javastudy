package chapter7.array;

public class CharArray {

	public static void main(String[] args) {
		
		char[] alphabets = new char[26];
		char ch = 'A'; //코드값 65로 저장
		
		for (int i = 0; i < alphabets.length; i++, ch++) {
			alphabets[i] = ch; //ch변수에 +1이 반영된다
		}
		for (int i = 0; i < alphabets.length; i++) {
			System.out.println(alphabets[i] + "," + (int)alphabets[i]);
		}
	}

}
