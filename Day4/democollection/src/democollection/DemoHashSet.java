package democollection;

import java.util.HashSet;
import java.util.Set;

public class DemoHashSet {

	public static void main(String[] args) {
		
		Set<String> cities = new HashSet<>();
		System.out.println(cities.size());
		cities.add("Mumbai");
		cities.add("Pune");
		cities.add("Delhi");
		cities.add("Mumbai");//NOT added as set is collection of unique elements
		System.out.println(cities.size());
		System.out.println(cities);
		
	}
}
