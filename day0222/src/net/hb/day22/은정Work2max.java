package net.hb.day22;
public class 은정Work2max {
	public static void main(String[] args) {
		int a=5, b=9, c=4;
		//가장 큰수 9출력 if제어문으로
		if(a>b)b=a;
		if(c>b)b=c;
		System.out.println("최대값은 "+b);
		
	}//end
}//class end
