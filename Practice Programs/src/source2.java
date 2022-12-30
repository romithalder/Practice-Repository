import java.security.KeyStore.Entry;
import java.util.Arrays;
import java.util.HashMap;

public class source2 {
	public static void main(String[] args) {
		Travel obj=new Travel();
		obj.holidayPkg.put("Delhi", 5000);
		obj.holidayPkg.put("Jaipur", 4000);
		obj.holidayPkg.put("Agra", 2500);
		obj.holidayPkg.put("Goa", 7000);
		System.out.println(obj.cheapestPackage(2));
		System.out.println(obj.maximumPlace(3000));
	}

}

class Travel {
	HashMap<String, Integer> holidayPkg = new HashMap<>();
	
	public int cheapestPackage(int numberOfPlaces) {
		int amt=0;
		int i=0;
		int price[]=new int[holidayPkg.size()];
		for(java.util.Map.Entry<String, Integer> e: holidayPkg.entrySet()) {
			price[i++]=e.getValue();
		}
		Arrays.sort(price);
		for(int j=0;j<numberOfPlaces;j++) {
			amt=amt+price[j];
		}
		return amt;
	}
	
	public int maximumPlace(int budget) {
		int MaxPlace=0;
		int amtLeft=budget;
		for(java.util.Map.Entry<String, Integer> e: holidayPkg.entrySet()) {
			if(e.getValue()<amtLeft) {
				MaxPlace++;
				amtLeft=amtLeft-e.getValue();
			}
		}
		return MaxPlace;
	}
}
