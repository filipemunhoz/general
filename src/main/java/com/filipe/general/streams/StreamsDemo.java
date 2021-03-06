package com.filipe.general.streams;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.filipe.general.enums.FieldsRequiredEnum;

public class StreamsDemo {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Iron Maiden", "AC/DC", "Metallica", "Evergrey", "Dream Theater", "Symphony X", "Megadeth");
 
		// Example 1
		list = list.stream()
				.map(String::toUpperCase)
				.sorted()
				.collect(Collectors.toList());

		list.forEach(System.out::println);

		// Example 2
		System.out.println();
		list.stream()
			.filter(s -> s.startsWith("M"))
			.forEach(System.out::println);
		
		//Example 3
		System.out.println();
		list.stream()
			.findFirst()
			.ifPresent(System.out::println);
		
		//Example 4
		System.out.println();
		IntStream.range(1, 4)
			.forEach(System.out::println);
		
		//https://howtodoinjava.com/java8/java-streams-by-examples/
		//Example 5
		list.stream().count();
		
		//Example 6
		Optional<String> reduce = list.stream().reduce((s1, s2) -> s1 + " - " + s2);
		reduce.ifPresent(System.out::println);
		
		//Exemple 7
		List<String> listN = List.of("customer-name", "customer-age", "customer-phone");
		
		Boolean result = EnumSet.allOf(FieldsRequiredEnum.class)
							.stream()
							.allMatch(enumValue -> listN.contains(enumValue.getContent()));
		System.out.println(result);
		

	}

}
