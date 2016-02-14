package datastructures.trees;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BinarySearchTreeCoursera2Junit {

	BinarySearchTreeCoursera2 tree;
	
	@Before
	public void setUp() throws Exception {
		tree = new BinarySearchTreeCoursera2();
	}

	@Test
	public void test() {
		tree.add('E');
		tree.add('B');
		tree.add('C');
		tree.add('A');
		tree.add('M');
		tree.add('L');
		tree.add('Q');
		
		assertEquals(true, tree.contains('E'));
		assertEquals(true, tree.contains('B'));
		assertEquals(true, tree.contains('C'));
		assertEquals(true, tree.contains('A'));
		assertEquals(true, tree.contains('M'));
		assertEquals(true, tree.contains('L'));
		assertEquals(true, tree.contains('Q'));
		assertEquals(false, tree.contains('H'));
	}

}
