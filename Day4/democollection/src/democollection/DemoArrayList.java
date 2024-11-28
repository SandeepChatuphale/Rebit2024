package democollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoArrayList {

	public static void main(String[] args) {

		List<String> cities = new ArrayList<>();
		System.out.println(cities.size());
		System.out.println(cities.isEmpty());
		cities.add("Mumbai");
		cities.add("Mumbai");
		cities.add("Vizag");
		cities.add("delhi");
		cities.add("Pune");
		System.out.println(cities.size());
		System.out.println(cities.get(2));
		System.out.println(cities.isEmpty());
		cities.add(1, "Hyb");
		System.out.println(cities);
		cities.remove(3);
		System.out.println(cities);
		//cities.clear();
		System.out.println(cities.size());
		cities.set(1, "Surat");
		
		System.out.println("Before sorting");
		System.out.println(cities);
		
		
		System.out.println("After sorting");
		Collections.sort(cities);
		System.out.println(cities);
		
	
		
		
		
		
	}
	
	

}
