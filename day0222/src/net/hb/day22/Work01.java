package net.hb.day22;

public class Work01 {
	public static void main(String[] args) {
		int a=9, b=8, c=4;  //적은숫자 출력 4 8 9
		int temp=0, tmp=0;
		//반칙 System.out.println(c+" " +a+ " " +b);
		//if(조건){if~ else} else if (조건){if~else}else if else{if ~else}
		//나중에 배열로 소트처리하면 진짜 쉬워짐
		
		if(a<b&&b<c) {System.out.println(a+" "+b+" "+c);} 
		else if(a<c&&c<b) {System.out.println(a+" "+c+" "+b);} 
		else if(b<a&&a<c) {System.out.println(b+" "+a+" "+c);} 
		else if(b<c&&c<a) {System.out.println(b+" "+c+" "+a);} 
		else if(c<a&&a<b) {System.out.println(c+" "+a+" "+b);} 
		else{System.out.println(c+" "+b+" "+a);} 
		
		
	}//end
}//class END
