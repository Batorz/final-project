
public class Item {
	private String name;
	private String description;
	private double weight;
	
	public Item(String name, String description, double weight) {
		this.name = name;
		this.description = description;
		this.weight = weight;
		
	}
	
	
	
	
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	 // Setter for name
    public void setName(String name) {
        this.name = name;
    }
	public String getDescription() {
		return description;
	}
	public double getWeight() {
		return weight;
	}
	public String toString() {
		String result = "[" + name + "]: " + description;
		result += " Weighs " + getWeight() + "pounds.";
		return result;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public static void main(String[] args) {
	Item pipe = new Item("pipe","A metal bar", 3);

    // Using getter methods to access item properties
    System.out.println("Name: " + pipe.getName());
    System.out.println("Weight: " + pipe.getWeight());

    // Using setter methods to modify item properties
    pipe.setName("pipe");
    pipe.setWeight(3);

    // Describing the item
    pipe.getDescription();
    
    
    Item book = new Item("book","A book describing the surrounding locations", 1);

    // Using getter methods to access item properties
    System.out.println("Name: " + book.getName());
    System.out.println("Weight: " + book.getWeight());

    // Using setter methods to modify item properties
    book.setName("book");
    book.setWeight(1);

    // Describing the item
    book.getDescription();
    
    
    Item bandages = new Item("bandage","A cloth that restores 5 points of health", .5);

    // Using getter methods to access item properties
    System.out.println("Name: " + bandages.getName());
    System.out.println("Weight: " + bandages.getWeight());

    // Using setter methods to modify item properties
    bandages.setName("bandages");
    bandages.setWeight(.5);

    // Describing the item
    bandages.getDescription();
    
    Item keysForBoat = new Item("Keys for the Boat","Keys that start the small boat ", .1);

    // Using getter methods to access item properties
    System.out.println("Name: " + keysForBoat.getName());
    System.out.println("Weight: " + keysForBoat.getWeight());

    // Using setter methods to modify item properties
    keysForBoat.setName("Keys");
    keysForBoat.setWeight(.1);

    // Describing the item
    keysForBoat.getDescription();
    
    Item ancientText = new Item("Ancient Text","An ancient manuscript that describes about the skull of gold, as well as a mysterious island in the south ", 4);

    // Using getter methods to access item properties
    System.out.println("Name: " + ancientText.getName());
    System.out.println("Weight: " + ancientText.getWeight());

    // Using setter methods to modify item properties
    ancientText.setName("Ancient text");
    ancientText.setWeight(4);

    // Describing the item
    ancientText.getDescription();
    
    Item doll = new Item("Stone doll","This looks like one of the pictures from the book! You should keep it", 2);

    // Using getter methods to access item properties
    System.out.println("Name: " + doll.getName());
    System.out.println("Weight: " + doll.getWeight());

    // Using setter methods to modify item properties
    doll.setName("doll");
    doll.setWeight(2);

    // Describing the item
    doll.getDescription();
    
    
}
	
}