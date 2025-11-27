package Model;

public class Ticket {

    private int ticketId;
    private int sitzId;
    private int buchungId;

    public Ticket() {}

    public Ticket(int ticketId, int sitzId, int buchungId) {
        this.ticketId = ticketId;
        this.sitzId = sitzId;
        this.buchungId = buchungId;
    }

    public int getTicketId() { return ticketId; }
    public void setTicketId(int ticketId) { this.ticketId = ticketId; }

    public int getSitzId() { return sitzId; }
    public void setSitzId(int sitzId) { this.sitzId = sitzId; }

    public int getBuchungId() { return buchungId; }
    public void setBuchungId(int buchungId) { this.buchungId = buchungId; }
}