package test.java;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.java.Item;
import main.java.SortAlgos;

public class AlgoTest {
	private Item[] itemsA;
	private Item[] itemsASorted;
	private Item[] itemsB;
	private Item[] itemsBSorted;
	private Item[] itemsC;
	private Item[] itemsCSorted;	
	
	private Item[] makeItemArray(int[] a) {
		Item[] tmp = new Item[a.length];
		for(int i = 0; i < a.length; i++) {
			tmp[i] = new Item(a[i]);
		}
		return tmp;
	}
	
	private boolean compareItems(Item[] a, Item[] b) {
		if(a.length == b.length) {
			for(int i = 0; i < a.length; i++) {
				if(a[i].key != b[i].key) {
					return false;
				}
			}
		} else {
			return false;
		}
		return true;
	}
	
	@Before
	public void setUp() throws Exception {
		int[] intA = {1,0};
		int[] intASorted = {0,1};
		int[] intB = {1,0,2};
		int[] intBSorted = {0,1,2};
		int[] intC = {5,4,3,2,1};
		int[] intCSorted = {1,2,3,4,5};
		itemsA = makeItemArray(intA);
		itemsASorted = makeItemArray(intASorted);
		itemsB = makeItemArray(intB);
		itemsBSorted = makeItemArray(intBSorted);
		itemsC = makeItemArray(intC);
		itemsCSorted = makeItemArray(intCSorted);
	}

	// Node and condition coverage for bubble sort
	@Test
	public void nodeBubbleTest() {
		assertFalse("They aren't sorted yet",
				compareItems(itemsA,itemsASorted));
		SortAlgos.bubbleSort(itemsA);
		assertTrue("They are sorted now",
				compareItems(itemsA,itemsASorted));
	}
	
	// Edge and condition coverage for bubble sort
	@Test
	public void edgeBubbleTest() {
		assertFalse("They aren't sorted yet",
				compareItems(itemsB,itemsBSorted));
		SortAlgos.bubbleSort(itemsB);
		assertTrue("They are sorted now",
				compareItems(itemsB,itemsBSorted));
	}
	
	// Edge and condition coverage for bubble sort
	@Test(expected = NullPointerException.class)
	public void nullBubbleTest() {
		Item[] tmp = null;
		SortAlgos.bubbleSort(tmp);
	}
	
	// Node and condition coverage for heap sort
	@Test
	public void nodeHeapTest() {
		assertFalse("They aren't sorted yet",
				compareItems(itemsA,itemsASorted));
		SortAlgos.heapSort(itemsA);
		assertTrue("They are sorted now",
				compareItems(itemsA,itemsASorted));
	}
	
	// Edge and condition coverage for heap sort
	@Test
	public void edgeHeapTest() {
		assertFalse("They aren't sorted yet",
				compareItems(itemsB,itemsBSorted));
		SortAlgos.bubbleSort(itemsB);
		assertTrue("They are sorted now",
				compareItems(itemsB,itemsBSorted));
	}
	
	// Edge and condition coverage for quick sort
	@Test
	public void reverseEdgeHeapTest() {
		assertFalse("They aren't sorted yet",
				compareItems(itemsC,itemsCSorted));
		SortAlgos.heapSort(itemsC);
		assertTrue("They are sorted now",
				compareItems(itemsC,itemsCSorted));
	}
	
	// Edge and condition coverage for heap sort
	@Test(expected = NullPointerException.class)
	public void nullHeapTest() {
		Item[] tmp = null;
		SortAlgos.heapSort(tmp);
	}
	
	// Node and condition coverage for insertion sort
	@Test
	public void nodeInsertionTest() {
		assertFalse("They aren't sorted yet",
				compareItems(itemsA,itemsASorted));
		SortAlgos.insertionSort(itemsA);
		assertTrue("They are sorted now",
				compareItems(itemsA,itemsASorted));
	}
	
	// Edge and condition coverage for insertion sort
	@Test
	public void edgeInsertionTest() {
		assertFalse("They aren't sorted yet",
				compareItems(itemsB,itemsBSorted));
		SortAlgos.insertionSort(itemsB);
		assertTrue("They are sorted now",
				compareItems(itemsB,itemsBSorted));
	}
	
	// Edge and condition coverage for insertion sort
	@Test(expected = NullPointerException.class)
	public void nullInsertionTest() {
		Item[] tmp = null;
		SortAlgos.insertionSort(tmp);
	}

	// Node and condition coverage for merge sort
	@Test
	public void nodeMergeTest() {
		assertFalse("They aren't sorted yet",
				compareItems(itemsA,itemsASorted));
		SortAlgos.mergeSort(itemsA);
		assertTrue("They are sorted now",
				compareItems(itemsA,itemsASorted));
	}
	
	// Edge and condition coverage for insertion sort
	@Test
	public void edgeMergeTest() {
		assertFalse("They aren't sorted yet",
				compareItems(itemsB,itemsBSorted));
		SortAlgos.mergeSort(itemsB);
		assertTrue("They are sorted now",
				compareItems(itemsB,itemsBSorted));
	}
	
	// Edge and condition coverage for insertion sort
	@Test(expected = NullPointerException.class)
	public void nullMergeTest() {
		Item[] tmp = null;
		SortAlgos.mergeSort(tmp);
	}
	
	// Node and condition coverage for quick sort
	@Test
	public void nodeQuickTest() {
		assertFalse("They aren't sorted yet",
				compareItems(itemsA,itemsASorted));
		SortAlgos.quickSort(itemsA);
		assertTrue("They are sorted now",
				compareItems(itemsA,itemsASorted));
	}
	
	// Edge and condition coverage for quick sort
	@Test
	public void edgeQuickTest() {
		assertFalse("They aren't sorted yet",
				compareItems(itemsB,itemsBSorted));
		SortAlgos.quickSort(itemsB);
		assertTrue("They are sorted now",
				compareItems(itemsB,itemsBSorted));
	}
	
	// Edge and condition coverage for quick sort
	@Test
	public void reverseEdgeQuickTest() {
		assertFalse("They aren't sorted yet",
				compareItems(itemsC,itemsCSorted));
		SortAlgos.quickSort(itemsC);
		assertTrue("They are sorted now",
				compareItems(itemsC,itemsCSorted));
	}
	
	// Edge and condition coverage for quick sort	
	@Test(expected = NullPointerException.class)
	public void nullQuickTest() {
		Item[] tmp = null;
		SortAlgos.quickSort(tmp);
	}
	
	// Node and condition coverage for selection sort
	@Test
	public void nodeSelectionTest() {
		assertFalse("They aren't sorted yet",
				compareItems(itemsA,itemsASorted));
		SortAlgos.selectionSort(itemsA);
		assertTrue("They are sorted now",
				compareItems(itemsA,itemsASorted));
	}
	
	// Edge and condition coverage for selection sort
	@Test
	public void edgeSelectionTest() {
		assertFalse("They aren't sorted yet",
				compareItems(itemsB,itemsBSorted));
		SortAlgos.selectionSort(itemsB);
		assertTrue("They are sorted now",
				compareItems(itemsB,itemsBSorted));
	}

	// Edge and condition coverage for selection sort
	@Test(expected = NullPointerException.class)
	public void nullSelectionTest() {
		Item[] tmp = null;
		SortAlgos.selectionSort(tmp);
	}
}
