import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controller implements ActionListener {

    private View view;
    private GewinnModel model;

    public controller(View view, GewinnModel model){
        this.view = view;
        this.model = model;
        this.view.setController(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == view.getObjectZahl2()) {

            try {

                if (view.getIntZahl2() >= 1 && view.getIntZahl2() <= 9) {
                    view.ausgabe("Nur Zahlen von 1-9 sind erlaubt.")
                }

                model.berechneComputerZahl();
                model.berechneRunde(view.getIntZahl2());
                view.setErgebnis(model.getRundenErgebnis(), model.getGesamtPunkte(), model.getComputerZahl());

                if (model.hatGewonnen == true) {
                    view.ausgabe("Gewonnen");
                } else {
                    view.ausgabe("Verloren");
                }

            } catch (NumberFormatException e) {
                view.ausgabe("Zahl eingeben");
            }
        }

        else {
            view.reset();
        }
    }
}
