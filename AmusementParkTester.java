package amusementpark;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AmusementParkTester {
	
	public static Date createDay(){
		Date d = new Date();
		return d;
	}
	
	public static void runPark(AmusementPark p){
		System.out.println("Welcome to " + p.getName() + "!");
		Scanner input = new Scanner(System.in);
		String answer = new String();
		int customerChoice;
		do{
			System.out.println("Enter '1' to buy a Ticket.");
			System.out.println("Enter '2' to buy a some merchandise.");
			System.out.println("Enter '0' to exit.");
			customerChoice = input.nextInt();
			try {
				switch (customerChoice){
				case 1:
					ticketTransaction(p);
					System.out.println("Do you wish to continue? Enter 'y' or 'n'.");
					answer = input.next();
					break;
				case 2:
					merchandiseTransaction(p);
					System.out.println("Do you wish to continue? Enter 'y' or 'n'.");
					answer = input.next();
					break;
				
				case 0:
					System.out.println("Thank you for shopping with us.");
					System.exit(0);
					
//				default:
//					
//					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("Please, enter a valid number.");
				runPark(p);
				break;
			}
			
		}while(answer.equalsIgnoreCase("y"));
		System.out.println("Thank you for shopping with us.");
	}
	
	public static void ticketTransaction(AmusementPark p){
		Scanner input = new Scanner(System.in);
		System.out.println("Here are the available ticket dates. \nPlease, enter a ticket ID.");
		p.getTicketDates();
		int choice;
		choice = input.nextInt();
		try {
			p.buyTicket(choice);
		} catch (Exception e) {
			System.out.println("Ticket ID not found!");
		}
	}
	
	public static void merchandiseTransaction(AmusementPark p){
		Scanner input = new Scanner(System.in);
		System.out.println("Here are the available merchandise items. Enter:");
		System.out.println("1 for T-shirt \n2 for sweatshirt \n3 for stuffed animal \n4 for jeans");
		
		int choice;
		choice = input.nextInt();
		String answer = new String();
		
		try {
			switch (choice){
				case 1:
					System.out.println("Here are the available merchandise for this category.");
					p.getMerchandise("T-Shirt");
					System.out.println("Do you wish to buy a ticket? Enter 'y' or 'n'.");
					answer = input.next();
					if (answer.equalsIgnoreCase("y")) {
						System.out.println("Enter ticket ID.");
						try {
							long id = input.nextLong();
							p.buyMerchandise(id);
						} catch (Exception e) {
							System.out.println("Invalid ID. Please, try again.");
						}
					}
				break;
				
				case 2:
					System.out.println("Here are the available merchandise for this category.");
					p.getMerchandise("Sweatshirt");
					System.out.println("Do you wish to buy a ticket? Enter 'y' or 'n'.");
					answer = input.next();
					if (answer.equalsIgnoreCase("y")) {
						System.out.println("Enter ticket ID.");
						try {
							long id = input.nextLong();
							p.buyMerchandise(id);
						} catch (Exception e) {
							System.out.println("Invalid ID. Please, try again.");
						}
					}
				break;
				
				case 3:
					System.out.println("Here are the available merchandise for this category.");
					p.getMerchandise("Stuffed Animal");
					System.out.println("Do you wish to buy a ticket? Enter 'y' or 'n'.");
					answer = input.next();
					if (answer.equalsIgnoreCase("y")) {
						System.out.println("Enter ticket ID.");
						try {
							long id = input.nextLong();
							p.buyMerchandise(id);
						} catch (Exception e) {
							System.out.println("Invalid ID. Please, try again.");
						}
					}
				break;
				
				case 4:
					System.out.println("Here are the available merchandise for this category.");
					p.getMerchandise("Jeans");
					System.out.println("Do you wish to buy a ticket? Enter 'y' or 'n'.");
					answer = input.next();
					if (answer.equalsIgnoreCase("y")) {
						System.out.println("Enter ticket ID.");
						try {
							long id = input.nextLong();
							p.buyMerchandise(id);
						} catch (Exception e) {
							System.out.println("Invalid ID. Please, try again.");
						}
					}
				break;
			}
		} catch (Exception e) {
			System.out.println("Invalid option.");
		}	
	}
	
	public static void main(String args[]){
		AmusementPark newPark = new AmusementPark("Walden Amusement Park");
    	Ticket t1 = new Ticket(1011L, "child", "John Doe", AmusementParkTester.createDay(), 34.56, false);
    	newPark.addTicket(t1);
    	Ticket t2 = new Ticket(1022L, "senior", "Neo Anderson", AmusementParkTester.createDay(), 50.99, false);
    	newPark.addTicket(t2);
    	Ticket t3 = new Ticket(1033L, "child", "Morpheus Fishburne", AmusementParkTester.createDay(), 34.56, false);
    	newPark.addTicket(t3);
    	Ticket t4 = new Ticket(1044L, "senior", "Alexis Sanchez", AmusementParkTester.createDay(), 50.99, false);
    	newPark.addTicket(t4);
    	Ticket t5 = new Ticket(1055L, "adult", "Jack Sparrow", AmusementParkTester.createDay(), 100.94, false);
    	newPark.addTicket(t5);
    	
        Merchandise m1 = new Merchandise(1111L, "T-shirt", "apparel", 3.99, true);
        newPark.addMerchandise(m1);
        Merchandise m2 = new Merchandise(1122L, "Sweatshirt", "apparel", 21.54, true);
        newPark.addMerchandise(m2);
        Merchandise m3 = new Merchandise(1133L, "Jeans", "apparel", 50.73, true);
        newPark.addMerchandise(m3);
        Merchandise m4 = new Merchandise(1144L, "T-shirt", "apparel", 6.99, true);
        newPark.addMerchandise(m4);
        Merchandise m5 = new Merchandise(1155L, "Stuffed Animal", "Elmo doll", 200.14, true);
        newPark.addMerchandise(m5);
        Merchandise m6 = new Merchandise(1166L, "Jeans", "apparel", 1000.00, true);
        newPark.addMerchandise(m6);
        
        runPark(newPark);
        
	}	
    
}