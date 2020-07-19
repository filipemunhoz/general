package com.filipe.general.json;

import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.databind.ObjectMapper;


public class JsonParse {
	
	public static void main(String[] args) {
		new JsonParse().execute();
	}
		
	private void execute() {
		try {		
			
			InputStream is = JsonParse.this.getClass().getResourceAsStream("/json/simple_file.json");
		
			ObjectMapper mapper = new ObjectMapper();
			 //mapper.setTimeZone(TimeZone.getDefault());
			//mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
			JsonPOJO obj = mapper.readValue(is, JsonPOJO.class);
			
			
			System.out.println(obj.toString());
			System.out.println(mapper.writeValueAsString(obj));
						
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

