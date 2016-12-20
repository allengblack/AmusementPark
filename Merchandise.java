package amusementpark;

/**
 * @author Allen Gbolahan
 * @version 1.0
 */
public class Merchandise {
	private long id;
	private String category = new String();
	private String description = new String();
	private double price;
	private boolean inStock;
	
	/**
	 * @param id
	 * @param category
	 * @param description
	 * @param price
	 * @param inStock
	 */
	
	/**
     * Constructor method for the <b>Merchandise</b> class. This constructor accepts no arguments and sets all values to <b>'null'</b>
     * and boolean values to <b>false</b>.
     */
	public Merchandise(){
		
	}
	
	public Merchandise(long id, String category, String description, double price, boolean inStock){
        if (category.equalsIgnoreCase("T-Shirt")) {
        	this.category = category;
		} else if(category.equalsIgnoreCase("Sweatshirt")) {
			this.category = category;
		} else if(category.equalsIgnoreCase("Stuffed Animal")){
			this.category = category;
		}else if(category.equalsIgnoreCase("Jeans")){
			this.category = category;
		}else{
			System.out.println("Invalid Merchandise category. Please, talk to a member of staff.");
			this.category = "UNKNOWN";
		}
		
		this.description = description;
		this.id = id;
        this.price = price;
        this.inStock = inStock;
	}
	
	/**
	 * Used to set the price of the <b>Merchandise</b> object to the value provided by <b>p</b>.
	 */
	public void setPrice(double p){
            this.price = p;
	}
		
	/**
	 * Used to change the status in stock of the <b>Merchandise</b> object.
	 */
	public void setInstock(boolean newStatus){
		this.inStock = newStatus;
	}
	
	/**
	 * Used to get the unique ID of a particular <b>Merchandise</b> object.
	 */
	public long getId(){
		return this.id;
	}
	
	/**
	 * Used to get the unique category of the particular <b>Merchandise</b> object.
	 */
	public String getCategory(){
		return this.category;
	}
	
	/**
	 * method used to get the description of a <b>Merchandise</b> object.
	 */
	public String getDescription(){
		return this.description;
	}
	
	/**
	 * method used to return the price of a <b>Merchandise</b> object.
	 */
	public double getPrice(){
		return this.price;
	}
	
	/**
	 * method to check if a <b>Merchandise</b> object remains in stock.
	 */
	public boolean getInstock(){
		return this.inStock;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Merchandise [id = " + getId() + ", category = " + getCategory() + ", description = " + getDescription() + ", \n" 
				+" price = $" + getPrice() + ", inStock = " + getInstock() + "]";
	}
	
}
