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

	
solution 1. you can use nested loops to compare every value against ever other value. if the values match theres a pair and you add the value to a list of pairs and return it. 
solution 2. you can add every new value you find into a new list.if you find a value is already in the new list that means its a duplicate and is part of a pair. thus you can put it in a list containing pair values and return it

