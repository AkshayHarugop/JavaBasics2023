package coreJava;

public class MergeSort {
	int[] array;
	int[] tempMergeArray;
	int length;
	
	public static void main(String[] args) {
		int[] inputarr= {48,36,13,52,19,94,21};
		MergeSort ms =new MergeSort();
		ms.sort(inputarr);
		for(int i:inputarr)
		{
			System.out.print(i+", ");
		}
		
	}

	private void sort(int[] inputarr) {
		this.array=inputarr;
		this.length=inputarr.length;
		this.tempMergeArray=new int[length];
		divideArray(0,length-1);
		
	}

	private void divideArray(int lowerindex, int higherindex) {
		if(lowerindex<higherindex)
		{
			int middle=lowerindex+(higherindex-lowerindex)/2;
			divideArray(lowerindex,middle);
			divideArray(middle+1,higherindex);
			sort(lowerindex,middle,higherindex);
		}
		
	}

	private void sort(int lowerindex, int middle, int higherindex) {
		for(int i=lowerindex;i<=higherindex;i++)
		{
			tempMergeArray[i]=array[i];
		}
		int i=lowerindex;
		int j=middle+1;
		int k=lowerindex;
		while(i<=middle && j<=higherindex)
		{
			if(tempMergeArray[i]<=tempMergeArray[j])
			{
				array[k]=tempMergeArray[i];
				i++;
			}
			else
			{
				array[k]=tempMergeArray[j];
				j++;
			}
			k++;
		}
		while(i<=middle)
		{
			array[k]=tempMergeArray[i];
			i++;
			k++;
		}
		
	}

	
}
