import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicates {

	public static List<Integer> findModeNestedLoops(List<Integer> l) {
		int size = l.size();
		int count = 0;
		int current = 1;
		List<Integer> duplist = new ArrayList<>();
		while (count < size - 1) {
			while (current < size) {
				if (l.get(count) == l.get(current) && (duplist.contains(l.get(count)) == false)) {
					duplist.add(l.get(count));
					break;
				}
				current++;
			}
			count++;
			current = count + 1;
		}

		return duplist;

	}

	public static List<Integer> findModeHashMap(List<Integer> l) {
		Map<Integer, Integer> s = new HashMap<Integer, Integer>();
		List<Integer> duplist = new List<Integer>();
		int lsize = l.size();
		int count = 0;
		while (count < lsize) {
			if (s.containsKey(l.get(count))) {
				duplist.add(l.get(count));
			}
			s.put(l.get(count), 1);
			count++;
		}
		return duplist;

	}

	public static void main(String[] args) {
		// some test strings:
		List<Integer> sample1 = new ArrayList<Integer>(Arrays.asList(3, 7, 5, 6, 7, 4, 8, 5, 7, 66));
		List<Integer> sample2 = new ArrayList<Integer>(Arrays.asList(3, 5, 6, 4, 4, 5, 66, 6, 7, 6));
		List<Integer> sample3 = new ArrayList<Integer>(Arrays.asList(3, 0, 5, 1, 0));
		List<Integer> sample4 = new ArrayList<Integer>(Arrays.asList(3));
		System.out.println("Sample 1: " + findModeNestedLoops(sample1));
		System.out.println("Sample 2: " + findModeNestedLoops(sample2));
		System.out.println("Sample 3: " + findModeNestedLoops(sample3));
		System.out.println("Sample 4: " + findModeNestedLoops(sample4));
	}
}
