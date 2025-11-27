package Model;

public class User {

    private int userId;
    private String vorname;
    private String nachname;
    private String email;
    private String passwordHash;
    private String rolle; // enum als String

    public User() {}

    public User(int userId, String vorname, String nachname, String email, String passwordHash, String rolle) {
        this.userId = userId;
        this.vorname = vorname;
        this.nachname = nachname;
        this.email = email;
        this.passwordHash = passwordHash;
        this.rolle = rolle;
    }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public String getVorname() { return vorname; }
    public void setVorname(String vorname) { this.vorname = vorname; }

    public String getNachname() { return nachname; }
    public void setNachname(String nachname) { this.nachname = nachname; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPasswordHash() { return passwordHash; }
    public void setPasswordHash(String passwordHash) { this.passwordHash = passwordHash; }

    public String getRolle() { return rolle; }
    public void setRolle(String rolle) { this.rolle = rolle; }
}
