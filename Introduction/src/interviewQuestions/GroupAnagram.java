package interviewQuestions;

import java.util.*;

public class GroupAnagram {
	
	public static List<List<String>> groupAnagram(String[] strs){
		Map<String, List<String>> map = new HashMap<>();
		for(String s: strs) {
			char charArray[] = s.toCharArray();
			Arrays.sort(charArray);
			String sorted = new String(charArray);
			
			if(!map.containsKey(sorted)) {
				map.put(sorted, new LinkedList<String>());
				
			}
			map.get(sorted).add(s);
		}
		return new LinkedList<>(map.values());
	}

	public static void main(String[] args) {
		
		String s[] = {"pa","ap","de","ed","aa"};
		System.out.println(groupAnagram(s));
		
		// TODO Auto-generated method stub

	}

}
