package net.hb.day22;

public class Test04escape {
	public static void main(String[] args) {
		int kor=40, eng=85, total=0;   
		double avg=0.0;

		
		total = kor+eng;
		avg=(double)total/2;  
	
		System.out.println("국어=" + kor);
		System.out.println("영어=" + eng);
		System.out.println("총점=" + total);
		System.out.println("평균=" + avg);
		System.out.println("----------------"); //라인개행역할
		System.out.println("국어\t 영어\t 총점\t 평균");
		System.out.println(kor+"\t"+eng+"\t"+total+"\t"+avg);
		System.out.println("----------------");
		System.out.println("우리나라\t금수강산\t화려강산");
		System.out.println("겨울왕국\t봄꽃축제\t여름바다");
		System.out.println("----------------");
		System.out.println("대한민국\n금수강산\n화려강산");

		
	}//end
}//class END
