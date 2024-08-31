package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 5. Given a two dimensional array of string like
	<”luke”, “shaw”>
	<”wayne”, “rooney”>
	<”rooney”, “ronaldo”>
	<”shaw”, “rooney”>
	Where the first string is “child”, second string is “Father”. And given “ronaldo” 
	we have to find his no of grand children Here “ronaldo” has 2 grand children. 
	So our output should be 2.
 */
public class NoOfGrandChildren {

	public static void main(String[] args) {
		String array[][] = { { "luke", "shaw" }, { "wayne", "rooney" }, { "rooney", "ronaldo" }, { "shaw", "rooney" },
				{ "john", "wayne" } };
		String name = "ronaldo";
		int count = getGrandChildrenCount(array, name);
		System.out.println(name + " has " + count + " grand childern");
	}
	// Normal Approach
	/*
	 * private static int getGrandChildrenCount(String[][] array, String name) { int
	 * len = array.length; List<String> sons = new ArrayList<String>(); for (int i =
	 * 0; i < len; i++) { if (array[i][1].equals(name)) sons.add(array[i][0]); }
	 * 
	 * if (sons.isEmpty()) return 0;
	 * 
	 * int count = 0;
	 * 
	 * for (String son : sons) { for (int i = 0; i < len; i++) { if
	 * (array[i][1].equals(son)) count++; } } return count; }
	 */
	
	// Best Approach
	private static int getGrandChildrenCount(String array[][], String target) {
		Map<String, List<String>> map = new HashMap<>();
		for (String[] names : array) {
			String parent = names[1];
			String child = names[0];
			map.putIfAbsent(parent, new ArrayList<>());
			map.get(parent).add(child);
		}
		List<String> childrens = map.getOrDefault(target, new ArrayList<>());
		if (childrens.isEmpty())
			return 0;
		int count = 0;
		for (String name : childrens) {
			List<String> grandChilds = map.getOrDefault(name, new ArrayList<>());
			count += grandChilds.size();
		}
		return count;
	}

}
