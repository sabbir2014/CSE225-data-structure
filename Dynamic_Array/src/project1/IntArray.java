package project1;

public class IntArray {
	public static int DEFFAULT_CAP = 3;
	
	private int[] arr;
	private int len = 0;
	private int capacity = 0;
	
	public IntArray() {
		this(DEFFAULT_CAP);
	}
	
	public IntArray(int capacity) {
		if(capacity<0)
			throw new IllegalArgumentException("Illegal Capacity!! :"
					+ capacity);
		
		this.capacity = capacity;
		arr = new int [capacity];
	}
	
	public int size() {
		return len;
	}

	public boolean isEmpty() {
		if(len == 0)
			return true;
		else return false;
	}
	
	public int get(int index) {
		return arr[index];
	}
	
	public void set(int index, int elem) {
		arr[index] = elem;
	}

	public void add(int elem) {
		if(len>=capacity) {
			if(capacity==0)
				capacity = 1;
			else capacity *= 2 ;
			arr = java.util.Arrays.copyOf(arr, capacity);
		}
		arr[len++] = elem;
	}
	
	public void removeAt(int rm_index) {
		System.arraycopy(arr, rm_index+1, arr, rm_index, len - rm_index - 1);
		--len;
		--capacity;
	}
	
	public boolean remove(int elem) {
		for(int  i=0; i<len; i++) {
			if(arr[i] == elem) {
				removeAt(i);
				return true;
			}
		}
		return false;
	}
	
	public void reverse() {
		for (int i=0; i<len/2; i++) {
			int tmp = arr[i];
			arr[i] = arr[len-i-1];
			arr[len-i-1] = tmp;
		}
	}
	
	@Override
	public String toString() {
		String str = "";
		
		if(!isEmpty()) {
			str = "[";
			for(int i=0; i<len-1; i++)
				str += arr[i] + ",";
			str += arr[len-1] + "]";
		}
		else str = "[]";
		return str;
	}
	
}
