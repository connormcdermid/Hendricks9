import javax.swing.*;
import java.awt.*;

class QuaintCottage extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Drawings go here!
        // Ground
        g.setColor(Color.green);
        g.fillRect(0,200,400,200);
        // Grass blades
        g.setColor(new Color(0,120,0));
        g.fillPolygon(new int[] {20,25,30,35,40,45,50}, new int[] {200,170,200,170,200,170,200}, 7);
        g.fillPolygon(new int[] {320,325,330,335,340,345,350}, new int[] {200,170,200,170,200,170,200}, 7);
        // House
        g.setColor(new Color(205,51,1));
        g.fillRect(100,100,200,100);
    }

    public static void main(String[] args) {
        // Sets cheeky title
        JFrame f = new JFrame("Nice home");
        // Adds class to the frame for viewing
        f.add(new QuaintCottage());
        // Sets frame size to a "cozy" 400px×400px
        f.setSize(400,400);
        // Makes the program exit when you close the window
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Centers the window on the screen
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
