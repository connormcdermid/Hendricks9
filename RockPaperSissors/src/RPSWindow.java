import javax.swing.*;

public class RPSWindow extends JFrame {
    // Enum for choices
    public enum CHOICES {
        Rock,
        Paper,
        Scissors
    }

    public RPSWindow() {
        // Make a cool new JFrame
        super("Rock Paper Sissors");
        // Make the window 400x200
        setSize(400,200);

        // Player object for the user
        // Prompt user for their name
        Player user = new Player((String)JOptionPane.showInputDialog(
                new JFrame(),
                "Enter your name.\n",
                "Rock Paper Sissors",
                JOptionPane.PLAIN_MESSAGE
        ));
        // Computer to play against
        Computer cpu = new Computer();

    }

    public static void main(String[] args) {
        RPSWindow run = new RPSWindow();
    }
}
