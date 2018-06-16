package com.practice.arrayrotation;

import java.util.Scanner;

public class ArrayRotation {

	public static int[] arrayLeftRotation(int[] a, int n, int k) {
        int temp[] =new int[k];
        for(int i=0;i<k;i++){
            temp[i]=a[i];
        }
        for(int j=0;j<n-k;j++){
            a[j]=a[j+k];
        }
        int i=0;
        for(int l=n-k;l<n;l++){
            a[l]=temp[i++];
        }
      return a;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
      
        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();
      
    }
}
