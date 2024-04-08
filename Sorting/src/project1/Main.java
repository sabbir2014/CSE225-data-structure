package project1;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int numarr[] = {30, 20, 80, 10, 50, 90, 70, 60, 40};
		
		System.out.println("# Before Bubble sorting:");
		for(int elem: numarr) System.out.print(elem + " ");
		Main.BubbleSortInt(numarr);
		System.out.println("\n# After Bubblesorting:");
		for(int elem: numarr) System.out.print(elem + " ");
		System.out.println("\n\n------------------------\n");
		System.out.println("\n\n------------------------\n");
		
		System.out.println("# Before Selction sorting:");
		for(int elem: numarr) System.out.print(elem + " ");
		Main.SelectionSortInt(numarr);
		System.out.println("\n# After Selection sorting:");
		for(int elem: numarr) System.out.print(elem + " ");
		System.out.println("\n\n------------------------\n");
		System.out.println("\n\n------------------------\n");
		
		System.out.println("# Before Insertion sorting:");
		for(int elem: numarr) System.out.print(elem + " ");
		Main.InsertionSortInt(numarr);
		System.out.println("\n# After Insertion sorting:");
		for(int elem: numarr) System.out.print(elem + " ");
		System.out.println("\n\n------------------------\n");
		System.out.println("\n\n------------------------\n");
		
		System.out.println("# Before Merge sorting:");
		for(int elem: numarr) System.out.print(elem + " ");
		Main.MergeSortInt(numarr, 0, numarr.length-1);
		System.out.println("\n# After Merge sorting:");
		for(int elem: numarr) System.out.print(elem + " ");
		
		System.out.println("\n\n------------------------\n");
		System.out.println("\n\n------------------------\n");
		System.out.println("\n\n------------------------\n");
		System.out.println("\n\n------------------------\n");
		
		Student s1 = new Student(151, "Sujit", 80);
		Student s2 = new Student(161, "Siyam", 90);
		Student s3 = new Student(141, "Abir", 70);
		Student s4 = new Student(191, "Tonmoy", 60);
		Student s5 = new Student(171, "Shuvro", 100);
		Student s6 = new Student(181, "Ratri", 75);
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1); list.add(s2); list.add(s3);
		list.add(s4); list.add(s5); list.add(s6);
		
		System.out.println("# Before Bubble sorting");
		for(Student std: list) System.out.println(std.toString());
		Main.BubbleSortObj(list);
		System.out.println("# After Bubble sorting");
		for(Student std: list) System.out.println(std.toString());
		System.out.println("\n\n------------------------\n");
		System.out.println("\n\n------------------------\n");
		
		System.out.println("# Before Selection sorting");
		for(Student std: list) System.out.println(std.toString());
		Main.SelectionSortObj(list);
		System.out.println("# After  Selection sorting");
		for(Student std: list) System.out.println(std.toString());
		System.out.println("\n\n------------------------\n");
		System.out.println("\n\n------------------------\n");
		
		System.out.println("# Before Insertion sorting");
		for(Student std: list) System.out.println(std.toString());
		Main.InsertionSortObj(list);
		System.out.println("# After Insertion sorting");
		for(Student std: list) System.out.println(std.toString());
		System.out.println("\n\n------------------------\n");
		System.out.println("\n\n------------------------\n");
		
		System.out.println("# Before Merge sorting");
		for(Student std: list) System.out.println(std.toString());
		Main.MergeSortObj(list, 0, list.size()-1);
		System.out.println("# After Merge sorting");
		for(Student std: list) System.out.println(std.toString());
	}
	public static void BubbleSortInt(int arr[]) {
		int len = arr.length;
		
		for(int i=0; i<len-1; i++) {
			for(int j=0; j<len-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void BubbleSortObj(ArrayList<Student> list) {
		int len = list.size();
		
		for(int i=0; i<len-1; i++) {
			for(int j=0; j<len-i-1; j++) {
				if(list.get(j).compareTo(list.get(j+1))>0) {
					Student temp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, temp);
				}
			}
		}
	}
	
	public static void SelectionSortInt(int arr[]) {
		int len = arr.length;
		
		for (int i=0; i<len-1; i++) {
			int min = i;
			for(int j=i+1; j<len; j++)
				if(arr[j] < arr[min])
					min=j;
			
			int temp = arr[min];
			arr[min] =  arr[i];
			arr[i] = temp;
		}	
	}
	
	public static void SelectionSortObj(ArrayList<Student> list) {
		int len = list.size();
		
		for(int i=0; i<len-1; i++) {
			int min = i;
			for(int j=i+1; j<len; j++)
				if(list.get(j).compareTo(list.get(min))<0)
					min=j;
			Student temp = list.get(min);
			list.set(min, list.get(i));
			list.set(i, temp);
		}
	}
	
	public static void InsertionSortInt(int arr[]) {
		int len = arr.length;
		
		for(int i=1; i<len; i++) {
			int key = arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
	}
	
	public static void InsertionSortObj(ArrayList<Student> list) {
		int len = list.size();
		
		for(int i=1; i<len; i++) {
			Student key = list.get(i);
			int j = i-1;
			while(j>=0 && list.get(j).compareTo(key)>0) {
				list.set(j+1, list.get(j));
				j = j-1;
			}
			list.set(j+1, key);
		}
		
	}
	
	public static void MergeInt(int arr[], int l, int m, int r){ 
		int n1 = m - l + 1;
		int n2 = r - m;
		
		int L[] = new int [n1];
		int R[] = new int [n2];
		
		for(int i=0; i<n1; i++) L[i] = arr[l + i];
		for(int j=0; j<n2; j++) R[j] = arr[m + 1 + j];
		
		int i = 0, j = 0;
		int k = l;
		
		while(i<n1 && j<n2){
			if(L[i] <= R[j]){
				arr[k] = L[i];
				i++;
			}
			else{
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		
		while (i<n1){
			arr[k] = L[i];
			i++;
			k++;
		}
		
		while (j<n2){
			arr[k] = R[j];
			j++;
			k++;
		}
	}
	
	public static void MergeSortInt(int arr[], int l, int r){
		if(l<r){
			int m = (l+r)/2;
			MergeSortInt(arr, l, m);
			MergeSortInt(arr, m+1, r);
			MergeInt(arr, l, m, r);
		}
	}
	public static void MergeObj(ArrayList<Student> list, int l, int m, int r){ 
		int n1 = m - l + 1;
		int n2 = r - m;
		
		ArrayList<Student> L = new ArrayList<Student>();
		ArrayList<Student> R = new ArrayList<Student>();
		
		for(int i=0; i<n1; i++)
			L.add(i, list.get(l+i));
		for(int j=0; j<n2; j++)
			R.add(j, list.get(m+1+j));
		
		int i = 0, j = 0;
		int k = l;
		
		while(i<n1 && j<n2){
			if(L.get(i).compareTo(R.get(j)) <= 0){
				list.set(k, L.get(i));
				i++;
			}
			else{
				list.set(k, R.get(j));
				j++;
			}
			k++;
		}
		
		while (i<n1){
			list.set(k, L.get(i));
			i++;
			k++;
		}
		
		while (j<n2){
			list.set(k, R.get(j));
			j++;
			k++;
		}
	}
	
	public static void MergeSortObj(ArrayList<Student> list, int l, int r){
		if(l<r){
			int m = (l+r)/2;
			MergeSortObj(list, l, m);
			MergeSortObj(list, m+1, r);
			MergeObj(list, l, m, r);
		}
	}
}
