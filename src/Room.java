import java.util.HashMap;

/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "Campus of Kings" application. "Campus of Kings" is a
 * very simple, text based adventure game.
 *
 * A "Room" represents one location in the scenery of the game. It is connected
 * to other rooms via doors. The doors are labeled north, east, south, west.
 * For each direction, the room stores a reference to an instance of door.
 *
 * @author Maria Jump
 * @version 2015.02.01
 *
 * Used with permission from Dr. Maria Jump at Northeastern University
 */
public class Room {
	/** Counter for the total number of rooms created in the world. */
	private static int counter;
	/** The name of this room.  Room names should be unique. */
	private String name;
	/** The description of this room. */
	private String description;
	
	private HashMap<String, Item> items;
	
	private HashMap<String, Door> doors;
	
	
	


	/**
	 * Static initializer.
	 */
	static {
		counter = 0;
	}
	/**
	 * Create a room described "description". Initially, it has no exits.
	 * "description" is something like "a kitchen" or "an open court yard".
	 *
	 * @param name  The room's name.
	 * @param description
	 *            The room's description.
	 */
	public Room(String name, String description) {
		this.name = name;
		this.description = description;
		counter++;
		items = new HashMap<String,Item>();
		doors = new HashMap<String, Door>();
	}

	/**
	 * Returns the name of this room.
	 *
	 * @return The name of this room.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the description of this room.
	 *
	 * @return The description of this room.
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Returns the number of rooms that have been created in the world.
	 * @return The number of rooms that have been created in the world.
	 */
	public static int getCounter() {
		return counter;
	}
	public void addItem(Item theItem) {
		items.put(theItem.getName(), theItem);
	}
		
	public Item getItems(String itemName) {
		return items.get(itemName);
	}
	
	public String toString() {
		StringBuilder SB = new StringBuilder();
		SB.append(description);
		SB.append("/n");
		
		String temp = name + "\n";
		temp += "You are in " + description + "\n";
		//add exits
		for (String direction: doors.keySet()) {
			SB.append(direction + " ");
		}
		return SB.toString();	
		
	}
	
	
		
	
	
	public void setExit(String direction, Door neighbor) {
		doors.put(direction, neighbor);
	}
	
	public Door getExit(String direction) {
		return doors.get(direction);		
	}

	public Room getCurrentRoom() {
		return getCurrentRoom();
	}

	
	
}
