package com.TeamCCC.ftpchatclient.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */

public class DummyContent {

	/**
	 * An array of sample (dummy) items.
	 */
	public static List<DummyItem> ITEMS = new ArrayList<DummyItem>();

	/**
	 * A map of sample (dummy) items, by ID.
	 */
	public static Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

	static {
		// Add 3 sample items.
		addItem(new DummyItem("1", "Chad", 
				"Contact"));
		addItem(new DummyItem("2", "Brad", 
				"Contact"));
		addItem(new DummyItem("3", "File Browser", 
				"File Browser"));
	}

	private static void addItem(DummyItem item) {
		ITEMS.add(item);
		ITEM_MAP.put(item.id, item);
	}

	/**
	 * A dummy item representing a piece of content.
	 */
	public static class DummyItem {
		public String id;
		public String name;
		public String type;

		public DummyItem(String id, String name, String type) {
			this.id = id;
			this.name = name;
			this.type = type;
		}

		@Override
		public String toString() {
			return name;
		}
	}
}
