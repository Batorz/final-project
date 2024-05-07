/**
 * 
 */

/**
 * @author bator
 * This is the player character
 */

public class Player {
	/**
	 * This is the players current room
	 */
	private Room currentRoom;
	public Player(Room currentRoom) {
		this.currentRoom= currentRoom;
	}
	

	public Room getCurrentRoom() {
		return currentRoom;
	}


	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}


	

}
