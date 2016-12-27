package main;

import java.io.IOException;
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

	public static void main(String[] args) throws IOException{
		System.out.println("The Levenstein distance is:");
		System.out.println(Suggester.suggester());
		System.out.println("Suggested word"+"      "+"EditDistance");

		Map<String, Integer> words = Suggester.suggest("kathmanud");
		List<String> matches = Suggester.match(words, 3);

		System.out.println("The correct spelling is " + matches);
		
		Map<String, Integer> fileWords=Suggester.suggestFromFile("pizze");
		System.out.println("");
		System.out.println("The words in file with their editDistance are:");
		System.out.println(fileWords);
		
		List<String> fileMatches = Suggester.match(fileWords, 2);
		
		System.out.println("The correct spelling from file is" +fileMatches);
		
		

	}

}
