package Model;

import java.util.Date;

public class Film {

    private int filmId;
    private Integer filmKategorieId;
    private String titel;
    private String beschreibung;
    private int laengeInMinuten;
    private Date erscheinungsdatum;

    public Film() {}

    public Film(int filmId, Integer filmKategorieId, String titel, String beschreibung,
                int laengeInMinuten, Date erscheinungsdatum) {
        this.filmId = filmId;
        this.filmKategorieId = filmKategorieId;
        this.titel = titel;
        this.beschreibung = beschreibung;
        this.laengeInMinuten = laengeInMinuten;
        this.erscheinungsdatum = erscheinungsdatum;
    }

    public int getFilmId() { return filmId; }
    public void setFilmId(int filmId) { this.filmId = filmId; }

    public Integer getFilmKategorieId() { return filmKategorieId; }
    public void setFilmKategorieId(Integer filmKategorieId) { this.filmKategorieId = filmKategorieId; }

    public String getTitel() { return titel; }
    public void setTitel(String titel) { this.titel = titel; }

    public String getBeschreibung() { return beschreibung; }
    public void setBeschreibung(String beschreibung) { this.beschreibung = beschreibung; }

    public int getLaengeInMinuten() { return laengeInMinuten; }
    public void setLaengeInMinuten(int laengeInMinuten) { this.laengeInMinuten = laengeInMinuten; }

    public Date getErscheinungsdatum() { return erscheinungsdatum; }
    public void setErscheinungsdatum(Date erscheinungsdatum) { this.erscheinungsdatum = erscheinungsdatum; }
}
