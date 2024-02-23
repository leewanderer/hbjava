package net.hb.day22;

public class Work02max {
	public static void main(String[] args) {
		int a=35, b=9, c=4;  //
		int temp=0;
		//가장 큰수 9를출력
		if(a>b) {temp=a;} //5>9 처리못함
		if(b>a) {temp=b;} //9>4 처리
		if(c>temp ) {temp=c;}//4>9 처리못함
		System.out.println("최대값 = " + temp);
	}//end
}//class END
