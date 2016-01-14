package com.hello.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class HelloBean {

	public String getMsg() {
		return "hello";
	}
}
