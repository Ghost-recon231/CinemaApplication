package Model;

import java.util.Date;

public class Vorstellung {

    private int vorstellungId;
    private int filmId;
    private int saalId;
    private Date startzeit;
    private Date endzeit;

    public Vorstellung() {}

    public Vorstellung(int vorstellungId, int filmId, int saalId, Date startzeit, Date endzeit) {
        this.vorstellungId = vorstellungId;
        this.filmId = filmId;
        this.saalId = saalId;
        this.startzeit = startzeit;
        this.endzeit = endzeit;
    }

    public int getVorstellungId() { return vorstellungId; }
    public void setVorstellungId(int vorstellungId) { this.vorstellungId = vorstellungId; }

    public int getFilmId() { return filmId; }
    public void setFilmId(int filmId) { this.filmId = filmId; }

    public int getSaalId() { return saalId; }
    public void setSaalId(int saalId) { this.saalId = saalId; }

    public Date getStartzeit() { return startzeit; }
    public void setStartzeit(Date startzeit) { this.startzeit = startzeit; }

    public Date getEndzeit() { return endzeit; }
    public void setEndzeit(Date endzeit) { this.endzeit = endzeit; }
}