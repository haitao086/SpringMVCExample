package com.demo.controllers;

import org.springframework.stereotype.*;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.demo.entities.Account;
import com.demo.entities.Group1;
import com.demo.entities.Group2;
import com.demo.validators.AccountValidator;

@Controller
@RequestMapping("account")
public class AccountController {

	@RequestMapping(value = "register", method = RequestMethod.GET)
	public String register(ModelMap modelMap) {
		modelMap.put("account", new Account());
		return "account/register";
	}

	@RequestMapping(value = "register", method = RequestMethod.POST)
	public String register(@Validated({ Group1.class }) @ModelAttribute("account") Account account,
			BindingResult bindingResult, ModelMap modelMap) {
		AccountValidator accountValidator = new AccountValidator();
		accountValidator.validate(account, bindingResult);
		if (bindingResult.hasErrors()) {
			return "account/register";
		} else {
			modelMap.put("account", account);
			return "account/success1";
		}
	}

	@RequestMapping(value = "edit", method = RequestMethod.GET)
	public String edit(ModelMap modelMap) {
		modelMap.put("account", new Account());
		return "account/edit";
	}

	@RequestMapping(value = "edit", method = RequestMethod.POST)
	public String edit(@Validated({ Group2.class }) @ModelAttribute("account") Account account,
			BindingResult bindingResult, ModelMap modelMap) {
		AccountValidator accountValidator = new AccountValidator();
		accountValidator.validate(account, bindingResult);
		if (bindingResult.hasErrors()) {
			return "account/edit";
		} else {
			modelMap.put("account", account);
			return "account/success2";
		}
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		modelMap.put("account", new Account());
		return "account/index";
	}
	
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public String save(@ModelAttribute("account") Account account, ModelMap modelMap) {
		modelMap.put("account", account);
		return "account/success";
	}
	
}