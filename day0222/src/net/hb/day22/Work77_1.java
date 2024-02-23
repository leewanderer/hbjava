package net.hb.day22;

public class Work77_1 {
	public static void main(String[] args) {
		int a=9, b=8, c=4;
		//작은 숫자부터 출력하기
		if(a<b && a<c && b<c) {System.out.println(a + " " + b + " " + c);}
		else if(a<b && a<c && c<b) {System.out.println(a + " " + c + " " + b);}
		else if(b<a && b<c && a<c) {System.out.println(b + " " + a + " " + c);}
		else if(b<c && b<a && c<a) {System.out.println(b + " " + c + " " + a);}
		else if(c<a && c<b && a<b) {System.out.println(c + " " + a + " " + b);}
		else {System.out.println(c + " " + b + " " + a);}
	}//end		
}//class END
