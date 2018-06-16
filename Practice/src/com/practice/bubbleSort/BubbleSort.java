package com.practice.bubbleSort;

import java.util.Scanner;

public class BubbleSort {

    public static void bubbleSort(int[] a,int n){
        int temp;
        int swaps=0;
        int count=0;
        boolean swapped;
        for(int i=0; i< n ;i++){
        	swapped = false;
            for(int j=0; j< n-i-1; j++){
                if(a[j]> a[j+1]){
                   // swap(a[j],a[j+1]);
                    temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    swaps++;
                    swapped = true;
                }
            }
            count++;
            System.out.println("count"+count);
            if (swapped == false)
              break;
        }
        System.out.println("Array is sorted in "+swaps+" swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[n-1]);
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        System.out.println("Enter the number of elements in array ");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int array[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++) {
        	array[i]=sc.nextInt();
        }
        sc.close();
        bubbleSort(array, n);
    }
}