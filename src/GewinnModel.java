import java.util.Random;

public class GewinnModel {

    int gesamtPunkte;
    int spielerZahl;
    int computerZahl;
    int rundenErgebnis;

    GewinnModel() {
        spielerZahl = 30;
        computerZahl = 30;
    }

    public int getGesamtPunkte() {
        return this.gesamtPunkte;
    }

    public int getComputerZahl() {
        return this.computerZahl;
    }

    public int getRundenErgebnis() {
        return this.rundenErgebnis;
    }

    public void berechneComputerZahl() {
        Random r = new Random();
        this.computerZahl = r.nextInt(9) + 1;
    }

    public void berechneRunde(int spielerZahl) {
        if(spielerZahl == this.computerZahl) {
            this.rundenErgebnis = 20;
        }
        if(spielerZahl++ == this.spielerZahl || spielerZahl-- == this.computerZahl) {
            this.rundenErgebnis = 5;
        }
        else  {
            this.rundenErgebnis = -10;
        }
        this.gesamtPunkte = this.gesamtPunkte + this.rundenErgebnis;
    }

    public boolean hatGewonnen() {
        if(gesamtPunkte >= 100) {
            return true;
        }
        return false;
    }

    public boolean hatVerloren() {
        if(gesamtPunkte <= 0) {
            return true;
        }
        return false;
    }
}