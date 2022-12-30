import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=-1;
		int b=1;
		int c=0;
		while(true) {
			c=a+b;
			if(c>n) {
				break;
			}
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}
