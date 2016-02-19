package sort;

public class CallbackImpl {

	
	public static void sort(Comparable[] array){
		
		for(int i = 1; i < array.length; i++){
			for(int j = i; j > 0;j--){
				
				if(array[j].compareTo(array[j-1]) < 0) {
					Comparable temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
			
		}
	}
	
	// Helper function for less than
	public static boolean less(Comparable a, Comparable b){
		return a.compareTo(b) < 0;
	}
	
	// Helper function for swap function
	public static void exchange(Comparable[] array,int i,int j){
		Comparable temp = array[i];
		array[i] = array[j];
		 array[j] = temp;
	}
	
	
	public static boolean isSorted(Comparable[] arr){
		for(int i = 1; i < arr.length ; i++){
			//if(arr[i].compareTo(arr[i-1]) < 0)
			if(less(arr[i],arr[i-1]))  // and exchange method can be used in addition to ensure array is sorted
				return false;
		}
		
		return true;
	}
}


