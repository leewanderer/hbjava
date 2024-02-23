package net.hb.day22;

public class Test05cal {
	public static void main(String[] args) {
		int a=7, b=2;
		int sum=0, sub=0, gob=0, mok=0, nmg=0;
		
		//문제 1 변수 더하기 hap,total, sum 빼기 sub,cha 곱 mul,gob
		//몫 mok 나머지 nmg
		//문제 2 더하기, 빼기, 곱하기, 몫, 나머지
		//문제 3 출력  system.out.prinln()
		
		sum=a+b;
		sub=a-b;
		gob=a*b;
		mok=a/b;
		nmg=a%b;
		
		//키보드에서 데이터입력 Scanner sc = new Scanner(System.in) ;
		System.out.println(a+"+"+b +"="+sum);
		System.out.println(a+"-"+b +"="+sub);
		System.out.println(a+"*"+b +"="+gob);
		System.out.println(a+"/"+b+"="+mok);
		System.out.println(a+"%"+b+"="+nmg);
	}//end
}//class END
