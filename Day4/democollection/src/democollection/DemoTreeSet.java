package democollection;

import java.util.Set;
import java.util.TreeSet;

public class DemoTreeSet {

	public static void main(String[] args) {
		
		Set<String> cities = new TreeSet<>();
		System.out.println(cities.size());
		cities.add("Mumbai");
		cities.add("Pune");
		cities.add("Delhi");
		cities.add("Mumbai");//NOT added as set is collection of unique elements
		System.out.println(cities.size());
		System.out.println(cities);
		
	}
}
