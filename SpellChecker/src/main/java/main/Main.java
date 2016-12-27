package main;

import java.util.List;
import java.util.Map;

/*
 * This is the main method which displays all the dictionary words with edit 
 * distance and also suggests the word with least edit distance as the correct
 * spelling.
 * 
 * @author digya
 */

import suggester.Suggester;

public class Main {

	public static void main(String[] args){
		System.out.println("The Levenstein distance is:");
		System.out.println(Suggester.suggester());
		System.out.println("Suggested word"+"      "+"EditDistance");

		Map<String, Integer> words = Suggester.suggest("kathmanud");
		List<String> matches = Suggester.match(words, 3);

		System.out.println("The correct spelling is " + matches);

	}

}
