package project1;

public class GenArray<T> {
	public static int DEFFAULT_CAP = 3;
	
	private T[] arr;
	private int len = 0;
	private int capacity = 0;
	
	public GenArray() {
		this(DEFFAULT_CAP);
	}
	
	public GenArray(int capacity) {
		if(capacity<0)
			throw new IllegalArgumentException("Illegal Capacity!! :"
					+ capacity);
		
		this.capacity = capacity;
		arr = (T[]) new Object[capacity];
	}
	
	public int size() {
		return len;
	}

	public boolean isEmpty() {
		if(len == 0)
			return true;
		else return false;
	}
	
	public T get(int index) {
		return arr[index];
	}
	
	public void set(int index, T elem) {
		arr[index] = elem;
	}

	public void add(T elem) {
		if(len>=capacity) {
			if(capacity==0)
				capacity = 1;
			else capacity *= 2 ;

			T[] new_arr = (T[]) new Object[capacity];
			for(int i=0; i<len; i++)
				new_arr[i] =arr[i];
			arr = new_arr;
		}
		arr[len++] = elem;
	}
	
	public void removeAt(int rm_index) {
		T[] new_arr = (T[]) new Object[len-1];
		for(int i=0,j=0; i<len-1; i++,j++) {
			if(i == rm_index) j--;
			else new_arr[j] = arr[i];}
		arr = new_arr;
		capacity = --len;
	}
	
	public boolean remove(T elem) {
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
			T tmp = arr[i];
			arr[i] = arr[len-i-1];
			arr[len-i-1] = tmp;
		}
	}
	
	public void clear() {
		for(int i=0; i<len; i++)
			arr[i] = null;
		len =0;
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
