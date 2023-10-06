import java.util.*;

public class AmusementPark {
    private Set<Ticket> tickets = new HashSet<>();
    private Set<Merchandise> merchandise = new HashSet<>();
    private String name;

    public AmusementPark(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Set<Date> getTicketDates() {
        Set<Date> dates = new HashSet<>();
        for (Ticket t : this.tickets) {
            if (!t.getPurchaseStatus()) {
                dates.add(t.getDate());
            }
        }
        return dates;
    }

    public int getTicket(Date date) {
        int result = 0;
        for (Ticket t : this.tickets) {
            if (t.getDate().equals(date)) {
                result++;
            }
        }
        return result;
    }

    public Ticket getTicket(long id) {
        for (Ticket t : this.tickets) {
            if (t.getNumber() == id) {
                return t;
            }
        }
        return null;
    }

    public Set<Merchandise> getMerchandise() {
        return this.merchandise;
    }

    public Set<Merchandise> getMerchandise(String category) {
        Set<Merchandise> result = new HashSet<>();
        for (Merchandise m : this.merchandise) {
            if (m.getCategory().equalsIgnoreCase(category)) {
                result.add(m);
            }
        }
        return result;
    }

    public Merchandise getMerchandise(long id) {
        for (Merchandise m : this.merchandise) {
            if (m.getId() == id) {
                return m;
            }
        }
        return null;
    }

    public void addTicket(Ticket t) {
        this.tickets.add(t);
    }

    public void addMerchandise(Merchandise m) {
        this.merchandise.add(m);
    }

    public void buyMerchandise(long id) {
        for (Merchandise m : this.merchandise) {
            if (m.getId() == id) {
                this.merchandise.remove(m);
                System.out.println(m.getDescription() + " bought successfully!");
                return;
            }
        }
        System.out.println("Please, enter a valid Merchandise ID.");
    }

    public void buyTicket(long id) {
        for (Ticket t : this.tickets) {
            if (t.getNumber() == id) {
                this.tickets.remove(t);
                System.out.println("Ticket " + t.getNumber() + " bought successfully!");
                return;
            }
        }
        System.out.println("Ticket not found. Try another ID.");
    }
}
