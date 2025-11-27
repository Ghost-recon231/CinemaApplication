package Model;

public class Saal {

    private int saalId;
    private String name;

    public Saal() {}

    public Saal(int saalId, String name) {
        this.saalId = saalId;
        this.name = name;
    }

    public int getSaalId() { return saalId; }
    public void setSaalId(int saalId) { this.saalId = saalId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
