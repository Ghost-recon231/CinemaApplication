package Controller;

public class BuchungsController {

    private BuchungDAO buchungDAO;
    private TicketDAO ticketDAO;
    private BuchungsView view;

    public BuchungsController(BuchungDAO buchungDAO, TicketDAO ticketDAO, BuchungsView view) {
        this.buchungDAO = buchungDAO;
        this.ticketDAO = ticketDAO;
        this.view = view;
    }

    public void bucheSitz(int userId, int vorstellungId, int sitzId) {

        try {
            // 1. Prüfen ob Sitz frei ist
            boolean istBelegt = ticketDAO.istSitzBelegt(vorstellungId, sitzId);

            if (istBelegt) {
                view.zeigeFehler("Dieser Sitz ist bereits belegt.");
                return;
            }

            // 2. Buchung anlegen
            int buchungId = buchungDAO.createBuchung(userId, vorstellungId);

            // 3. Ticket erstellen
            ticketDAO.createTicket(sitzId, buchungId);

            // 4. Rückmeldung an View
            view.zeigeErfolg("Buchung erfolgreich gespeichert!");

        } catch (Exception ex) {
            view.zeigeFehler("Buchung fehlgeschlagen: " + ex.getMessage());
        }
    }
}