package org.springframework.service.impl;

import org.springframework.service.WelcomeService;

/**
 * @author LinYongJin
 * @date 2020/8/10 19:40
 */
public class WelcomeServiceImpl implements WelcomeService {
	@Override
	public String welcome(String name) {
		System.out.println("Welcome " + name);
		return "success";
	}
}
