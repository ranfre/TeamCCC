/**
 * 
 */
package com.TeamCCC.ftpchatclient;

/**
 * @author Ben1
 *
 */

//FIX

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

public class ChatWindowContent {

	/**
	 * An array of sample (dummy) items.
	 */
	public static List<ChatWindow> ITEMS = new ArrayList<ChatWindow>();

	/**
	 * A map of sample (dummy) items, by ID.
	 */
	public static Map<String, ChatWindow> ITEM_MAP = new HashMap<String, ChatWindow>();

	static {
		// Add 3 sample items.
		addItem(new ChatWindow("1", "Item 1"));
		addItem(new ChatWindow("2", "Item 2"));
		addItem(new ChatWindow("3", "Item 3"));
	}

	private static void addItem(ChatWindow item) {
		ITEMS.add(item);
		ITEM_MAP.put(item.id, item);
	}

	/**
	 * A dummy item representing a piece of content.
	 */
	public static class ChatWindow {
		public String id;
		public String content;

		public ChatWindow(String id, String content) {
			this.id = id;
			this.content = content;
		}

		@Override
		public String toString() {
			return content;
		}
	}
}
