package sort;

import java.util.Arrays;

public class InsertionSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {34,21,78,90,4,57};
		System.out.println("Before Sort :"+Arrays.toString(numbers));
		sortInts(numbers);
		System.out.println("After Sort :"+Arrays.toString(numbers));
	}

	
	public static void sortInts(int[] nums){
		int temp;
		for(int i = 1; i < nums.length; i++){
			for( int j = i; j > 0 ; j--){ //Second differentiates the performance of the sort.it executes less for already sorted
				if(nums[j] < nums[j-1]){
					temp = nums[j];
					nums[j] = nums[j-1];
					nums[j-1] = temp;
				}
				else 
					break;
			}
		}
	}
}
