package com.filipe.general.predicates;

import java.util.function.Predicate;

public class PersonPredicate {
	
	public static Predicate<Person> male = p -> p.getGender().equals(GenderEnum.MALE);
	public static Predicate<Person> female = p -> p.getGender().equals(GenderEnum.FEMALE);
	
	public static Predicate<Person> ageGreaterThirty = p -> p.getAge() > 30;
	
	

}
