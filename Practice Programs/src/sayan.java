import java.util.*;
public class sayan {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean flag=true;
		double a[]=new double[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextDouble();
		}
		for(int i=0;i<n-1;i++) {
			if(a[i]<a[i+1]) {
				continue;
			}
			else {
				int N=0;
				while(a[i]<a[i+1]) {
					a[i]=(a[i]+a[i+1])/2;
					N++;
					if(n>10) {
						System.out.println("no");
						break;
					}
				}
			}
	}
		for(int j=0;j<n-1;j++) {
			if(a[j]<a[j+1]) {
				continue;
			}
			else {
				flag=false;
			}
		}
		if(flag==true) {
			System.out.println("yes");
		}

}
}