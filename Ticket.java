package amusementpark;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Allen Gbolahan
 * @version 1.0
 */
public class Ticket {
	SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
	private long number;
    private String category = new String();
    private String holder = new String();
    private Date date = new Date();
    private double price;
    private boolean purchaseStatus;
	
    /**
	 * @param number: Represents each <b>Ticket</b> object's unique number as a <b>long</b>.
	 * @param category: Stores each <b>Ticket</b> object's category as a <b>String</b> which is either of "adult', "child" or "senior". 
	 * @param holder: Stores the name of the person who purchased the <b>Ticket</b> object as a <b>String</b>.
	 * @param date: Stores the admission date for the <b>Ticket</b> object as a <b>Date</b>.
	 * @param price: Stores the current price of each <b>Ticket</b> object as a <b>double</b>.
	 * @param purchaseStatus: Represents the purchase status of each <b>Ticket</b> object as a <b>boolean</b>. 
	 */
	
    public Ticket(long number, String category, String holder, Date date, double price, boolean purchaseStatus) {
		this.number = number;
		
		if (category.equalsIgnoreCase("adult")) {
        	this.category = category;
		} else if(category.equalsIgnoreCase("child")) {
			this.category = category;
		} else if(category.equalsIgnoreCase("senior")){
			this.category = category;
		}else{
			System.out.println("Invalid ticket category. Please, talk to a member of staff.");
		}
		
    	this.holder = holder;
		this.date = date;
		this.price = price;
		this.purchaseStatus = purchaseStatus;
	}
    
    /**
     * Constructor method for the <b>Ticket</b> class. This constructor accepts no arguments and sets all values to <b>'null'</b>
     * and boolean values to <b>false</b>.
     */
    public Ticket() {
	}

	/**
	 * Returns the price of the current <b>Ticket</b> object as a <b>double</b>.
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * Used to change the Purchase status of a <b>Ticket</b> object.
	 */
	public void changePurchaseStatus(boolean newValue){
		this.purchaseStatus = newValue;
	}
	
	/**
	 * Used to get the purchase status of a <b>Ticket</b> object. Returns a boolean value.
	 */
	public boolean getPurchaseStatus(){
		boolean status;
		if (this.purchaseStatus == true) {
			status = true;
		} else {
			status = false;	
		}
		return status;
	}

	/**
	 * returns the number
	 */
	public long getNumber() {
		return number;
	}
	
	/**
	 * returns the category
	 */
	public String getCategory() {
		return category;
	}
	
	/**
	 * returns the holder
	 */
	public String getHolder() {
		return holder;
	}
	
	/**
	 * returns the admission date for the current <b>Ticket</b> object.
	 */
	public Date getDate() {
		return date;
	}
	
	/**
	 * returns the current price of ticket
	 */
	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Ticket purchased: " + getPurchaseStatus() + "\nThe Ticket number is " + getNumber() + ", the category is. \n" + getCategory() + "This ticket belongs to " + getHolder() + 
				", admits one person on " + getDate() + " and costs $" + getPrice();
	}
}
