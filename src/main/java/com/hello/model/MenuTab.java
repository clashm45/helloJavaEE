package com.hello.model;

import java.util.List;

/**
 * サイドメニューModel
 * @author clash_m45
 *
 */
public class MenuTab {
	private String title;
	private List<String> subTitles;

	public MenuTab(){}
	public MenuTab(String t) {
		this.title = t;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<String> getSubTitles() {
		return subTitles;
	}
	public void setSubTitles(List<String> subTitles) {
		this.subTitles = subTitles;
	}


}
