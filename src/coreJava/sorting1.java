package coreJava;


public class sorting1 {
	int[] array;
	int[] tempMergeArray;
	int length;

	public static void main(String[] args) {
		// Merge Sorting..
		int[] inputArr= {48,36,13,52,19,94,21};
		sorting1 ms =new sorting1();
		ms.sort(inputArr);
		for(int i:inputArr)
		{
			System.out.print(i+", ");
		}
	}

	private void sort(int[] inputArr) {
		this.array=inputArr;
		this.length=inputArr.length;
		this.tempMergeArray=new int[length];
		divideArray(0,length-1);
	}

	private void divideArray(int lowerindex, int higherindex) {
		if(lowerindex<higherindex)
		{
			int middle=(higherindex-lowerindex)/2;
			divideArray(lowerindex,middle);
			divideArray(middle+1,higherindex);
			mergeArray(lowerindex,middle,higherindex);
		}
		
	}

	private void mergeArray(int lowerindex, int middle, int higherindex) {
		for(int i=lowerindex;i<=higherindex;i++)
		{
			tempMergeArray[i]=array[i];
		}
		int i=lowerindex;
		int j=middle+1;
		int k=higherindex;
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
			k++;i++;
		}
		
	}

}
