package com.filipe.general.hash;

import java.util.HashMap;

public class HashDemo extends HashMap<String, String>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3328764477972353720L;

	public void setId(String key, String value) {
		this.put(key, value);
	}
	
}
