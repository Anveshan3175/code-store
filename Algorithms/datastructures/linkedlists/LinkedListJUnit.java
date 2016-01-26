package datastructures.linkedlists;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LinkedListJUnit {

	private LinkedList2<Integer> list;
	
	
	@Before
	public void setUp() throws Exception 
	{
		list = new LinkedList2<Integer>();
	}
	
	
	@Test
	public void testSum() {
		assertEquals(11,list.sum(5, 6));
	}
	
	@Test
	public void testLinkedList() {
		list.add(6);
		list.add(36);
		list.add(51);
		list.add(17);
		list.add(87);
		assertEquals(5,list.getSize());
	}

}
