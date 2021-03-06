package me.flyray.crm.controller;

import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import me.flyray.crm.api.CustomerAccountService;
import me.flyray.crm.model.CustomerAccount;
import me.flyray.crm.model.User;



@Controller
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private CustomerAccountService customerAccountService;

	/**
	 * 展示所有用户信息
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/displayAllUser", method = RequestMethod.GET)
	public HashMap<String, List<User>> displayAllUser() {
		HashMap<String, List<User>> map = new HashMap<String, List<User>>();
		CustomerAccount customerAccount = new CustomerAccount();
		customerAccountService.openAccount(customerAccount);
		return map;
	}

}
