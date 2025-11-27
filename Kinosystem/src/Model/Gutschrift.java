package Model;

import java.util.Date;

public class Gutschrift {

    private int gutschriftId;
    private int userId;
    private double betrag;
    private Date erstelldatum;
    private Date verfallDatum;

    public Gutschrift() {}

    public Gutschrift(int gutschriftId, int userId, double betrag, Date erstelldatum, Date verfallDatum) {
        this.gutschriftId = gutschriftId;
        this.userId = userId;
        this.betrag = betrag;
        this.erstelldatum = erstelldatum;
        this.verfallDatum = verfallDatum;
    }

    public int getGutschriftId() { return gutschriftId; }
    public void setGutschriftId(int gutschriftId) { this.gutschriftId = gutschriftId; }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public double getBetrag() { return betrag; }
    public void setBetrag(double betrag) { this.betrag = betrag; }

    public Date getErstelldatum() { return erstelldatum; }
    public void setErstelldatum(Date erstelldatum) { this.erstelldatum = erstelldatum; }

    public Date getVerfallDatum() { return verfallDatum; }
    public void setVerfallDatum(Date verfallDatum) { this.verfallDatum = verfallDatum; }
}