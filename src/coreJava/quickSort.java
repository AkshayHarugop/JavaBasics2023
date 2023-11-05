package coreJava;

public class quickSort {

	public static void main(String[] args) {
		int[] a= {15,9,7,13,12,16,4,18,11};
		int leng= a.length;
		quickSort qsr=new quickSort();
		qsr.quickSortRecursion(a,0,leng-1);
		for(int k=0;k<a.length;k++)
		{
			System.out.print(a[k]+", ");
		}
		

	}

	private void quickSortRecursion(int[] a, int i, int j) {
		int endValue = pivot(a,i,j);
		if(i<endValue-1)
		{
			pivot(a,i,endValue-1);
		}
		if(endValue<j)
		{
			pivot(a,endValue,j);
		}
		
	}

	private int pivot(int[] a, int i, int j) {
		int pivot = (j-i)/2;
		while(i<=j)
		{
			while(a[i]<pivot)
			{
				i++;
			}
			while(a[j]>pivot)
			{
				j--;
			}
			if(i<=j)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
		}
		return i;
		
	}

}
