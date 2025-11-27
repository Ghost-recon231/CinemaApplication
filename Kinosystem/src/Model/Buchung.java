package Model;

public class Buchung {

    private int buchungId;
    private int userId;
    private int vorstellungId;

    public Buchung() {}

    public Buchung(int buchungId, int userId, int vorstellungId) {
        this.buchungId = buchungId;
        this.userId = userId;
        this.vorstellungId = vorstellungId;
    }

    public int getBuchungId() { return buchungId; }
    public void setBuchungId(int buchungId) { this.buchungId = buchungId; }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public int getVorstellungId() { return vorstellungId; }
    public void setVorstellungId(int vorstellungId) { this.vorstellungId = vorstellungId; }
}