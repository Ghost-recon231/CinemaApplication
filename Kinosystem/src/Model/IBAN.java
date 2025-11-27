package Model;

public class IBAN {

    private int ibanId;
    private int userId;
    private String iban;
    private String bankname;

    public IBAN() {}

    public IBAN(int ibanId, int userId, String iban, String bankname) {
        this.ibanId = ibanId;
        this.userId = userId;
        this.iban = iban;
        this.bankname = bankname;
    }

    public int getIbanId() { return ibanId; }
    public void setIbanId(int ibanId) { this.ibanId = ibanId; }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public String getIban() { return iban; }
    public void setIban(String iban) { this.iban = iban; }

    public String getBankname() { return bankname; }
    public void setBankname(String bankname) { this.bankname = bankname; }
}