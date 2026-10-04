import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class View extends JFrame {

    JFrame frame = new JFrame();
    JPanel main = new JPanel();
    JPanel north = new JPanel();

    JLabel runden = new JLabel("Rundenergebnis:");
    JLabel punkte = new JLabel("Gesamtpunkte:");

    JLabel runde2 = new JLabel("-");
    JLabel punkte2 = new JLabel("30");

    JLabel zahl = new JLabel("Deine Zahl:");
    JLabel computer = new JLabel("Computer:");

    JTextField zahl2 = new JTextField();
    JTextField computer2 = new JTextField();

    JButton button = new JButton("Noch einmal:");

    public view() {
        frame.setTitle("Zahlen-Gewinnspiel (v1.0)");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        punkte2.setOpaque(true);
        zahl2.setOpaque(true);
        punkte2.setBackground(Color.WHITE);
        zahl2.setBackground(Color.WHITE);

        computer2.setEnabled(false);

        north.setLayout(new GridLayout(4,2));
        north.add(runden);
        north.add(punkte);
        north.add(runde2);
        north.add(punkte2);
        north.add(zahl);
        north.add(computer);
        north.add(zahl2);
        north.add(computer2);

        main.setLayout(new BorderLayout());
        main.add(north,BorderLayout.CENTER);
        main.add(button,BorderLayout.SOUTH);

        add(main);
    }

    public int getIntZahl2() {
        return Integer.parseInt(zahl2.getText());
    }

    public Object getObjectZahl2() {
        return zahl2;
    }

    public void ausgabe(String text) {
        runde2.setText(text);
    }

    public void setErgebnisse(int runden, int punkte, int computer) {
        runde2.setText(String.valueOf(runden));
        punkte2.setText(String.valueOf(punkte));
        computer2.setText(String.valueOf(computer));
    }

    public void setController(ActionListener controller) {
        zahl2.addActionListener(controller);
        button.addActionListener(controller);
    }

    public void reset() {
        runde2.setText("");
        zahl2.setText("");
        computer2.setText("");
    }
}
