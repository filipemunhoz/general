package com.filipe.general.predicates;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Interface funcional com metodo abstrato
 * @author fcmunhoz
 *
 */
public class PredicateDemo {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("Joana", GenderEnum.FEMALE, 44);
		Person p2 = new Person("Joaquim", GenderEnum.MALE, 24);
		Person p3 = new Person("Laila", GenderEnum.FEMALE, 18);
		Person p4 = new Person("Cheer", GenderEnum.FEMALE, 53);
		Person p5 = new Person("Kleber", GenderEnum.MALE, 22);
		
		List<Person> persons = List.of(p1, p2, p3, p4, p5);
		List<Person> filteredPersons = getFilteredPersons(persons, PersonPredicate.female); 
		List<Integer> numbers = List.of(-1, -2, -3, -4, -7 ,-10, 1, 2, 3, 4, 6, 8, 9, 0, 12, 44, 87);
		List<Integer> filtered = getFilteredNumbers(numbers, IntegerPredicates.positives);
		

		
		
			
		filtered.forEach(System.out::println);
	}
	
	public static List<Person> getFilteredPersons(List<Person> persons, Predicate<Person> predicate){
		
		return persons.stream()
			.filter(predicate)
			.collect(Collectors.<Person>toList());
	}
	
	public static List<Integer> getFilteredNumbers(List<Integer> numbers, Predicate<Integer> predicate){		
		return numbers.stream()
				.filter(predicate)
				.collect(Collectors.<Integer>toList());		
	}
}
