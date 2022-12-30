package EnumTest;

import java.util.Scanner;

public class FetchMonths {
	public static void main(String[] args) {
		
		Months month=Months.April;
		
		System.out.println(month);
		
		for(Months m: Months.values()) {
			System.out.println(m);
		}
	}
}
