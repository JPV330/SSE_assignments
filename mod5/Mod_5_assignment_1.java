package com.ss.mod5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

interface Order {
	 void hasEFirst(List<String> s);
}

class SortByE implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		if (!o1.contains("e")  && o2.contains("e")) {
			return 0;
		}
		return o1.contains("e") ? -1 : 1;
		
	}
	
}

public class Mod_5_assignment_1 {

	public static void main(String[] args) {

		// Part 1
		List<String> wordsList = Arrays.asList("Aggro", "Flute", "occupied", "simple", "DRY", "EXAMPLE", "end", "and", "and", "ad", "air", "exit");
		
		//length
		List<String> wordsLength = wordsList.stream().sorted((s1, s2) -> Math.abs(s1.length()) - Math.abs(s2.length()))
				.collect(Collectors.toList());
		wordsLength.forEach(n -> System.out.print(n + " "));
		System.out.println();

		//Reverse length
		List<String> wordsLengthReverse = wordsList.stream()
				.sorted((s1, s2) -> Math.abs(s2.length()) - Math.abs(s1.length())).collect(Collectors.toList());
		wordsLengthReverse.forEach(n -> System.out.print(n + " "));
		System.out.println();

		//Alphabetical
		List<String> wordsAlpha = wordsList.stream().sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList());
		wordsAlpha.forEach((n -> System.out.print(n + " ")));
		System.out.println();
		
		//by which contain 'e'
		List<String> orderE = wordsList;
		orderE.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if (!o1.contains("e")  && o2.contains("e")) {
					return 0;
				}
				return o1.contains("e") ? -1 : 1;
			}
			
		});
		
		orderE.forEach((n -> System.out.print(n + " ")));
		System.out.println();
		
		//By which contain e using Lambda
		SortByE es = new SortByE();;
		List<String> orderE2 = wordsList;
		orderE2.stream().sorted((s1, s2) -> es.compare(s1, s2));
		orderE.forEach((n -> System.out.print(n + " ")));
		System.out.println();

		// part 2
		List<Integer> intList = Arrays.asList(99, 22, 5, 8, 10, 58, 39, 654564, 98794283);
		StringBuilder sorted = new StringBuilder();
		intList.forEach(i -> {
			if (i % 2 == 0) {
				sorted.append("e");
				sorted.append((int) i);
				sorted.append(",");
			} else {
				sorted.append("o");
				sorted.append((int) i);
				sorted.append(",");
			}
		});
		sorted.delete(sorted.length() - 1, sorted.length());
		System.out.print(sorted);
		System.out.println();

		// part3
		List<String> wordsFiltered = wordsList.stream().filter(s -> s.length() < 4).filter(sa -> sa.charAt(0) == 'a')
				.collect(Collectors.toList());
		wordsFiltered.forEach((n -> System.out.print(n + " ")));

	}

}
