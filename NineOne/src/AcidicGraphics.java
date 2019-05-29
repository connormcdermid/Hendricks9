/*
  author: Frank Gomes
  lab: 9.1 Worksheet Basics
  date: 28-05-19
  extra: Pulsing color
 */

import java.awt.*;
import java.util.concurrent.*;

import javax.swing.*;

class ProblemOne extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Drawings go here!
        setForeground(Color.GREEN);
        setBackground(Color.BLACK);
        // Part A
        {
            // Green outline for rectangle
            g.drawRect(40, 30, 100, 300);
            // Blue rectangle
            g.setColor(Color.BLUE);
            g.fillRect(45, 35, 90, 290);
        }
        // Part B
        {
            g.setColor(Color.ORANGE);
            g.drawRect(40,30,110, 120);
            g.setColor(Color.CYAN);
            g.drawRect(35,25,120,130);
        }
        // Part C
        {
            g.setColor(Color.RED);
            g.fillOval(75, 75, 50, 50);
            g.drawOval(65, 65, 70, 70);
        }
        // Part D
        {
            g.setColor(Color.MAGENTA);
            g.setFont(new Font("Helvetica", Font.BOLD,12));
            g.drawString("Graphics are easy in Java!",200,200);
        }
    }

    // Boilerplate code
    public static void main(String[] args) {
        // Sets cheeky title
        JFrame f = new JFrame("Problem One");
        // Adds ProblemOne to the frame for viewing
        f.add(new ProblemOne());
        // Sets frame size to a "cozy" 400px×400px
        f.setSize(400,400);
        // Makes the program exit when you close the window
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Centers the window on the screen
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}

class ProblemTwo extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Drawings go here!
        setBackground(Color.BLUE);
        setForeground(Color.ORANGE);
        g.fillOval(30,30,50,50);
        g.fillOval(30,90,50,50);
        g.fillOval(30,150,50,50);
        g.fillOval(30,210,50,50);
        g.fillOval(90,210,50,50);
        g.fillOval(150,210,50,50);
        g.fillOval(210,210,50,50);
        g.setFont(new Font("Arial", Font.BOLD,36));
        g.drawString("Go",140,120);
        g.drawString("Team!",115,155);
    }

    // Boilerplate code
    public static void main(String[] args) {
        // Sets cheeky title
        JFrame f = new JFrame("Problem Two");
        // Adds ProblemTwo to the frame for viewing
        f.add(new ProblemTwo());
        // Sets frame size to a "very cozy" 300px×320px
        f.setSize(300,320);
        // Makes the program exit when you close the window
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Centers the window on the screen
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}

class ProblemThree extends JPanel {
    // For telling the panel to be repainted at regular intervals
    ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();

    int colorCounter = 0;
    boolean backwardsPulse = false;

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponents(g);
        g.setColor(new Color(colorCounter,0,(255-colorCounter)));
        // Rectangle that acts as pulsing background
        g.fillRect(0,0,640,480);
        // Every other shape with a static color
        // Makes a Graphics2D object, whose stroke thickness can be modified
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(5));
        // Converging lines in between rectangles
        g2.setColor(Color.BLACK);
        g2.drawLine(0,0,350,250);
        // Small rectangle
        g2.setColor(Color.WHITE);
        g2.fillRect(75,75, 100,50);
        g2.setColor(Color.BLACK);
        g2.drawRect(75,75, 100,50);
        // Small circle
        g2.setColor(Color.GREEN);
        g2.fillOval(100,75,50,50);
        g2.setColor(Color.BLACK);
        g2.drawOval(100,75,50,50);
        // Small square
        g2.setColor(Color.YELLOW);
        g2.fillRect(107,82,35,35);
        g2.setColor(Color.BLACK);
        g2.drawRect(107,82,35,35);
        // Converging lines in between rectangles, part 2
        g2.drawLine(0,0,150,150);
        g2.drawLine(0,0,350,150);
        g2.drawLine(0,0,150,250);
        // Big rectangle
        g2.setColor(Color.WHITE);
        g2.fillRect(150,150,200,100);
        g2.setColor(Color.BLACK);
        g2.drawRect(150,150,200,100);
        // Big circle
        g2.setColor(Color.GREEN);
        g2.fillOval(200,150,100,100);
        g2.setColor(Color.BLACK);
        g2.drawOval(200,150,100,100);
        // Big square
        g2.setColor(Color.YELLOW);
        g2.fillRect(215,165,70,70);
        g2.setColor(Color.BLACK);
        g2.drawRect(215,165,70,70);
    }

    public ProblemThree() {
        JFrame frame = new JFrame();
        frame.setTitle("Problem Three");
        frame.add(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(640, 480);
        frame.setVisible(true);
        service.scheduleAtFixedRate(new Runnable() {
            public void run()
            {
                repaint();
                // If the color is max redness (colorCounter == 255), reverses direction
                if (colorCounter >= 255)
                    backwardsPulse = true;
                // Checks to see if at the end of the backwards pulse, reverses direction
                if (colorCounter < 1)
                    backwardsPulse = false;
                // During backwardsPulse, decreases colorCounter, reversing direction of pulse and making it bluer
                if (backwardsPulse)
                    colorCounter--;
                // If the pulse is at normal (backwardsPulse == false) then it increments the colorCounter, making pulse redder
                else
                    colorCounter++;

            }
        }, 0, 10, TimeUnit.MILLISECONDS);
    }

    public static void main(String[] args) {
        new ProblemThree();
    }
}