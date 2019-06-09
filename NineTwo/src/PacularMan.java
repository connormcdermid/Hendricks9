/*
  author: Frank Gomes
  lab: 9.1 Worksheet Basics
  date: 28-05-19
  extra: Pulsing color
 */

import java.awt.*;

import javax.swing.*;

class PacularMan extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Drawings go here!

    }

    private static void drawGhost(Graphics g, Color c, int x, int y) {
        g.setColor(c);
        g.drawOval(x,y,50,50);
        g.drawRect(x,y+25,50,50);
        g.drawPolygon(new int[] {x,x,x+5,x+10,x+15,x+20,x+25,x+25}, new int[] {y+5,y,y+5,y,y+5,y,y+5,y},8);
    }

    public static void main(String[] args) {
        // Sets cheeky title
        JFrame f = new JFrame("Packing Man");
        // Adds class to the frame for viewing
        f.add(new PacularMan());
        // Sets frame size to a "cozy" 400px×400px
        f.setSize(400,400);
        // Makes the program exit when you close the window
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Centers the window on the screen
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}