package suggester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Comparator;
import dictionary.Dictionary;
import distance.LevenshteinDistance;

public class Suggester {
	
	/*
	 * This calculates the edit distance between two words.
	 */

	public static int suggester(){
		return LevenshteinDistance.distance("google", "lookup"); 
	}

	/*
	 * This displays all the dictionary words with their corresponding edit distance.
	 * 
	 * @param word The input word whose correct spelling is to find.
	 * @return newMap The stored correct words are displayed in ascending order of their editDistance.
	 */
	
	public static Map<String, Integer> suggest(String word){

		Dictionary dictionary = new Dictionary();

		Map<String, Integer> newMap = new HashMap<String, Integer>();
		int editDistance;

		for (String s:dictionary.words){
			editDistance =LevenshteinDistance.distance(s,word );
			newMap.put(s, editDistance);
		}

		List<Entry<String, Integer>> entries = new ArrayList<Entry<String, Integer>>(newMap.entrySet());
		Collections.sort(entries, new Comparator<Entry<String, Integer>>() {
			public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
				return e1.getValue().compareTo(e2.getValue());
			}
		});

		Map<String, Integer> orderedMap = new LinkedHashMap<String, Integer>();
		for (Entry<String, Integer> entry : entries) {
			orderedMap.put(entry.getKey(), entry.getValue());

		}

		for (Entry<String, Integer> e : orderedMap.entrySet()){
			System.out.println(e.getKey() + "                " + e.getValue());
		}
		return newMap;
	}

	/*
	 * This method displays the list of words whose edit distance is less than the
	 * thresholdCost.
	 * 
	 * @param map all the dictionary words.
	 * @param int the maximum edit distance below which the words are to be displayed.
	 * @return list words with less edit distance than the threshold value.
	 */

	public static List<String> match(Map<String, Integer> map, int thresholdCost){
		List<String> list = new ArrayList<String>();
		for(String s : map.keySet()){
			if(map.get(s) <= thresholdCost){
				list.add(s);
			}
		}

		return list;
	}

}
