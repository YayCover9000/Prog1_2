import javax.swing.JFrame;
import javax.swing.JLabel;

public class Uebung_161023 {
	static String text = "Langeweile";
public static void main (String [] args) {
	Uebung_161023.JFrameGUI();
}
public static void JFrameGUI() {
	// Erstellt eine Grafische Oberfläche mit den folgenden Parametern
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Diese Frau nervt mich", JLabel.CENTER);
    frame.add(label);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 200);
    frame.setVisible(true);
}
	}
