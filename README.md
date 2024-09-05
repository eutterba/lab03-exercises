# my lab3

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public static List<Integer> findModeNestedLoops(List<Integer> l){
		int size=l.size();
		int count=0;
		int current=1;
		List<Integer> duplist = new ArrayList<>();
		while(count<size-1) {
			while(current<size) {
				if(l.get(count)==l.get(current) && (duplist.contains(l.get(count))==false)) {
					duplist.add(l.get(count));
					break;
				}
				current++;
			}
			count++;
			current=count+1;
		}
		
		return duplist;

	}

