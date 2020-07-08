package com.filipe.general.consumer;

import java.util.List;
import java.util.function.Consumer;

/**
 * functional interface; it takes an argument and returns nothing
 * @author fcmunhoz
 *
 */
public class ConsumerDemo {
	
	public static void main(String[] args) {
		
		new ConsumerDemo().demo1();
		new ConsumerDemo().demo2();
	}
	

	private void demo1() {
		Consumer<String> print = s -> System.out.println(s);
		print.accept("Aloham");		
	}
	
	private void demo2() {
		
		List<Integer> list = List.of(1, 2, 3, 4, 5);
		Consumer<Integer> consumer = x -> System.out.println(x);
		forEach(list, consumer); //esse ou o de baixo		
		forEach(list, x -> System.out.println(x));
		
	}
	
	static <T> void forEach(List<T> list, Consumer<T> consumer) {		
		for (T t : list) {
			consumer.accept(t);
		}
	}
}
