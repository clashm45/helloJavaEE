package com.hello.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.hello.ejb.MenuService;
import com.hello.model.MenuTab;

/**
 * サイドメニュー 管理Bean
 * @author clash_m45
 *
 */
@Named
@SessionScoped
public class MenuBean implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private MenuService menuService;

	private List<MenuTab> menuTabs;

	@PostConstruct
	public void init() {
		this.setMenuTabs(this.menuService.generateMenu());
	}

	public List<MenuTab> getMenuTabs() {
		return this.menuTabs;
	}

	public void setMenuTabs(List<MenuTab> menuTabs) {
		this.menuTabs = menuTabs;
	}


}
