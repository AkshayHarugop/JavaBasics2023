package coreJava;

public class Sorting {

	int[] array;
	int[] tempMergeArr;
	int length;
	public static void main(String[] args) {
		
		//1. bubble sorting
//		int[] a= {36,19,29,12,5};
//		for(int i=0;i<a.length-i;i++)
//		{
//			int flag=0;
//			for(int j=0;j<a.length-1;j++)
//			{
//				if(a[j]>a[j+1])
//				{
//					int temp=a[j];
//					a[j]=a[j+1];
//					a[j+1]=temp;
//					flag=1;
//				}
//			}
//			if(flag==0)
//			{
//				break;
//			}
//		}
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.print(a[i]+",");
//		}
		
		//And for String Sorting
		
//		String[] b= {"Swami","Shubham","Ram","Akshay","Anand"};
//		for(int i=0;i<b.length;i++)
//		{
//			int flag=0;
//			for(int j=0;j<b.length-1-i;j++)
//			{
//				if(b[j].compareTo(b[j+1])>0)
//				{
//					String temp=b[j];
//					b[j]=b[j+1];
//					b[j+1]=temp;
//					flag=1;
//				}
//			}
//			if(flag==0)
//			{
//				break;
//			}
//		}
//		for(int i=0;i<b.length;i++)
//		{
//			System.out.print(b[i]+",");
//		}
		
		//Selection sorting
//		int[] a= {38,52,9,18,6,62,13};
//		for(int i=0;i<c.length;i++)
//		{
//			int min=i;
//			for(int j=i+1;j<c.length;j++)
//			{
//				if(c[j]<c[min])
//				{
//					min=j;
//				}
//			}
//			int temp=c[i];
//			c[i]=c[min];
//			c[min]=temp;
//		}
//		for(int i=0;i<c.length;i++)
//		{
//			System.out.print(c[i]+",");
//		}
		
		//Insertion Soring 
//		int[] a= {5,1,6,2,4,3};
//		for(int i=1;i<a.length;i++)
//		{
//			int j=i, temp=a[i];
//			while(j>0 && temp<a[j-1])
//			{
//				a[j]=a[j-1];
//				j--;
//			}
//			a[j]= temp;
//		}
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.print(a[i]+",");
//		}
		
		
		
		
		//1. bubble sorting
		int[] a= {36,19,29,12,5};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+", ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		//Selection sorting
//		int[] a= {38,52,9,18,6,62,13};
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Insertion Soring 
//		int[] a= {5,1,6,2,4,3};
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int[] array;
//		int[] tempMergeArr;
//		int length;
		
		//Merge Sorting
//		int[] inputArr= {48,36,13,52,19,94,21};
//		Sorting ms = new Sorting();
//		ms.sort(inputArr);
//		for(int i:inputArr)
//		{
//			System.out.print(i+", ");
//		}
		
		
		//Quick Sorting;
//		int[] a= {15,9,7,13,12,16,4,18,11};
//		int length = a.length;
//		Sorting qsm = new Sorting();
//		qsm.quickSort(a,0,length-1);
//		qsm.printArray(a);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

	



	private int pivot(int[] a, int i,int j) {
		int pivot=(j-i)/2;
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
				int temp =a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		return i;
	}
	
	private void quickSort(int[] a, int i, int j) {
		int pi=pivot(a,i,j);
		if(i<pi-1)
		{
			quickSort(a,i,pi-1);
		}
		if(pi<j)
		{
			quickSort(a,pi,j);
		}
	}
	
	private void printArray(int[] a) {
		for(int i:a)
		{
			System.out.print(i+", ");
		}
		
	}

	private void sort(int[] inputArr) {
		this.array=inputArr;
		this.length=inputArr.length;
		this.tempMergeArr=new int[length];
		divideArray(0, length-1);
		
	}

	private void divideArray(int lowerindex, int higherindex) {
		if(lowerindex<higherindex)
		{
			int middle=lowerindex+(higherindex-lowerindex)/2;
			divideArray(lowerindex,middle);
			divideArray(middle+1,higherindex);
			mergeArray(lowerindex,middle,higherindex);
		}
		
	}

	private void mergeArray(int lowerindex, int middle, int higherindex) {
		for(int i=lowerindex;i<=higherindex;i++)
		{
			tempMergeArr[i]=array[i];
		}
		int i=lowerindex;
		int j=middle+1;
		int k=lowerindex;
		while(i<=middle && j<=higherindex)
		{
			if(tempMergeArr[i]<=tempMergeArr[j])
			{
				array[k]=tempMergeArr[i];
				i++;
			}
			else
			{
				array[k]=tempMergeArr[j];
				j++;
			}
			k++;
		}
		while(i<=middle)
		{
			array[k]=tempMergeArr[i];
			k++;
			i++;
		}
		
	}

}
