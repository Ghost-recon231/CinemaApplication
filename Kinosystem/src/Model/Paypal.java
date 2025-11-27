package Model;

public class Paypal {

    private int paypalId;
    private int userId;
    private String paypalAdresse;

    public Paypal() {}

    public Paypal(int paypalId, int userId, String paypalAdresse) {
        this.paypalId = paypalId;
        this.userId = userId;
        this.paypalAdresse = paypalAdresse;
    }

    public int getPaypalId() { return paypalId; }
    public void setPaypalId(int paypalId) { this.paypalId = paypalId; }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public String getPaypalAdresse() { return paypalAdresse; }
    public void setPaypalAdresse(String paypalAdresse) { this.paypalAdresse = paypalAdresse; }
}