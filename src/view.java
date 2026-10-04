import javax.swing.*;
import java.awt.*;

public class view extends JFrame {

    JFrame frame = new JFrame();
    JPanel main = new JPanel();
    JPanel north = new JPanel();

    JLabel runden = new JLabel("Rundenergebnis:");
    JLabel punkte = new JLabel("Gesamtpunkte:");

    JLabel runde2 = new JLabel();
    JLabel punkte2 = new JLabel();

    JLabel zahl = new JLabel("Deine Zahl:");
    JLabel computer = new JLabel("Computer:");

    JTextField zahl2 = new JTextField();
    JTextField computer2 = new JTextField();

    JButton button = new JButton();

    public view() {
        frame.setTitle("Zahlen-Gewinnspiel (v1.0)");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new view();
    }
}
