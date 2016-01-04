package com.anvesh.coursera.ds;

public class BinarySearch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {6,23,34,78,98,109};
		int toFind = 109;
		System.out.println(binarySearch(nums,toFind));
	}

	
	
	public static boolean binarySearch(int[] numsArr, int toFind){
		int low = 0,high = numsArr.length,mid = 0;
		while (low <= high){
			mid = (low + high)/2;
			if(toFind == numsArr[mid]){
				return true;
			}
			else if(toFind < numsArr[mid]){
				high = mid -1;
			}
			else
				low = mid + 1;
		}
		return false;
		
	}
}
