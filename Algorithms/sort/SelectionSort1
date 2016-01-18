import java.util.Arrays;

public class SelectionSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] arr = {20,12,10,15,2};
		int[] arr = {4,7,2,10,1,8};
		System.out.println("Before Sort :"+Arrays.toString(arr));
		sortArrayUsingFewerSwaps(arr);
		//System.out.println("After Sort :"+Arrays.toString(arr));
	}

	public static void sortArrayUsingMoreSwaps(int[] nums){
		int temp = 0;
		for(int i = 0; i < nums.length-1; i ++){
			for(int j = i+1 ; j < nums.length;j++){
				if(nums[i] > nums[j]){
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
			System.out.println("After pass "+(i+1)+" :"+Arrays.toString(nums));
		}
	}
	
	public static void sortArrayUsingFewerSwaps(int[] nums){
		int temp = 0,minIndex;
		for(int i = 0; i < nums.length-1; i ++){
			minIndex = i;
			for(int j = i+1 ; j < nums.length;j++){
				if(nums[minIndex] > nums[j]){
					minIndex = j;
				}
			}
			if(minIndex > 0) {
				temp = nums[i];
				nums[i] = nums[minIndex];
				nums[minIndex] = temp;
			}
			System.out.println("After pass "+(i+1)+" :"+Arrays.toString(nums));
		}
	}
}
