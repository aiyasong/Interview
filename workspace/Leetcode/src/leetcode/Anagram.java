package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Anagram {
	   public List<String> anagrams(String[] strs) {
		   List<String> results = new ArrayList<String>();
		   Map<String, List<String>> map = new HashMap<String, List<String>>();		   
		   for (String str : strs) {
			   String sorted = SortString(str);
		       if (map.containsKey(sorted)) {
		    	   map.get(sorted).add(str);		       
		       }
		       else {
				   ArrayList<String> list = new ArrayList<String>();
		    	   list.add(str);
		    	   map.put(sorted, list);
		       }
		   }
		   
		    for (List<String> value : map.values() ) {
		        for (String str : value) {
		        	results.add(str);
		        }
		        
		    }
		   return results;
	   }
	   
	   private String SortString(String str) {
		   char[] charSet = str.toCharArray();
		   Arrays.sort(charSet);
		   String sorted = new String(charSet);
		   
		   return sorted;
	   }
}
