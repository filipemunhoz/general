package com.filipe.general;

import org.apache.commons.text.RandomStringGenerator;
import org.springframework.util.Assert;

public class RandomString {
	
	
	
	public static String generate(final int length) {
		
		Assert.isTrue(length >=10 , "Tamanho precisa ser maior ou igual a 10");
		
		final char [][] pair = {{'a', 'f'}, {'0', '9'}};
		
		RandomStringGenerator r = new RandomStringGenerator.Builder()
				.withinRange(pair)
				.build();
		
		return r.generate(length);
	}

	public static void main(String[] args) {
		
		String s = RandomString.generate(100);
		System.out.println(s);
	}
}
