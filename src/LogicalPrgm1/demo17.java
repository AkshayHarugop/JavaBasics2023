package LogicalPrgm1;

import java.util.ArrayList;

public class demo17 {
	public static void main(String[] args) {
//Q. If n=18,m=7 how many bits in n should be flipped to make (n==m)? 
//Ans. O/P=3
		/*
		 * 1st convert n=18 to binary : 10010
		 * 2nd convert m=7  to binary : 00111
		 * and compare each and every digit is != then count++ else skip
		 * and at the end display the count
		 */
		ArrayList<Integer> Al1 = new ArrayList<Integer>();
		ArrayList<Integer> Al2 = new ArrayList<Integer>();
		int n=18,m=7,bin=0,bine=0,temp=1,tempe=1,count=0;
		while(n!=0) {
			Al1.add(n%2);
			bin=bin+((n%2)*temp);
			temp=temp*10;
			n=n/2;
		}
		System.out.println(Al1);
		while(m!=0) {
			Al2.add(m%2);
			bine=bine+((m%2)*tempe);
			tempe=tempe*10;
			m=m/2;
		}
		System.out.println(Al2);
		int a = Al1.size();
		int b = Al2.size();
		System.out.println(a);
		System.out.println(b);
		if(a>b) {
			for(int j=1;j<=a-b;j++) {
				Al2.add(0);
			}
			System.out.println(Al2);
			for(int i=0;i<=a-1;i++) {	//i=a
				int c=(int)Al1.get(i);
				int d=(int)Al2.get(i);
				if(c!=d) {
					count++;
				}
			}
		}
		else if (a<b) {
			for(int j=1;j<=b-a;j++) {
				Al1.add(0);
			}
			System.out.println(Al1);
			for(int i=0;i<=b-1;i++) {	
				int c=(int)Al1.get(i);
				int d=(int)Al2.get(i);
				if(c!=d) {
					count++;
				}
			}
		}
		else {
			for(int i=0;i<=b-1;i++) {	
				int c=(int)Al1.get(i);
				int d=(int)Al2.get(i);
				if(c!=d) {
					count++;
				}
			}
		}
		System.out.println(count);
		
		
		
		
//		System.out.println(bin);
//		System.out.println(bine);
//		int a=bin;
//		int b=bine;
//		int c=Integer.toString(a).length();
//		int d=Integer.toString(b).length();
//		System.out.println(c);
//		System.out.println(d);
//		int e,f = 0,g = 0,count=0;
//		if(c>=d) {
//			j=c;	//5
//			e=c-d;	//2
//			for(int i=j;i>=1;i--) {
//				while(c>0) {
//					f = c%10;
//					break;
//				}
//				while(d>0) {
//					g=d%10;
//					break;
//				}
//				if(f!=g) {
//					count++;
//				}
//			}
//			System.out.println(count);
//		}
//		else {
//			j=d;
//			e=d-c;
//		}
		
		
		//bit comparision   //book4 page10
		
		
	}
}
