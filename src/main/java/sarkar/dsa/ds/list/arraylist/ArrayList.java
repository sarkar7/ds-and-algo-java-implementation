package sarkar.dsa.ds.list.arraylist;

import java.util.Arrays;
import java.util.Objects;

import sarkar.dsa.ds.list.List;

public class ArrayList<T> implements List<T> {

	private Object[] dataList;
	private static final int DEFAULT_SIZE = 10;
	private static final int THRESHOLD_LIMIT = 75;
	private int size;

	public ArrayList() {
		this.dataList = new Object[DEFAULT_SIZE];
		this.size = 0;
	}

	/**
	 * ArrayList can have any number of null values... so null check is not
	 * required.
	 * 
	 */

	@Override
	public boolean add(T data) {
		return addDataHelper(data, dataList, size);
	}

	private boolean addDataHelper(T data, Object[] dataList, int i) {
		if(!isThresholdLimitReached()) {
			dataList[i] = data;
			this.size = i + 1;
			return true;
		}
		return createNewArrayWithDoubleSize(data, i);
	}
	
	private boolean isThresholdLimitReached() {
		return this.size * 100 / (dataList.length - 1) >= THRESHOLD_LIMIT;
	}

	//Dynamically resizing the ArrayList
	private boolean createNewArrayWithDoubleSize(T data, int size) {
		Object[] temp = new Object[this.dataList.length*2];
		final int tempSize = size;
		for (int i = 0; i < tempSize; i++) {
			temp[i] = this.dataList[i];
			size++;
		}
		temp[size] = data;
		this.dataList = temp;
		return true;
	}
	
	@Override
	public Object get(int i) {
		if (i >= 0)
			return this.dataList[i];
		return null;
	}
	
	/**
	 * Last element from the list will not be hard deleted from the array.
	 * We are simply decrementing the size pointer by one.
	 * Next add() method call will replace the last element.
	 */
	
	public boolean remove() {
		this.size--;
		return true;
	}
	

	@Override
	public void display() {
		System.out.println(Arrays.toString(dataList));
	}

	/**
	 * If the element is available in the list return the index number.
	 */

	@Override
	public int isAvailable(T data) {
		int c = 0;
		while (c < this.size) {
			if (data.equals(dataList[c])) {
				return c;
			}
			c++;
		}
		return -1;
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(dataList);
		result = prime * result + Objects.hash(size);
		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArrayList<T> other = (ArrayList<T>) obj;
		return Arrays.deepEquals(dataList, other.dataList) && size == other.size;
	}

}
