import java.util.HashMap;
import java.util.Scanner;

/**
 * This class is the main class of the "Campus of Kings" application.
 * "Campus of Kings" is a very simple, text based adventure game. Users can walk
 * around some scenery. That's all. It should really be extended to make it more
 * interesting!
 *
 * This game class creates and initializes all the others: it creates all rooms,
 * creates the parser and starts the game. It also evaluates and executes the
 * commands that the parser returns.
 *
 * @author Maria Jump
 * @version 2015.02.01
 * @author bator
 * Used with permission from Dr. Maria Jump at Northeastern University
 */

public class Game {
	/** The world where the game takes place. */
	private World world;
	/** The room the player character is currently in. */
	private Player player;
	private Scanner scanner;
	int score = 0; 
	int turn = 0;
	private HashMap<String, Room> rooms;
	/**
	 * Create the game and initialize its internal map.
	 */
	public Game() {
		world = new World();
		// set the starting room
		player = new Player (world.getRoom("intregation"));
		 rooms = new HashMap<>();
	}
	/**
	 * Prints out the current location and exits.
	 */
 private void printLocationInformation() {
	 Writer.println(player.getCurrentRoom().toString());
		
 }
 
 public String addItem(Room) {
	 
 }


	/**
	 * Main play routine. Loops until end of play.
	 */
	public void play() {
		printWelcome();

		// Enter the main game loop. Here we repeatedly read commands and
		// execute them until the game is over.
		boolean wantToQuit = false;
		while (!wantToQuit) {
			Command command = Reader.getCommand();
			wantToQuit = processCommand(command);
			// other stuff that needs to happen every turn can be added here.
			turn ++;
		}
		printGoodbye();
	}

	///////////////////////////////////////////////////////////////////////////
	// Helper methods for processing the commands

	/**
	 * Given a command, process (that is: execute) the command.
	 *
	 * @param command
	 *            The command to be processed.
	 * @return true If the command ends the game, false otherwise.
	 */
	private boolean processCommand(Command command) {
		boolean wantToQuit = false;

		if (command.isUnknown()) {
			Writer.println("I don't know what you mean...");
		} else {

			String commandWord = command.getCommandWord();
			if (commandWord.equals("help")) {
				printHelp();
			} else if (commandWord.equals("go")) {
				goRoom(command);
			} else if (commandWord.equals("quit")) {
				wantToQuit = quit(command);
			} else if (commandWord.equals("look")) {
				look();
			}
			
			
			
			
			else {
				Writer.println(commandWord + " is not implemented yet!");
			}
		}
		return wantToQuit;
	}

	///////////////////////////////////////////////////////////////////////////
	// Helper methods for implementing all of the commands.
	// It helps if you organize these in alphabetical order.

	private void look() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * Try to go to one direction. If there is an exit, enter the new room,
	 * otherwise print an error message.
	 *
	 * @param command
	 *            The command to be processed.
	 */
	private void goRoom(Command command) {
		  // Get user input
        System.out.print("Enter command: ");
        String input = scanner.nextLine();
        
        
        // Process command
        if (input.equals("quit")) {
            System.out.println("Thanks for playing. Goodbye!");
        }
        else {
            // Check if input is a valid exit direction
        	if (!command.hasSecondWord()) {
    			// if there is no second word, we don't know where to go...
    			Writer.println("Go where?");
    		} else {
    			String direction = command.getRestOfLine();

    			// Try to leave current.
    			Door doorway = null;
    			doorway=player.getCurrentRoom().getExit(direction);
    			if (doorway == null) {
    				Writer.println("There is no door!");
    			} else {
    				Room newRoom = doorway.getDestination();
    				player.setCurrentRoom(newRoom);
    				printLocationInformation();
    			}
    		}
        	
        }
	}

	/**
	 * Print out the closing message for the player.
	 */
	private void printGoodbye() {
		Writer.println("You ended the game with a " + score + " score and you lasted till turn " + turn);
		Writer.println("Thank you for playing.  Good bye.");
	}

	/**
	 * Print out some help information. Here we print some stupid, cryptic
	 * message and a list of the command words.
	 */
	private void printHelp() {
		Writer.println("You are lost. You are alone. You wander");
		Writer.println();
		Writer.println("Your command words are:");
		Writer.println("   go quit help");
	}

	/**
	 * Print out the opening message for the player.
	 */
	private void printWelcome() {
		Writer.println();
		Writer.println("Welcome Olkahoma Jones");
		Writer.println("You are searching for the awesome treasure.");
		Writer.println("Type 'help' if you need help.");
		Writer.println();
	}

	/**
	 * "Quit" was entered. Check the rest of the command to see whether we
	 * really quit the game.
	 *
	 * @param command
	 *            The command to be processed.
	 * @return true, if this command quits the game, false otherwise.
	 */
	private boolean quit(Command command) {
		boolean wantToQuit = true;
		if (command.hasSecondWord()) {
			Writer.println("Quit what?");
			wantToQuit = false;
		}
		return wantToQuit;
	}
	
	
	
}
