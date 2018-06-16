package com.practice.mergesort;

import java.util.ArrayList;
import java.util.List;


public class MergeSort {
	
	void sort(int[] arr, int l, int r) {
		if(l<r) {
			int m =(l+r)/2;
			sort(arr,l,m);
			sort(arr,m+1,r);
			merge(arr,l,m,r);
		}
		
	}
	
	void merge(int[] arr, int l, int m , int r) {
		int n1 =m-l+1;
		int n2=r-m;
		
		int[] larr=new int[n1];
		int[] rarr=new int[n2];
		
		for(int i=0;i<n1;i++) {
			larr[i]=arr[l+i];
		}
		for(int j=0;j<n2;j++) {
			rarr[j]=arr[m+1+j];
		}
		
		/* Merge the temp arrays */
		 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (larr[i] <= rarr[j])
            {
                arr[k] = larr[i];
                i++;
            }
            else
            {
                arr[k] = rarr[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = larr[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = rarr[j];
            j++;
            k++;
        }
	}
	
	
	public static void main(String[] args) {
		List<Integer> alist = new ArrayList<Integer>();
		alist.add(3);
		alist.add(4);
		System.out.println(alist);
		MergeSort mergeSort = new MergeSort();
		int[] array = {38,27,43,3,9,82,10};
		mergeSort.sort(array, 0, array.length-1);
		printArray(array);
		
		
	}

	private static void printArray(int[] array) {
		System.out.print("Sorted Array: [ ");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+", ");
		}
		System.out.print("]");
	}

}
