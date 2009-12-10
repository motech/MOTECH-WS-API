package org.motechproject.ws.server;

import java.util.ArrayList;
import java.util.List;

public class ValidationErrors {

	private List<ValidationError> errors = new ArrayList<ValidationError>();

	public List<ValidationError> getErrors() {
		return errors;
	}

	public void setErrors(List<ValidationError> errors) {
		this.errors = errors;
	}

	public void add(int errorCode, String errorField) {
		this.errors.add(new ValidationError(errorCode, errorField));
	}

}
