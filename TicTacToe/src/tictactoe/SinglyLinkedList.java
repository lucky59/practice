package tictactoe;

/**
 * SingleLinkedList is a class that provides some of the capabilities required
 * by the List interface using a single linked list data structure. Adapted from
 * Koffman and Wolfgang Duane A. Bailey Walter Savitch
 */
public class SinglyLinkedList<E> {

	// Data fields
	/** A reference to the head of the list */
	private ListNode<E> head;
	/** The size of the list */
	private int count = 0;

	public SinglyLinkedList() {
		head = null;
		count = 0;
	}

	// more methods will be added.

	/**
	 * Insert an item as the first item of the list.
	 *
	 * @param item
	 *            The item to be inserted
	 */
	public void addFirst(E item) {
		head = new ListNode<E>(item, head);
		count++;
	}

	/**
	 * Insert an item as the last item of the list.
	 *
	 * @param item
	 *            The item to be inserted
	 */
	public void addLast(E item) {
		ListNode<E> temp = new ListNode<E>(item, null);
		if (head == null) {
			head = temp;
		} else {
			ListNode<E> finger = head;
			while (finger.next != null) {
				finger = finger.next;
			}

			finger.next = temp;
		}
		count++;
	}

	/**
	 * Remove the first node from the list
	 * 
	 * @returns The removed node's data or null if the list is empty
	 */
	public E removeFirst() {
		ListNode<E> temp = head;
		if (head != null) {
			head = head.next;
			count--;
			return temp.data;
		} else {
			return null;
		}
	}

	/**
	 * Remove the last node from the list
	 * 
	 * @returns The removed node's data or null if the list is empty
	 */
	public E removeLast() {
		ListNode<E> finger = head;
		ListNode<E> previous = null;
		assert (head != null);
		while (finger.next != null) // find end of list
		{
			previous = finger;
			finger = finger.next;
		}
		// finger is null, or points to end of list
		if (previous == null) {
			// has exactly one element
			head = null;
		} else {
			// pointer to last element is reset
			previous.next = null;
		}
		count--;
		return finger.data;
	}

	/**
	 * check if an item exists in the list.
	 * 
	 * @returns boolean indicate the existence of the given item.
	 */
	public boolean contains(E item) {
		ListNode<E> finger = head;
		while (finger != null && !finger.data.equals(item)) {
			finger = finger.next;
		}
		return finger != null;
	}

	/**
	 * Remove the given item the list
	 * 
	 * @returns The removed node's data or null if it is not in the list
	 */
	public E remove(E item) {
		ListNode<E> finger = head;
		ListNode<E> previous = null;
		while (finger != null && !finger.data.equals(item)) {
			previous = finger;
			finger = finger.next;
		}
		// finger points to target value
		if (finger != null) {
			// we found element to remove
			if (previous == null) // it is first
			{
				head = finger.next;
			} else { // it's not first
				previous.next = finger.next;
			}
			count--;
			return finger.data;
		}
		// didn't find it, return null
		return null;
	}

	/**
	 * Insert the specified item at the specified position in the list.
	 *
	 * @param index
	 *            Index at which the specified item is to be inserted
	 * @param item
	 *            The item to be inserted
	 * @throws IndexOutOfBoundsException
	 *             if the index is out of range
	 */

	public void add(int index, E item) {
		if (index < 0 || index > count) {
			throw new IndexOutOfBoundsException(Integer.toString(index));
		}
		if (index == 0) {
			addFirst(item);
		} else if (index == count) {
			addLast(item);
		} else {
			int position = 0;
			ListNode<E> previous = null;
			ListNode<E> finger = head;
			// search for ith position, or end of list
			while (position != index) {
				previous = finger;
				finger = finger.next;
				position++;
			}
			// create new value to insert in correct position
			ListNode<E> current = new ListNode<E>(item, finger);
			count++;
			// make previous value point to new value
			previous.next = current;
		}
	}

	/**
	 * pre: 0 <= i < size() post: removes and returns object found at that
	 * location indicies). Returns the tiem that was removed.
	 * 
	 * @param index
	 *            The index of the item to be removed
	 * @returns The item that was at the specified position
	 * @throws IndexOutOfBoundsException
	 *             if the index is out of range
	 */

	public E remove(int index) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException(Integer.toString(index));
		}
		if (index == 0)
			return removeFirst();
		else if (index == size() - 1)
			return removeLast();

		ListNode<E> previous = null;
		ListNode<E> finger = head;
		// search for value indexed, keep track of previous
		while (index > 0) {
			previous = finger;
			finger = finger.next;
			index--;
		}
		// in list, somewhere in middle
		previous.next = finger.next;
		count--;
		// finger's value is old value, return it
		return finger.data;
	}

	/**
	 * Query the size of the list
	 * 
	 * @return The number of objects in the list
	 */
	int size() {
		return count;
	}

	/** A Node is the building block for the SingleLinkedList */
	private class ListNode<E> {
		/** The data value. */
		private E data;
		/** The link */
		private ListNode<E> next = null;

		/**
		 * Construct a node with the given data value and link
		 * 
		 * @param data
		 *            - The data value
		 * @param next
		 *            - The link
		 */
		public ListNode(E data, ListNode<E> next) {
			this.data = data;
			this.next = next;
		}

		/**
		 * Construct a node with the given data value
		 * 
		 * @param data
		 *            - The data value
		 */
		public ListNode(E data) {
			this(data, null);
		}
	}

	public E setFirst(E item) {

		if (head == null) {
			addFirst(item);
			return null;
		} else {
			head.data = item;
			return item;
		}
	}

	public E setLast(E item) {

		if (head == null) {
			addFirst(item);
			return null;
		} else {
			ListNode<E> last = head;

			while (last.next != null)
				last = last.next;

			E prev = last.data;

			last.data = item;

			return prev;
		}
	}

	public E getFirst() {
		return head.data;
	}

	public E getLast() {

		ListNode<E> last = head;

		if (last == null)
			return null;

		while (last.next != null)
			last = last.next;

		return last.data;
	}

	@Override
	public String toString() {

		String data = "";

		ListNode<E> current = head;

		while (current.next != null) {
			data = data + " " + current.data;
			current = current.next;
		}

		data = data + " " + current.data;
		return data;
	}

	public E set(int i, E item) {

		if (i < 0 || i >= count)
			throw new IndexOutOfBoundsException();

		ListNode<E> current = head;

		for (int curr = 0; curr < i; curr++)
			current = current.next;

		E prev = current.data;
		current.data = item;

		return prev;
	}

	public E get(int i) {

		if (i < 0 || i >= count)
			throw new IndexOutOfBoundsException();

		ListNode<E> current = head;

		for (int curr = 0; curr < i; curr++)
			current = current.next;

		return current.data;
	}

	public int indexOf(E item) {

		int index = 0;
		ListNode<E> current = head;

		while (index < count) {
			if (current.data.equals(item))
				break;

			current = current.next;
			index++;
		}

		if (index == count)
			return -1;
		else
			return index;
	}

}