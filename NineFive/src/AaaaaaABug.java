import javax.swing.*;
import java.awt.*;

class Rectangles extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Drawings go here!
        for (int i = 0; i < 125; i+=25) {
            g.setColor(Color.RED);
            g.fillRect(i,i,150,75);
            g.setColor(Color.BLACK);
            g.drawRect(i,i,150,75);
        }
    }

    public static void main(String[] args) {
        // New JFrame with funny title
        JFrame f = new JFrame("Rectangles!");
        // Adds class to JFrame
        f.add(new Rectangles());
        // Sets size of JFrame
        f.setSize(280,240);
        // Makes program close when window is closed
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Centers window
        f.setLocationRelativeTo(null);
        // Makes the JFrame visible
        f.setVisible(true);
    }
}

class ItsAFeature extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Drawings go here!
        // Bug circles
        for (int i = 0; i < 100; i+=20) {
            g.setColor(Color.YELLOW);
            g.fillOval(i,0,50,50);
            g.setColor(Color.BLACK);
            g.drawOval(i,0,50,50);
        }
        // Eyes
        g.setColor(Color.BLUE);
        g.fillOval(85,10,15,15);
        g.fillOval(110,10,15,15);
        // Mouth
        g.setColor(Color.RED);
        g.fillArc(90,18,30,25,0,-180);
    }

    public static void main(String[] args) {
        // New JFrame with funny title
        JFrame f = new JFrame("OH FRICK ITS A BUG!!!!!");
        // Adds class to JFrame
        f.add(new ItsAFeature());
        // Sets size of JFrame
        f.setSize(135,85);
        // Makes program close when window is closed
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Centers window
        f.setLocationRelativeTo(null);
        // Makes the JFrame visible
        f.setVisible(true);
    }
}