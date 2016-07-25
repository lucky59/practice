package tictactoe;

import java.util.Arrays;

public class CS2ArrayList<E>
{
    private static final int INITIAL_CAPACITY = 10;
    private E[] theData;
    private int size = 0;
    private int capacity = 0;

    @SuppressWarnings("unchecked")
    public CS2ArrayList() {
        capacity = INITIAL_CAPACITY;
        theData = (E[]) new Object[capacity];
    }

    @SuppressWarnings("unchecked")
	public CS2ArrayList(int capacity){
    	this.capacity = capacity;
    	theData = (E[]) new Object[capacity];
    }
    
    public boolean add(int index, E anEntry) {
		if (index < 0 || index >= size) {
			  throw new ArrayIndexOutOfBoundsException(index);
		}
		if (size == capacity) {
		  reallocate();
		}

		for(int i = size; i > index; i--){
			theData[i] = theData[i-1];
		}

		theData[index] = anEntry;
		size++;
		return true;
	}

   	public boolean add(E anEntry) {
        if (size == capacity) {
            reallocate();
        }
        theData[size] = anEntry;
        size++;
        return true;
    }


    public E get(int index) {
       if (index < 0 || index >= size) {
         throw new ArrayIndexOutOfBoundsException(index);
       }
       return theData[index];
  }

    public E set(int index, E newValue) {
		if(index < 0 || index >= size){
			throw new ArrayIndexOutOfBoundsException(index);
		}
		E oldValue = theData[index];
		theData[index] = newValue;
		return oldValue;
	}

    
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        E returnValue = theData[index];
        for (int i = index + 1; i < size; i++) {
            theData[i - 1] = theData[i];
        }
        size--;
        return returnValue;
    }

    
    private void reallocate() {
        capacity = 2 * capacity;
        theData = Arrays.copyOf(theData, capacity);
    }

    
    public int size() {
        return size;
    }

	public E getFirst() {
		return theData[0];
	}

	public E getLast() {
		
		return theData[size-1];
	}

	public void setFirst(E data) {
		theData[0] = data;
	}

	public void setLast(E data) {
		theData[size-1] = data;
	}

	public boolean remove(E data) {
		
		if(contains(data))
		{
			remove(indexOf(data));
			return true;
		}
		else
			return false;
	}

	public int indexOf(E data) {
		
		if(contains(data))
		{
			int index = 0;
			
			for(int count = 0;count<size;count++)
			{
				if(theData[count].equals(data))
				{
					index = count;
					break;
				}
			}
			
			return index;
		}
		else
			return -1;
	}

	public boolean contains(E data) {
		
		boolean flag = false;
		
		for(int count=0;count<size;count++)
		{
			if(theData[count].equals(data))
				flag = true;
		}
		
		return flag;
	}

	@Override
	public String toString() {
	
		String list = "";
		
		for(int count=0;count<size;count++)
		{
			if(count == size-1)
				list = list+theData[count].toString();
			else
				list = list+theData[count].toString()+", ";
		}
		return list;
	}
}
