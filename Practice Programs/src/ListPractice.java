import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListPractice {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String names[]=new String[3];
		for(int i=0;i<3;i++) {
			names[i]=sc.next();
		}
		List<String> list=Arrays.asList(names);
//		for(int j=0,len=list.size();j<len;j++) {
//			String name=list.get(j);
//			System.out.println("Hello "+name);
//		}
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			String name=it.next();
			System.out.println(name);
		}
	}
}
