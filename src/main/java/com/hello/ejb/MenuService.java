package com.hello.ejb;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.ejb.Stateless;

import com.hello.model.MenuTab;

@Stateless
public class MenuService {

	enum Tabs {
		Ajax_Core(
				"Basic",
				"Event",
				"Listener",
				"Counter",
				"Process",
				"Validation",
				"Dropdown",
				"PartialSubmit",
				"Selector",
				"Search",
				"Poll",
				"Fragment",
				"Status",
				"RemoteCommand"),

		Input(
				"AutoComplete",
				"InputTextarea",
				"BooleanButton",
				"BooleanCheckbox",
				"Calendar",
				"CheckboxMenu",
				"OneMenu",
				"Editor",
				"InputText",
				"InputMask",
				"Listbox",
				"ManyButton",
				"ManyMenu",
				"ManyCheckbox",
				"MultiSelectListbox",
				"OneButton",
				"OneRadio",
				"Spinner",
				"Slider",
				"Switch",
				"Password",
				"Keyboard",
				"Rating",
				"ColorPicker",
				"Inplace"),

		Button(
				"Button",
				"CommandButton",
				"CommandLink",
				"Link",
				"SplitButton"),

		Data(
				"Carousel",
				"DataGrid",
				"DataList",
				"DataScroller",
				"DataTable",
				"Diagram",
				"PickList",
				"OrderList",
				"GMap",
				"DataExporter",
				"Mindmap",
				"Ring",
				"Schedule",
				"TagCloud",
				"Tree",
				"TreeTable",
				"HorizontalTree"),

		Panel(
				"Accordion",
				"Dashboard",
				"Fieldset",
				"Grid CSS",
				"Layout",
				"NotificationBar",
				"OutputPanel",
				"Panel",
				"PanelGrid",
				"Ribbon",
				"ScrollPanel",
				"TabView",
				"Toolbar",
				"Wizard"),

		Overlay(
				"ConfirmDialog",
				"Dialog",
				"LightBox",
				"OverlayPanel",
				"Tooltip"),

		Menu(
				"Breadcrumb",
				"ContextMenu",
				"Dock",
				"MegaMenu",
				"Menu",
				"Menubar",
				"MenuButton",
				"PanelMenu",
				"SlideMenu",
				"Stack",
				"Steps",
				"TabMenu",
				"TieredMenu"),

		Charts(
				"Area",
				"Bar",
				"Bubble",
				"Donut",
				"Line",
				"Pie",
				"MeterGauge",
				"OHLC",
				"Animate",
				"Export",
				"Interactive",
				"Live",
				"Static",
				"Zoom",
				"Combined",
				"MultiAxis",
				"Date",
				"Responsive"),

		Messages(
				"Growl",
				"Messages"),

		Multimedia(
				"Barcode",
				"Compare",
				"ContentFlow",
				"Cropper",
				"Galleria",
				"GraphicImage",
				"Media",
				"PhotoCam",
				"Switch"),

		File(
				"Upload",
				"Download"),

		DragDrop(
				"Draggable",
				"DataGrid",
				"DataTable",
				"Custom"),

		Client_Side_Validation(
				"Basic",
				"Bean",
				"Custom",
				"Event"),

		Dialog_Framework(
				"Basic",
				"Data",
				"Message"),

		Misc(
				"Responsive",
				"BlockUI",
				"Cache",
				"Captcha",
				"Clock",
				"Collector",
				"DefaultCommand",
				"Effect",
				"ExceptionHandler",
				"FontAwesome",
				"FeedReader",
				"Focus",
				"Hotkey",
				"IdleMonitor",
				"Log",
				"OutputLabel",
				"Printer",
				"ProgressBar",
				"RequestContext",
				"ResetInput",
				"Resizable",
				"Separator",
				"Spacer",
				"Spotlight",
				"Sticky",
				"Terminal",
				"ThemeSwitcher",
				"Watermark");

		private String[] sub;
		private Tabs(String... s) {
			this.sub = s;
		}

	}

	/**
	 * サイドメニューを生成する。
	 * @return
	 */
	public List<MenuTab> generateMenu() {
		return Stream.of(Tabs.values())
				.map(m -> {
					MenuTab tab = new MenuTab(m.name());
					tab.setSubTitles(Arrays.asList(m.sub));
					return tab;
				})
				.collect(Collectors.toList());
	}

}
