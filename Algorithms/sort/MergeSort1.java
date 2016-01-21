package sort;

import java.util.Arrays;

public class MergeSort1 {

	private static int[] nums =  {9,8,7,6,10,5,4,3,2,1};   //7,3,9,4,8,2,6,1 {4,9}; //
	//private static  int[] nums = {3,2,1};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Before Merge "+Arrays.toString(nums));
		long startTime = System.nanoTime();
		mergeSort(0,nums.length-1);
		long endTime = System.nanoTime();
		System.out.println("After Merge "+Arrays.toString(nums));
		System.out.println("The time taken to sort is "+(endTime - startTime) +" nano seconds");
	}

	
	private static void mergeSort(int low,int high){
		if(low >= high)
			return ;
		else {
			int mid = (low + high)/2 ;
			mergeSort(low,mid);
			mergeSort(mid+1,high);
			mergeArrays(low,mid,high);
		}
	}
	
	private static void mergeArrays(int low, int mid, int high){
		int[] tempArr = new int[(high - low)+1];
		
		for(int i = low, j = mid+1, b = 0; ;){
			if(nums[i] < nums[j]){
				tempArr[b] = nums[i];b++;
				if(i < mid){
					i++;
				}
				else {
					while(j <= high){
						tempArr[b] = nums[j];j++;b++;
					}
				}
				
			}
			else {
				tempArr[b] = nums[j];b++;
				if(j < high){
					j++;
				}
				else {
					while(i <= mid){
						tempArr[b] = nums[i];i++;b++;
					}
				}
			}
			
			if(b == tempArr.length){
				break;
			}
		}
		int i = 0;
		while(low <= high){
			nums[low] = tempArr[i];
			low++;
			i++;
		}
	}
}
