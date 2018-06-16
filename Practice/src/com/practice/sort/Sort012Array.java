package com.practice.sort;


public class Sort012Array {

	static void sort012(int a[], int arr_size) {
		int lo = 0;
		int hi = arr_size - 1;
		int mid = 0, temp = 0;
		while (mid <= hi) {
			switch (a[mid]) {
			case 0: {
			//	if(a[lo]!=0) {
					temp = a[lo];
					a[lo] = a[mid];
					a[mid] = temp;
				//}
				lo++;
				mid++;
				break;
			}
			case 1:
				mid++;
				break;
			case 2: {
				//if(a[hi]!=2) {
				temp = a[mid];
				a[mid] = a[hi];
				a[hi] = temp;
			//	}
				hi--;
				break;
			}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
		int arr_size = arr.length;
		long t1 =System.currentTimeMillis();
		sort012(arr, arr_size);
		long t2=System.currentTimeMillis();
		System.out.println("Array after seggregation :"+ (t2-t1));
		System.out.println(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
