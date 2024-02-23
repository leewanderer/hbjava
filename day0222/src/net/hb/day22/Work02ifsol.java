package net.hb.day22;

public class Work02ifsol {
	public static void main(String[] args) {
		int a =9, b=8, c=4;
		
		if(a>b) {
			if(b>c) { // a > b > c
				System.out.println(c);
				System.out.println(b);
				System.out.println(a);
			}
			else { // a > b, c > b
				System.out.println(b);
				if(a>c) { // a>b, a>c, c>b
					System.out.println(c);
					System.out.println(a);
				}else {// a>b, c>b, c>a 
					System.out.println(c);
					System.out.println(a);
				}
				
			}
		}
		else { // b > a
			if(a>c) { // b > a, a> c
				System.out.println(c);
				System.out.println(a);
				System.out.println(b);
			}
			else { // b > a, c > a
				System.out.println(a);
				if(b>c) { // b > a, c > a b >c
					System.out.println(c);
					System.out.println(b);
				}
				else { // b > a, c > a, c > b
					System.out.println(b);
					System.out.println(c);
				}
					
			}
		}

	}
}
