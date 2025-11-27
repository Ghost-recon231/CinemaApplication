package Model;

public class Filmkategorie {

    private int filmKategorieId;
    private String name;
    private String beschreibung;

    public Filmkategorie() {}

    public Filmkategorie(int filmKategorieId, String name, String beschreibung) {
        this.filmKategorieId = filmKategorieId;
        this.name = name;
        this.beschreibung = beschreibung;
    }

    public int getFilmKategorieId() { return filmKategorieId; }
    public void setFilmKategorieId(int filmKategorieId) { this.filmKategorieId = filmKategorieId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getBeschreibung() { return beschreibung; }
    public void setBeschreibung(String beschreibung) { this.beschreibung = beschreibung; }
}