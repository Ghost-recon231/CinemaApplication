package Model;

public class Sitzart {

    private int sitzArtId;
    private String name;
    private double preisaufschlag;

    public Sitzart() {}

    public Sitzart(int sitzArtId, String name, double preisaufschlag) {
        this.sitzArtId = sitzArtId;
        this.name = name;
        this.preisaufschlag = preisaufschlag;
    }

    public int getSitzArtId() { return sitzArtId; }
    public void setSitzArtId(int sitzArtId) { this.sitzArtId = sitzArtId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPreisaufschlag() { return preisaufschlag; }
    public void setPreisaufschlag(double preisaufschlag) { this.preisaufschlag = preisaufschlag; }
}