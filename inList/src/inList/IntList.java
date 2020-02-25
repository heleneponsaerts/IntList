package inList;

class Node {
	int value;
	Node next;

}

/** 
 * Each instance of this class stores a list of integers.
 */

public class IntList {
	
	private Node firstNode;
	
	public int getSize() {
		int count = 0;
		Node node = firstNode;
		while (node != null) {
			count++;
			node = node.next;
		}
		return count;
	}
	
	/**
	 * @pre The given index is between 0 and one less than the size of the list.
	 * 		| 0 <= index && index < getSize()
	 */

	public int get(int index) {
		Node node = firstNode;
		for (int i = 0; i < index; i++)
			node = node.next;
		return node.value;
	}

	public int[] getElements() {
		int[] result = new int[getSize()];
		Node node = firstNode;
		for (int i = 0; i < result.length; i++) {
			result[i] = node.value;
			node = node.next;
		}
		return result;
	}
	
	
	/**
	 * Adds the given value to the end of this list.
	 * @post The size of this list equals its old size plus one.
	 * 		| getSize() == old(getSize()) + 1
	 * @post The elements of the list at existing indices equal the old elements at the same indices.
	 * 		| Arrays.equals(getElements(), 0, old(getSize()), old(getElements()), 0, old(getSize)))
	 * @post The last element in this list equals the given value.
	 * 		| getElements()[old(getSize())] == value
	 */
	