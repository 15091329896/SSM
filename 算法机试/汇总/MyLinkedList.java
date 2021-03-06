package com.test.mybatis.test;

/**
 * LinkedList class implements a doubly-linked list.
 */
public class MyLinkedList<Integer> implements Iterable<Integer> {
	private int theSize;
	private int modCount = 0;
	private Node<Integer> beginMarker;
	private Node<Integer> endMarker;

	/**
	 * Construct an empty LinkedList.
	 */
	public MyLinkedList() {
		doClear();
	}

	private void clear() {
		doClear();
	}

	/**
	 * Change the size of this collection to zero.
	 */
	public void doClear() {
		beginMarker = new Node<>(null, null, null);
		endMarker = new Node<>(null, beginMarker, null);
		beginMarker.next = endMarker;

		theSize = 0;
		modCount++;
	}

	/**
	 * Returns the number of items in this collection.
	 * 
	 * @return the number of items in this collection.
	 */
	public int size() {
		return theSize;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	/**
	 * Adds an item to this collection, at the end.
	 * 
	 * @param x
	 *            any object.
	 * @return true.
	 */
	public boolean add(Integer x) {
		add(size(), x);
		return true;
	}

	/**
	 * Adds an item to this collection, at specified position. Items at or after
	 * that position are slid one position higher.
	 * 
	 * @param x
	 *            any object.
	 * @param index
	 *            position to add at.
	 * @throws IndexOutOfBoundsException
	 *             if index is not between 0 and size(), inclusive.
	 */
	public void add(int index, Integer x) {
		addBefore(getNode(index, 0, size()), x);
	}

	/**
	 * Adds an item to this collection, at specified position p. Items at or
	 * after that position are slid one position higher.
	 * 
	 * @param p
	 *            Node to add before.
	 * @param x
	 *            any object.
	 * @throws IndexOutOfBoundsException
	 *             if index is not between 0 and size(), inclusive.
	 */
	private void addBefore(Node<Integer> p, Integer x) {
		Node<Integer> newNode = new Node<>(x, p.prev, p);
		newNode.prev.next = newNode;
		p.prev = newNode;
		theSize++;
		modCount++;
	}

	/**
	 * Returns the item at position index.
	 * 
	 * @param index
	 *            the index to search in.
	 * @throws IndexOutOfBoundsException
	 *             if index is out of range.
	 */
	public Integer get(int index) {
		return getNode(index).data;
	}

	/**
	 * Changes the item at position index.
	 * 
	 * @param index
	 *            the index to change.
	 * @param newVal
	 *            the new value.
	 * @return the old value.
	 * @throws IndexOutOfBoundsException
	 *             if index is out of range.
	 */
	public Integer set(int index, Integer newVal) {
		Node<Integer> p = getNode(index);
		Integer oldVal = p.data;

		p.data = newVal;
		return oldVal;
	}

	/**
	 * Gets the Node at position index, which must range from 0 to size( ) - 1.
	 * 
	 * @param index
	 *            index to search at.
	 * @return internal node corresponding to index.
	 * @throws IndexOutOfBoundsException
	 *             if index is not between 0 and size( ) - 1, inclusive.
	 */
	private Node<Integer> getNode(int index) {
		return getNode(index, 0, size() - 1);
	}

	/**
	 * Gets the Node at position index, which must range from lower to upper.
	 * 
	 * @param index
	 *            index to search at.
	 * @param lower
	 *            lowest valid index.
	 * @param upper
	 *            highest valid index.
	 * @return internal node corresponding to index.
	 * @throws IndexOutOfBoundsException
	 *             if index is not between lower and upper, inclusive.
	 */
	private Node<Integer> getNode(int index, int lower, int upper) {
		Node<Integer> p;

		if (index < lower || index > upper)
			throw new IndexOutOfBoundsException("getNode index: " + index + "; size: " + size());

		if (index < size() / 2) {
			p = beginMarker.next;
			for (int i = 0; i < index; i++) {
				p = p.next;
			}
		} else {
			p = endMarker;
			for (int i = size(); i > index; i--) {
				p = p.prev;
			}
		}

		return p;
	}

	/**
	 * Removes an item from this collection.
	 * 
	 * @param index
	 *            the index of the object.
	 * @return the item was removed from the collection.
	 */
	public Integer remove(int index) {
		return remove(getNode(index));
	}

	/**
	 * Removes the object contained in Node p.
	 * 
	 * @param p
	 *            the Node containing the object.
	 * @return the item was removed from the collection.
	 */
	private Integer remove(Node<Integer> p) {
		p.next.prev = p.prev;
		p.prev.next = p.next;
		theSize--;
		modCount++;

		return p.data;
	}

	/**
	 * Returns a String representation of this collection.
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder("[ ");

		for (Integer x : this)
			sb.append(x + " ");
		sb.append("]");

		return new String(sb);
	}

	/**
	 * Obtains an Iterator object used to traverse the collection.
	 * 
	 * @return an iterator positioned prior to the first element.
	 */
	public java.util.Iterator<Integer> iterator() {
		return new LinkedListIterator();
	}

	/**
	 * This is the implementation of the LinkedListIterator. It maintains a
	 * notion of a current position and of course the implicit reference to the
	 * MyLinkedList.
	 */
	private class LinkedListIterator implements java.util.Iterator<Integer> {
		private Node<Integer> current = beginMarker.next;
		private int expectedModCount = modCount;
		private boolean okToRemove = false;

		public boolean hasNext() {
			return current != endMarker;
		}

		public Integer next() {
			if (modCount != expectedModCount)
				throw new java.util.ConcurrentModificationException();
			if (!hasNext())
				throw new java.util.NoSuchElementException();

			Integer nextItem = current.data;
			current = current.next;
			okToRemove = true;
			return nextItem;
		}

		public void remove() {
			if (modCount != expectedModCount)
				throw new java.util.ConcurrentModificationException();
			if (!okToRemove)
				throw new IllegalStateException();

			MyLinkedList.this.remove(current.prev);
			expectedModCount++;
			okToRemove = false;
		}
	}

	/**
	 * This is the doubly-linked list node.
	 */
	private static class Node<Integer> {
		public Node(Integer d, Node<Integer> p, Node<Integer> n) {
			data = d;
			prev = p;
			next = n;
		}

		public Integer data;
		public Node<Integer> prev;
		public Node<Integer> next;
	}

}

class TestLinkedList {
	public static void main(String[] args) {
		MyLinkedList<Integer> list = new MyLinkedList<>();

		for (int i = 0; i < 10; i++)
			list.add(i);
		for (int i = 20; i < 30; i++)
			list.add(0, i);

		list.remove(0);
		list.remove(list.size() - 1);

		System.out.println(list);

		java.util.Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			itr.next();
			itr.remove();
			System.out.println(list);
		}
	}
}
