package com.demo.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import com.demo.entities.Account;

public class AccountValidator implements Validator {

	@Override
	public boolean supports(Class arg0) {
		return Account.class.equals(arg0);
	}

	@Override
	public void validate(Object object, Errors errors) {
	}

}