/**
 * 
 */

import java.util.HashMap;

/**
 * @author bator
 * This is the player character
 */

public class Player {
	/**
	 * This is the players current room
	 */
	private Room currentRoom;
	public Player(Room integrationRoom) {
		this.currentRoom= integrationRoom;
		inventory = new HashMap<String, Item>();
		health = Max_Health;
	}
	
	
	public static final int Max_Health = 100;
	public static final int Min_Health = 0;
	private HashMap<String, Item> inventory;
	private int health;
	
	public Item getItem(String itemName) {
		return inventory.get(itemName);
	}
	public Item removeItem(String itemName) {
		return inventory.remove(itemName);
	}
	public String getInventoryString() {
		String stuff = null;
		if(inventory.size()>0) {
			stuff = "You are carrying:\n";
			for(String itemName : inventory.keySet()) {
				String weightString = String.format("{%d}", getItem(itemName));
				stuff += String.format("          %-6s %s\n", weightString, itemName);
			}
			
		}
		else {
			stuff = "you are not currently carrying anything.";
			
		}
		return stuff;
	}
	
	public int getHealth() {
		return health;
	}
	public void addHealth(int bonus) {
		health = health + bonus;
		if(health>Max_Health) {
			health = Max_Health;
		}
		else if(health<Min_Health) {
			health = Min_Health;
		}
	}

	public Room getCurrentRoom() {
		return currentRoom;
	}


	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}


	

}
