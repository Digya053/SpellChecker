package main;

import java.util.List;
import java.util.Map;

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
