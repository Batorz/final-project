import java.util.HashMap;

/**
 * This class represents the entire world that makes up the "Campus of Kings"
 * application. "Campus of Kings" is a very simple, text based adventure game.
 * Users can walk around some scenery. That's all. It should really be extended
 * to make it more interesting!
 *
 * This world class creates the world where the game takes place.
 *
 * @author Maria Jump
 * @version 2015.02.01
 *
 * Used with permission from Dr. Maria Jump at Northeastern University
 */
public class World {
	/** The rooms in the world. */
	private HashMap<String, Room> rooms;

	/**
	 * Constructor for the world.
	 */
	public World() {
		rooms = new HashMap<String, Room>();
		createRooms();
	}

	/**
	 * This method takes care of creating all of the aspects of the world for
	 * the "Campus of Kings" application.
	 *
	 * @param name
	 *            The provided name of the room.
	 * @return The room associated with the provided name
	 */
	public Room getRoom(String name) {
		return rooms.get(name.toLowerCase());
	}

	/////////////////////////////////////////////////////////////////////////////////////
	// Start of private helper methods

	/**
	 * Helper method for recreating a Room. Ensure that the room is created and
	 * installed in to the collection of Rooms
	 *
	 * @param theRoom
	 *            The room to add to the world.
	 */
	private void addRoom(Room theRoom) {
		rooms.put(theRoom.getName().toLowerCase(), theRoom);
	}
	private void createDoor(Room from, String direction, Room to) {
		Door theDoor = new Door(to);
		from.setExit(direction, theDoor);
		
	}
	

	/**
	 * This method creates all of the individual places in this world and all
	 * the doors connecting them.
	 */
	private void createRooms() {
		// Creating all the rooms.
		Room ship = new Room("Ship", "Metal amphious vechile which houses the crew who took you captive");
		Room northIsland = new Room("The North Island", "Island at the far North end of the sea.");
		Room treasureIsland = new Room("Treasure Island", "Island where the most believe where the Treasure is...");
		Room forgottenIsland = new Room("Forgotten Island", "An Island erased in all name and location...");
		Room boat = new Room("Boat", "Small amphious vechile that has 8 days worth of gasoline");
		Room bridge = new Room("Bridge", "Command center of the ship... check for valueables");
		Room bridgeDeck = new Room("Desk in Bridge", "A... Novel?");
		Room poopDeck = new Room("Poop Deck", "Top side of the ship, looking right you see a boat on your left is the bridge!");
		Room library = new Room("Library", "A massive room filled with shelves filled with books... you noticed to the right a section called: Anceint cities ");
		Room ancientCities = new Room("Book Aisle", "You look up and down the shelves to find anything that can help, then you see it just ahead..");
		Room medBay = new Room("Med Bay", "A very bright room with cabinets to the left and right of you, filled with supplies");
		Room crewQuarters = new Room("Crew Quarters", "A tightly back room filled with bunks and cabinets left, right and center.");
		Room boilerRoom = new Room("Boiler Room", "HOT VERY HOT... you noticied a wrench, you grab it then book it out");
		Room lockedDoor = new Room("Locked Door", "Its locked...Maybe find something to break the handle.");
		Room integrationRoom = new Room("Integration Room", "You wake up in a haze loosely bounded, try moving around...");
		Room beach = new Room("Beach", "Sandy area good place to make camp.");
		Room jungle = new Room("Jungle", "A Dense woody area where you hearing rushing water up north.");
		Room river = new Room("River", "Rushning clean drinking water... resupply hear.");
		Room ancientCity = new Room("Ancient City", "A city left by its people, but you see path leading north through the trees.");
		Room lake = new Room("Lake", "Great body of water, as you look at it you noticied a fish jump out of water.");
		Room temple = new Room("Temple", "You exit out of the jungle, there in front of you is a massive temple... you enter");
		Room insideAlterRoom = new Room("Alter Room", "You walk through cobwebs and see a desk with a odd shape wrapped in cloth on it.");
		Room cave = new Room("Cave", "Dark damp space where bats are flying over you.");
		Room caveNI = new Room("Cave", "Dark damp space where bats are flying over you.");
		Room caveTD = new Room("Cave", "Dark damp space where bats are flying over you.");
		Room ancientHome = new Room("Ancient Home", "Walking through the desert you see the top of a gray object, you jump in and you land in an old home.");
		Room pyrimad = new Room("Pyrimad", "A giant structure made of coarse sandstone towering 100 feet high.");
		Room underGround = new Room("Underground Puzzle", "A room left untouch, it has three alter with plates...");
		Room burialSite = new Room("Burial site", "A large mass grave with stone soilders guarding the dead. Ahead you see a tomb.");
		Room treasure = new Room("Tomb", "You find the skull of the great emporer, leave before its too late.");
		Room waterFall = new Room("Water Fall", "Roaring water coming from the top of a cliff");
		Room tigerDen = new Room("Tiger Den", "Damp cave scattered with bones with growling in it.");
		Room undergroundTemple = new Room("Underground Temple", "A Mssive stone structure build underground.");
		Room undergroundRoom = new Room("Underground Room", "The room inside of the temple which leads to another room.");
		Room ancientRuins = new Room("Ancient Ruins", "Ruins of an ancient civilization, looking all around you see structure all around you.");
		Room secretRoom = new Room("Secret Room", "A secert room found within the walls of one of the structures.");
		Room beachTI = new Room("Beach Treasure Island", "beach for treasure island.");
		Room beachFI = new Room("Beach Forgotten Island", "beach for treasure island.");
		
		
		
		// Adding all the rooms to the world.
		this.addRoom(ship);
		this.addRoom(northIsland);
		this.addRoom(treasureIsland);
		this.addRoom(forgottenIsland);
		this.addRoom(boat);
		this.addRoom(bridge);
		this.addRoom(bridgeDeck);
		this.addRoom(poopDeck);
		this.addRoom(library);
		this.addRoom(ancientCities);
		this.addRoom(medBay);
		this.addRoom(crewQuarters);
		this.addRoom(boilerRoom);
		this.addRoom(lockedDoor);
		this.addRoom(integrationRoom);
		this.addRoom(beach);
		this.addRoom(jungle);
		this.addRoom(river);
		this.addRoom(ancientCity);
		this.addRoom(lake);
		this.addRoom(temple);
		this.addRoom(insideAlterRoom);
		this.addRoom(cave);
		this.addRoom(ancientHome);
		this.addRoom(underGround);
		this.addRoom(burialSite);
		this.addRoom(treasure);
		this.addRoom(waterFall);
		this.addRoom(tigerDen);
		this.addRoom(undergroundTemple);
		this.addRoom(undergroundRoom);
		this.addRoom(ancientRuins);
		this.addRoom(secretRoom);
		this.addRoom(beachFI);
		this.addRoom(beachTI);
		this.addRoom(caveNI);
		this.addRoom(caveTD);
		this.addRoom(pyrimad);
		
		this.createDoor(beachTI, "south",beachFI);
		this.createDoor(integrationRoom, "left",boilerRoom);
		this.createDoor(boilerRoom, "Up Stairs",crewQuarters);
		this.createDoor(crewQuarters, "Down Stairs",boilerRoom);
		this.createDoor(crewQuarters, "Up Stairs",medBay);
		this.createDoor(medBay, "left",library);
		this.createDoor(library, "Down Stairs",crewQuarters);
		this.createDoor(library, "Up Stairs",poopDeck);
		this.createDoor(poopDeck, "Up Ladder",bridge);
		this.createDoor(bridge, "Down Ladder",poopDeck);
		this.createDoor(poopDeck, "right",boat);
		this.createDoor(ship, "west",beach);
		this.createDoor(ship, "southwest",beachTI);
		this.createDoor(beach, "southeast",beachFI);
		this.createDoor(beachTI, "northeast",ship);
		this.createDoor(beach, "east",ship);
		this.createDoor(beachTI, "northwest",beach);
		this.createDoor(beach, "south",beachTI);
		this.createDoor(beach, "north",jungle);
		this.createDoor(beach, "southwest",caveNI);
		this.createDoor(jungle, "south",beach);
		this.createDoor(jungle, "west",river);
		this.createDoor(river, "east",jungle);
		this.createDoor(river, "west",lake);
		this.createDoor(lake, "southeast",ancientCity);
		this.createDoor(ancientCity, "north",river);
		this.createDoor(ancientCity, "southeast", temple);
		this.createDoor(temple, "west", insideAlterRoom);
		this.createDoor(insideAlterRoom, "east", temple);
		this.createDoor(temple, "south",caveNI);
		this.createDoor(beachFI, "southeast", ancientHome);
		this.createDoor(ancientHome, "northwest", beachFI);
		this.createDoor(ancientHome, "northeast", pyrimad);
		this.createDoor(pyrimad, "southwest", ancientHome);
		this.createDoor(pyrimad, "north", underGround);
		this.createDoor(underGround, "northwest", burialSite);
		this.createDoor(burialSite, "north", treasure);
		this.createDoor(treasure, "southwest", beachFI);
		this.createDoor(beachTI, "west", waterFall);
		this.createDoor(waterFall, "east", beachTI);
		this.createDoor(beachTI, "southwest", jungle);
		this.createDoor(jungle, "northeast", beachTI);
		this.createDoor(beachTI, "south", cave);
		this.createDoor(cave, "north", beachTI);
		this.createDoor(waterFall, "southeast", jungle);
		this.createDoor(jungle, "northwest", waterFall);
		this.createDoor(waterFall, "south", caveTD);
		this.createDoor(caveTD, "north", waterFall);
		this.createDoor(caveTD, "northwest", tigerDen);
		this.createDoor(tigerDen, "southeast", caveTD);
		this.createDoor(cave, "southwest", temple);
		this.createDoor(temple, "west", undergroundTemple);
		this.createDoor(undergroundTemple, "west", undergroundRoom);
		this.createDoor(undergroundRoom, "north", ancientRuins);
		this.createDoor(ancientRuins, "east", secretRoom);
		this.createDoor(secretRoom, "east", cave);
		
		
		
		
		
		
		
		
		
		// Creating all the doors between the rooms.
		//The code written is the route between the islands no ship because too much. 
		//As well No north island because too confusing
		/**
		this.createWestDoor(ship, beach);
		this.createEastDoor(beach, ship);

		this.createSouthDoor(ship, beach);
		this.createNorthDoor(beach, ship);

		this.createSouthDoor(beach, beachTI);
		this.createNorthDoor(beachTI, beach);

		this.createNorthDoor(beachFI, beachTI);
		this.createSouthDoor(beachTI, beachFI);

		this.createEastDoor(ancientHome, beachFI);
		this.createWestDoor(beachFI, ancientHome);

		this.createNorthDoor(ancientHome, pyrimad);
		this.createSouthDoor(pyrimad, ancientHome);

		this.createNorthDoor(pyrimad, underGround);
		this.createNorthDoor(underGround, burialSite);

		this.createNorthDoor(burialSite, treasure);
		this.createSouthDoor(treasure, beach);
		
		this.createSouthDoor(beachTI,cave);
		this.createNorthDoor(cave, beachTI);
		this.createWestDoor(beachTI, waterFall);

		this.createEastDoor(waterFall, beachTI);
		this.createNorthDoor(beachTI, jungle);

		this.createSouthDoor(jungle, beachTI);
		this.createNorthDoor(underGround, burialSite);

		this.createNorthDoor(jungle, waterFall);
		this.createSouthDoor(waterFall, jungle);
		
		this.createEastDoor(waterFall,cave);
		this.createWestDoor(cave, waterFall);
		this.createEastDoor(cave, tigerDen);

		this.createWestDoor(tigerDen, cave);
		this.createSouthDoor(cave, temple);

		this.createWestDoor(temple, undergroundTemple);
		this.createWestDoor(undergroundTemple, undergroundRoom);

		this.createNorthDoor(undergroundRoom, ancientRuins);
		this.createEastDoor(ancientRuins, secretRoom);
		
		this.createWestDoor(secretRoom,cave);
		
		*/
		
	}
}
