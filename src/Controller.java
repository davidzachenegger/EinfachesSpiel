import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

    private View view;
    private GewinnModel model;

    public Controller(View view, GewinnModel model){
        this.view = view;
        this.model = model;
        this.view.setController(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.getObjectZahl2()) {
            try {
                if (view.getIntZahl2() <= 0 || view.getIntZahl2() >= 10) {
                    view.ausgabe("Nur Zahlen von 1-9 sind erlaubt.");
                    return;
                }

                model.berechneComputerZahl();
                model.berechneRunde(view.getIntZahl2());
                view.setErgebnisse(model.getRundenErgebnis(), model.getGesamtPunkte(), model.getComputerZahl());

                if (model.hatGewonnen() == true) {
                    view.ausgabe("Gewonnen");
                } else if(model.hatVerloren() == true){
                    view.ausgabe("Verloren");
                }

            } catch (NumberFormatException exception) {
                view.ausgabe("Zahl eingeben");
            }
        }
        else {
            view.reset();
        }
    }
}
