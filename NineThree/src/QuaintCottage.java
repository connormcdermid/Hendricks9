/*
  author: Frank Gomes
  lab: 9.3 Worksheet Drawings
  date: 08-06-19
  extra: Blades of grass
 */

import javax.swing.*;
import java.awt.*;

class QuaintCottage extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Drawings go here!
        Graphics2D g2 = (Graphics2D) g;
        // Ground
        g2.setColor(Color.green);
        g2.fillRect(0,200,400,200);
        // Grass blades
        g2.setColor(new Color(0,120,0));
        g2.fillPolygon(new int[] {20,25,30,35,40,45,50}, new int[] {200,170,200,170,200,170,200}, 7);
        g2.fillPolygon(new int[] {320,325,330,335,340,345,350}, new int[] {200,170,200,170,200,170,200}, 7);
        // House
        g2.setColor(new Color(205,51,1));
        g2.fillRect(100,100,200,100);
        // Roof
        g2.setStroke(new BasicStroke(4));
        g2.setColor(Color.BLACK);
        g2.drawPolygon(new int[] {100, 200, 300}, new int[] {100, 50, 100}, 3);
        // Door
        g2.setColor(Color.YELLOW);
        g2.fillRect(185,150,30,50);
        // Windows
        g2.fillRect(130,140,35,35);
        g2.fillRect(235,140,35,35);
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
        // Olympic Rings JFrame
        JFrame f2 = new JFrame("Olympic Rings");
        f2.add(new OlympicRings());
        f2.setSize(1218,595);
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f2.setLocationRelativeTo(null);
        f2.setVisible(true);
        // Creepy Face JFrame
        JFrame f3 = new JFrame("Creepy face");
        f3.add(new CreepyFace());
        f3.setSize(200,100);
        f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f3.setLocationRelativeTo(null);
        f3.setVisible(true);
    }
}

class OlympicRings extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        ImageIcon rings = new ImageIcon("NineThree/olympic-rings.png");
        rings.paintIcon(this,g,0,0);
    }
}

class CreepyFace extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.YELLOW);
        g.fillOval(0,0,200,100);
        g.setColor(Color.BLUE);
        g.fillOval(30,25,45,25);
        g.fillOval(125,25,45,25);
        g.setColor(Color.BLACK);
        g.fillOval(95,30,10,40);
        g.setColor(Color.PINK);
        g.fillArc(75,60,50,20,0,-180);
    }
}