package Pracctice;

import java.util.Scanner;

public class Sollution {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int count=1;
		int num=arr[0];
		
		for(int j=1;j<n;j++) {
			if(num!=arr[j]) {
				count++;
			}
		}
		System.out.println(count);
	}
}
