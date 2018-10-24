package com.demo.controllers;

import java.util.Date;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.WebDataBinder;

import org.springframework.stereotype.*;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.demo.conversion.RoleEditor;
import com.demo.entities.Account;
import com.demo.entities.Group1;
import com.demo.entities.Group2;
import com.demo.entities.Role;
import com.demo.models.RoleModel;
import com.demo.validators.AccountValidator;

@Controller
@RequestMapping("account")
public class AccountController {

	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		webDataBinder.registerCustomEditor(Role.class, new RoleEditor());
	}
	
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
	
//	@RequestMapping(method = RequestMethod.GET)
//	public String index(ModelMap modelMap) {
//		modelMap.put("account", new Account());
//		return "account/index";
//	}
//	
	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		RoleModel roleModel = new RoleModel();
		Account account = new Account();
		account.setRole(roleModel.find("r3"));
		account.setUsername("acc1");
		account.setFullName("Account 1");
		account.setBirthday(new Date());
		modelMap.put("account", account);
		modelMap.put("roles", roleModel.findAll());
		return "account/index";
	}
	
	
	
//	@RequestMapping(value = "save", method = RequestMethod.POST)
//	public String save(@ModelAttribute("account") Account account, ModelMap modelMap) {
//		modelMap.put("account", account);
//		return "account/success";
//	}
	
	public String save(@ModelAttribute(value = "account") @Valid Account account, BindingResult bindingResult, ModelMap modelMap) {
		AccountValidator accountValidator = new AccountValidator();
		accountValidator.validate(account, bindingResult);
		if (bindingResult.hasErrors()) {
			return "account/index";
		} else {
			modelMap.put("account", account);
			return "account/success";
		}
	}
	
	
}