/*
  author: Frank Gomes
  lab: 9.5 Repetitive Drawings
  date: 18-06-19
  extra: Hey, you got some gum?
 */

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

class SoundOfTheSea extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Drawings go here!
        for (int i = 100; i > 0; i-=20) {
            g.setColor(new Color(102,160,255));
            g.fillOval(100-i,100-i,i,i);
            g.setColor(Color.BLACK);
            g.drawOval(100-i,100-i,i,i);
        }
    }

    public static void main(String[] args) {
        // New JFrame with funny title
        JFrame f = new JFrame("woooosh");
        // Adds class to JFrame
        f.add(new SoundOfTheSea());
        // Sets size of JFrame
        f.setSize(150,150);
        // Makes program close when window is closed
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Centers window
        f.setLocationRelativeTo(null);
        // Makes the JFrame visible
        f.setVisible(true);
    }
}

class Trees extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Drawings go here!
        g.setColor(Color.GREEN);
        for (int i = 0; i < 100; i+=20)
            g.drawPolygon(new int[] {10, 35, 60}, new int[] {i+50, i, i+50}, 3);
        g.setColor(new Color(76,52,52));
        g.fillRect(25,130,20,30);
    }

    public static void main(String[] args) {
        // New JFrame with funny title
        JFrame f = new JFrame("Trees!");
        // Adds class to JFrame
        f.add(new Trees());
        // Sets size of JFrame
        f.setSize(40,200);
        // Makes program close when window is closed
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Centers window
        f.setLocationRelativeTo(null);
        // Makes the JFrame visible
        f.setVisible(true);
    }
}

class ExtraGum extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Drawings go here!
        // Graphics2D object
        Graphics2D g2 = (Graphics2D) g;
        // Sets color to mint green
        g2.setColor(Color.GREEN);
        g2.setStroke(new BasicStroke(2));
        // Wrapper
        Polygon basePoly = new Polygon(new int[] {32, 405, 456, 83}, new int[] {354, 164, 264, 454}, 4);
        g2.drawPolygon(basePoly);
        // Foil wrapper
        g2.setColor(new Color(128,128,128));
        Polygon foilWrapper = new Polygon(new int[] {565, 615, 457, 406}, new int[] {83, 182, 263, 164}, 4);
        g2.fillPolygon(foilWrapper);
        // Text
        g2.setColor(new Color(146,255,110));
        g2.setFont(new Font("Helvetica", Font.BOLD, 48));
        g2.drawString("gum",100,380);
        g2.drawLine(171,369,175,356);
    }

    public static void main(String[] args) {
        // New JFrame with funny title
        JFrame f = new JFrame("Hey, you got some gum?");
        // Adds class to JFrame
        f.add(new ExtraGum());
        // Sets size of JFrame
        f.setSize(642,511);
        // Makes program close when window is closed
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Centers window
        f.setLocationRelativeTo(null);
        // Makes the JFrame visible
        f.setVisible(true);
    }
}