package sort;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class TestCallbackImpl {

	
	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testSelectionSort(){
		
		Integer[] elems = {56,3,26,90,17,38};
		System.out.println(Arrays.toString(elems));
		SelectionSort.sort(elems);
		System.out.println(Arrays.toString(elems));
		
	}

	//@Test
	public void testTemps(){
		TempComparable a = new TempComparable(10.16);
		TempComparable b = new TempComparable(10.08);
		TempComparable c = new TempComparable(10.00);
		System.out.println(a.compareTo(b));
		System.out.println(b.compareTo(c));
		System.out.println(a.compareTo(c));
		
		assertTrue(true);
	}
	
	
	
	//@Test
	public void test() {
		Integer[] arr = {9,2,45,7,34,3};
		System.out.println(Arrays.toString(arr));
		CallbackImpl.sort(arr);
		System.out.println(Arrays.toString(arr));
		assertEquals("2", arr[0].toString());
	}
	
	//@Test
	public void testObjects() {
		
		class Animal implements Comparable<Animal> {

			private String name;
			
			Animal(String name){
				this.name = name;
			}
			@Override
			public int compareTo(Animal o) {
				// TODO Auto-generated method stub
				return this.name.compareTo(o.name);
			}
			public String toString(){
				return name;
			}
		}
		
		
		Animal a = new Animal("Jackal");
		Animal b = new Animal("Fox");
		Animal c = new Animal("Deer");
		Animal d = new Animal("Fish");
		Animal e = new Animal("Ibex");
		
		Animal[] animalArr = {a,b,c,d,e};
		
		System.out.println(Arrays.toString(animalArr));
		CallbackImpl.sort(animalArr);
		System.out.println(Arrays.toString(animalArr));
	}

}
