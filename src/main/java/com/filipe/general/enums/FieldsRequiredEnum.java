package com.filipe.general.enums;

public enum FieldsRequiredEnum {
	
	NAME("customer-name"),
	AGE("customer-age"),
	PHONE("customer-phone");
	
	private String content;
	
	private FieldsRequiredEnum(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

}
