package org.motechproject.ws.server;

public class ValidationError {

	private int code;
	private String field;

	public ValidationError() {
	}

	public ValidationError(int code, String field) {
		setCode(code);
		setField(field);
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

}
