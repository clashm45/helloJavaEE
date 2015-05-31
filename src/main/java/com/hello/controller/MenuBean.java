package com.hello.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;

import com.hello.ejb.MenuService;
import com.hello.model.MenuTab;

/**
 * サイドメニュー 管理Bean
 * @author clash_m45
 *
 */
@Named
public class MenuBean {

	@EJB
	private MenuService menuService;

	private List<MenuTab> menuTabs;

	@PostConstruct
	public void init() {
		this.setMenuTabs(menuService.generateMenu());
	}

	public List<MenuTab> getMenuTabs() {
		return menuTabs;
	}

	public void setMenuTabs(List<MenuTab> menuTabs) {
		this.menuTabs = menuTabs;
	}


}
