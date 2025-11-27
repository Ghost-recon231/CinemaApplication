package Controller;

import java.util.List;

public class VorstellungController {

    private SitzDAO sitzDAO;
    private TicketDAO ticketDAO;
    private VorstellungView view;

    public VorstellungController(SitzDAO sitzDAO, TicketDAO ticketDAO, VorstellungView view) {
        this.sitzDAO = sitzDAO;
        this.ticketDAO = ticketDAO;
        this.view = view;
    }

    public void ladeFreieSitze(int vorstellungId) {
        try {
            List<Sitz> alleSitze = sitzDAO.findeSitzeImSaal(vorstellungId);
            List<Integer> belegteSitze = ticketDAO.findeBelegteSitze(vorstellungId);

            List<Sitz> freie = alleSitze.stream()
                    .filter(s -> !belegteSitze.contains(s.getSitzId()))
                    .toList();

            view.zeigeFreieSitze(freie);

        } catch (Exception ex) {
            view.zeigeFehler("Sitze konnten nicht geladen werden.");
        }
    }
}
