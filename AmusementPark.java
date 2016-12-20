package amusementpark;

import java.util.*;

/**
 * @author Gbemisola Bamgbade
 * @version 1.0
 */
public class AmusementPark {
	private ArrayList<Ticket> tickets = new ArrayList<Ticket>();
	private ArrayList<Merchandise> merchandise = new ArrayList<Merchandise>();
	private String name = new String();
	
	/**
	 * @param name is the name field of the <b>Amusement Park</b> object.
	 */
	public AmusementPark(String name) {
		this.name = name;
	}
	
	/**
	 * returns the <b>name</b> of the <b>Amusement Park</b> object.
	 */
	public String getName(){
		return this.name;
	}
	
	/**
	 * @return returns an <b>ArrayList</b> of all the dates for which tickets are available.
	 */
	public ArrayList<Date> getTicketDates(){
		ArrayList<Date> date = new ArrayList<Date>();
		for (Ticket t : this.tickets) {
			if (t.getPurchaseStatus() == false) {
				System.out.println("Ticket ID:" + t.getNumber());
				date.add(t.getDate());
			};
		}
		return date;
	}
	
	/**
	 * Returns an integer indicating the number of tickets available for the specified date.
	 */
	public int getTicket(Date date){
		int result = 0;
		for (Ticket t : this.tickets) {
			if (t.getDate() == date) {
				result++;
			};
		}
		return result;
	}
	
	/**
	 * Returns the <b>Ticket</b> that matches the specified ID. If there is no matching <b>Ticket</b>, <b>null</b> is returned.
	 */
	public Ticket getTicket(long id){
		Ticket result = null;
		for (Ticket t : this.tickets) {
			if (t.getNumber() == id) {
				result = t;
			};
		}
		return result;
	}
	
	/**
	 * Returns an <b>ArrayList</b> of all the <b>Merchandise</b> objects in the inventory.
	 */
	public ArrayList<Merchandise> getMerchandise(){
		ArrayList<Merchandise> m = this.merchandise;
		return m;
	}
	
	/**
	 * returns a list of <b>Merchandise</b> objects whose category matches the specified category.
	 */
	public ArrayList<Merchandise> getMerchandise(String category){
		ArrayList<Merchandise> result = new ArrayList<Merchandise>();
		for(Iterator<Merchandise> c = this.merchandise.iterator(); c.hasNext();){
			Merchandise m = c.next();
			if (m.getCategory().equalsIgnoreCase(category)) {
				result.add(m);
				System.out.println(m);
			};
		}
		return result;	
	}
	
	/**
	 *  returns the <b>Merchandise</b> item that matches the specified id. If there is no merchandise item matching the given id, <b>null</b> is returned.
	 */
	public Merchandise getMerchandise(long id){
		Merchandise result = null;
		for (Merchandise m : this.merchandise) {
			if (m.getId() == id) {
				result = m;
			};
		}
		return result;
	}
	
	/**
	 * adds a new <b>Ticket</b> to the inventory of the <b>AmusementPark</b>.
	 */
	public void addTicket(Ticket t){
		this.tickets.add(t);
	}
	
	/**
	 *adds a new <b>Merchandise</b> to the inventory of the <b>AmusementPark</b>.
	 */
	public void addMerchandise(Merchandise m){
		this.merchandise.add(m);
	}
	
	/**
	 *removes a <b>Merchandise</b> object from the list of merchandise of the <b>AmusementPark</b>. 
	 *If the id does not match any <b>Merchandise</b> object in the list, an exception is thrown.
	 */
	public void buyMerchandise(long id){
		try {
			for (Merchandise m : this.merchandise) {
				if (m.getId() == id) {
					this.merchandise.remove(this.merchandise.indexOf(m));
					System.out.println(m.getDescription() + " bought successfully!");
				};
			}
		} catch (Exception e) {
			System.out.println("Please, enter a valid Merchandise ID.");
		}
	}
	
	/**
	 *removes a <b>Ticket</b> object from the list of merchandise of the <b>AmusementPark</b>. 
	 *If the id does not match any <b>Ticket</b> object in the list, an exception is thrown.
	 */
	public void buyTicket(long id){
		try {
			 for(Iterator<Ticket> c = this.tickets.iterator(); c.hasNext();){
				Ticket t = c.next();
				if (t.getNumber() == id) {
					c.remove();
					System.out.println("Ticket " + t.getNumber() + " bought successfully!");
				};
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Ticket not found. Try another ID.");
		} 
	}
}
