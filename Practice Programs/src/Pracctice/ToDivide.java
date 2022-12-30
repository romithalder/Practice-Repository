package Pracctice;


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ToDivide
{
	public static void main(String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		Boolean b=false;
		for(int i=0;i<t;t++) {
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    for(int j=0;j<n;j++) {
		        a[j]=sc.nextInt();
		    }
		    int c[]=new int[n];
		    int m=0;
		    for(int k=0;k<n;k++) {
		        int count=0;
		        for(int l=0;l<n;l++) {
		            if(a[k]==a[l]) {
		                count++;
		            }
		        }
		        c[m++]=count;
		    }
		    int Max=c[0];
		    for(int N=0;N<n;N++) {
		    	System.out.print(c[N]);
		    	if(Max==c[N]) {
		    		b=false;
		    	}
		    	else {
		    		b=true;
		    		Max=c[N];
		    	}
		    }
		    if(b==true) {
		    	System.out.println("YES");
		    }
		    else {
		    	System.out.println("NO");
		    }
		}
	}
}