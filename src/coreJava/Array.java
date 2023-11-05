package coreJava;

public class Array {

	public static void main(String[] args) {
//		int[] a;
//		a=new int[3];
//		a[0]=10;
//		a[1]=11;
//		a[2]=12;
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
//		for(int i:a)
//		{
//			System.out.println(i);
//		}
		
//		int[] b = {40,50,60,1,2,3,4,56,78};
//		for(int i=0;i<b.length;i++)
//		{
//			System.out.println(b[i]);
//		}
//		for(int i:b)
//		{
//			System.out.println(i);
//		}
		
		
//		int[][] a;
//		a=new int[2][3];
//		a[0][0] =10;
//		a[0][1] =20;
//		a[0][2] =30;
//		a[1][0] =40;
//		a[1][1] =50;
//		a[1][2] =60;
//		System.out.println(a[0].length);
//		System.out.println(a[1].length);
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=0;j < a[i].length;j++)
//			{
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println("");
//		}
		
//		int[][] a= {{10,20,30,40},{50,60},{70,80,90}};
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=0;j<a[i].length;j++)
//			{
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println("");
//		}
		
		// Anonymous array;
//		int[][][] n = new int[][][] {{{10,20,30},{40,50},{10,10}}};
//		Sum(n);
		
		
		//travering program
//		int[] a= {10,20,30};
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.print(a[i]+" ");
//		}
//		or
//		for(int i:a)
//		{
//			System.out.print(i+" ");
//		}
//		OR
//		int i=0;
//		while(i<a.length)
//		{
//			System.out.println(a[i]);
//			i++;
//		}
		
//		int[][] a= {{10,20,30},{40,50}};
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=0;j<a[i].length;j++)
//			{
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		}
//		OR
//		for(int ii[]:a)
//		{
//			for(int i:ii)
//			{
//				System.out.print(i+" ");
//			}
//			System.out.println();
//		}
//		OR
//		int i=0;
//		while(i<a.length)
//		{
//			int j=0;
//			while(j<a[i].length)
//			{
//				System.out.print(a[i][j]+" ");
//				j++;
//			}
//			i++;
//			System.out.println();
//		}
		
		
		
		int[][][] a= {{{10,20},{30,40,50},{60}}};
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=0;j<a[i].length;j++)
//			{
//				for(int k=0;k<a[i][j].length;k++)
//				{
//					System.out.print(a[i][j][k]+" ");
//				}
//				System.out.println();
//			}
//			
//		}
//		OR
//		for(int[][] iii:a)
//		{
//			for(int[] ii:iii)
//			{
//				for(int i:ii)
//				{
//					System.out.print(i+" ");
//				}
//				System.out.println();
//			}
//		}
//		OR
//		int i=0;
//		while(i<a.length)
//		{
//			int j=0;
//			while(j<a[i].length)
//			{
//				int k=0;
//				while(k<a[i][j].length)
//				{
//					System.out.print(a[i][j][k]+" ");
//					k++;
//				}
//				j++;
//				System.out.println();
//			}
//			i++;
//		}
		
		
		
		
		
	}
	
	static void Sum(int[][][] n)
	{
		int total =0;
		for(int iii[][]:n)
		{
			for(int ii[]:iii)
			{
				for (int i:ii)
				{
			total=total+i;
				}
			}
		}
		System.out.println(total);
	}
}
