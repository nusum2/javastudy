package chapter4.loopexample;

// print(), println() 차이
public class PrintExample {
   public static void main(String[] args) {
	   
	   //print() 줄바꿈 기능이 없다. 한줄에 출력
	   for(int i=1; i<=5; i++) {
		   System.out.print(i + "\t");
	   }
	   
	   System.out.println();
	   System.out.println("===================================");
	   
	   //println() 줄바꿈 기능이 있다. 줄이 변경되면서 출력
	   for(int i=1; i<=5; i++) {
		   System.out.println(i);
	   }
}
}
