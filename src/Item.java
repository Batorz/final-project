
public class Item {
	private String name;
	private String description;
	private int weight;
	
	public Item(String name, String description, int weight) {
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
	public int getWeight() {
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
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public static void main(String[] args) {
	Item pipe = new Item("pipe","A metal bar", 3);

    // Using getter methods to access item properties
    System.out.println("Name: " + pipe.getName());
    System.out.println("Weight: " + pipe.getWeight());

    // Using setter methods to modify item properties
    pipe.setName("Legendary pipe");
    pipe.setWeight(3);

    // Describing the item
    pipe.getDescription();
}
}