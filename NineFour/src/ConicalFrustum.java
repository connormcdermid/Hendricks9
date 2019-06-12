/*
  author: Frank Gomes
  lab: 9.4 3-D Drawings
  date: 12-06-19
  extra: Oblique Cylinder
 */

import javax.swing.*;
import java.awt.*;

// Problem One
class ItsACube extends JPanel {
    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        // Drawings go here!
        // Graphics2D object for adjusting stroke and other things
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(4));
        // Top side
        g2.setColor(Color.PINK);
        g2.fillPolygon(new int[] {50, 0, 200, 250}, new int[] {0, 75, 75, 0}, 4);
        g2.setColor(Color.blue);
        g2.drawPolygon(new int[] {50, 0, 200, 250}, new int[] {0, 75, 75, 0}, 4);
        // Bottom side
        g2.setColor(Color.PINK);
        g2.fillPolygon(new int[] {50, 250, 200, 0}, new int[] {100, 100, 175, 175}, 4);
        g2.setColor(Color.BLUE);
        g2.drawPolygon(new int[] {50, 250, 200, 0}, new int[] {100, 100, 175, 175}, 4);
        // Left side
        g2.setColor(Color.PINK);
        g2.fillPolygon(new int[] {0, 50, 50, 0}, new int[] {75, 75, 100, 175}, 4);
        g2.setColor(Color.BLUE);
        g2.drawPolygon(new int[] {0, 50, 50, 0}, new int[] {75, 75, 100, 175}, 4);
        // Right side
        g2.setColor(Color.PINK);
        g2.fillPolygon(new int[] {250, 200, 200, 250}, new int[] {0, 75, 175, 100}, 4);
        g2.setColor(Color.BLUE);
        g2.drawPolygon(new int[] {250, 200, 200, 250}, new int[] {0, 75, 175, 100}, 4);
    }
}

// Problem Two
class FunnyCircles extends JPanel {
    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        // Drawings go here!
        setBackground(Color.GREEN);
        g.setColor(Color.BLACK);
        // Line
        g.drawLine(0,0,300,200);
        // Black circles
        g.fillOval(30,15,50,50);
        g.fillOval(170,105,50,50);
        // Green circles
        g.setColor(Color.BLUE);
        g.fillOval(60,35,50,50);
        g.fillOval(200,125,50,50);
    }
}

// Problem Three
class ConicalFrustum extends JPanel {
    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        // Drawings go here!
        Graphics2D g2 = (Graphics2D) g;
        // Right cylinder
        g2.setColor(Color.BLUE);
        g2.setStroke(new BasicStroke(4));
        g2.drawOval(0,0,65,20);
        g2.drawLine(0,10,0,70);
        g2.drawLine(65,10,65,70);
        g2.drawOval(0,65,65,20);
        // Conical frustum
        g2.drawOval(70,0,65,20);
        g2.drawLine(70,10,75,70);
        g2.drawLine(135,10,130,70);
        g2.drawOval(75,65,55,20);
        // Oblique cylinder
        g2.drawOval(140,0,65,20);
        g2.drawLine(140,10,150,70);
        g2.drawLine(205,10,215,70);
        g2.drawOval(150,65,65,20);
    }
}

// Class to display each problem in a JFrame
class Main {
    public static void main(String[] args) {
        // JFrame for the first problem
        JFrame problemOne = new JFrame("It's a \"Cube\"");
        problemOne.add(new ItsACube());
        problemOne.setSize(400,400);
        // JFrame for the second problem
        JFrame problemTwo = new JFrame("Abstract Art");
        problemTwo.add(new FunnyCircles());
        problemTwo.setSize(300,229);
        // JFrame for the third problem
        JFrame problemThree = new JFrame("Fancy name for a glass");
        problemThree.add(new ConicalFrustum());
        problemThree.setSize(300,180);
        // Makes the program exit when you close the windows
        problemOne.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); problemTwo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); problemThree.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Centers the windows on the screen
        problemOne.setLocationRelativeTo(null); problemTwo.setLocationRelativeTo(null); problemThree.setLocationRelativeTo(null);
        // Makes each window visible
        problemOne.setVisible(true); problemTwo.setVisible(true); problemThree.setVisible(true);
    }
}