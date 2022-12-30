package Pracctice;

import java.util.Scanner;

public class ArrayRotation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the Array");
		for(int i=0;i<n;i++) {
			 a[i]=sc.nextInt();
		}
		
		int temp[]=new int[n];
		 
	    // Keepig track of the current index
	    // of temp[]
	    int k = 0;
	 
	    // Storing the n - d elements of
	    // array arr[] to the front of temp[]
	    for (int i = 2; i < n; i++) {
	        temp[k] = a[i];
	        k++;
	    }
	 
	    // Storing the first d elements of array arr[]
	    //  into temp
	    for (int i = 0; i < 2; i++) {
	        temp[k] = a[i];
	        k++;
	    }
	 
	    // Copying the elements of temp[] in arr[]
	    // to get the final rotated array
	    for (int i = 0; i < n; i++) {
	        a[i] = temp[i];
	    }
	    
	    for(int j=0;j<n;j++) {
	    	System.out.print(a[j]);
	    }
	}

}
