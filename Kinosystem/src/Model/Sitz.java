package Model;

public class Sitz {

    private int sitzId;
    private int saalId;
    private int sitzArtId;
    private String reihe;
    private int nummer;

    public Sitz() {}

    public Sitz(int sitzId, int saalId, int sitzArtId, String reihe, int nummer) {
        this.sitzId = sitzId;
        this.saalId = saalId;
        this.sitzArtId = sitzArtId;
        this.reihe = reihe;
        this.nummer = nummer;
    }

    public int getSitzId() { return sitzId; }
    public void setSitzId(int sitzId) { this.sitzId = sitzId; }

    public int getSaalId() { return saalId; }
    public void setSaalId(int saalId) { this.saalId = saalId; }

    public int getSitzArtId() { return sitzArtId; }
    public void setSitzArtId(int sitzArtId) { this.sitzArtId = sitzArtId; }

    public String getReihe() { return reihe; }
    public void setReihe(String reihe) { this.reihe = reihe; }

    public int getNummer() { return nummer; }
    public void setNummer(int nummer) { this.nummer = nummer; }
}