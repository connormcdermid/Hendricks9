/*
  author: Frank Gomes
  lab: 9.2 Worksheet PacMan
  date: 05-06-19
  extra: Moving Pac Man
 */

import java.awt.*

import javax.swing.*
import javax.swing.JPanel
import javax.swing.JFrame

internal class Title : JPanel() {
    public override fun paintComponent(g: Graphics) {
        super.paintComponent(g)
        // Drawings go here!
        background = Color.BLACK
        foreground = Color.WHITE
        // Title text
        val title = ImageIcon("NineTwo/images/MAN.png")
        val titleImage = title.image!!
        // Red ghost
        val rGhost = ImageIcon("NineTwo/images/ghost_red.png")
        val rGhostImage = rGhost.image!!
        // Blue ghost
        val bGhost = ImageIcon("NineTwo/images/ghost_blue.png")
        val bGhostImage = bGhost.image!!
        // Orange ghost
        val oGhost = ImageIcon("NineTwo/images/ghost_orange.png")
        val oGhostImage = oGhost.image!!
        // Yellow ghost
        val yGhost = ImageIcon("NineTwo/images/ghost_yellow.png")
        val yGhostImage = yGhost.image!!
        // The pacular man himself
        val pac = ImageIcon("NineTwo/images/pac.png")
        val pacImage = pac.image!!
        // The pacular man hungers
        val pacG = ImageIcon("NineTwo/images/pac_animated.gif")
        val pacGobble = JLabel(pacG)
        pacGobble.setBounds(184,10,100,100)
        // Draws all images on screen
        g.drawImage(titleImage,84,10,null)
        g.drawImage(pacImage,320,380,null)
        if (image != null) {
            g.drawImage(image, 170, 10, this)
        }
        g.fillOval(430,420,20,20)
        g.drawImage(oGhostImage,20,350,null)
        g.drawImage(bGhostImage,120,350,null)
        g.drawImage(yGhostImage,20,250,null)
        g.drawImage(rGhostImage,120,250,null)
    }

    var image: Image? = null

    init {
        image = Toolkit.getDefaultToolkit().createImage("NineTwo/images/pac_animated.gif")
    }
}

internal class Checkerboard : JPanel() {
    public override fun paintComponent(g: Graphics) {
        super.paintComponent(g)
        // Drawings go here!
        foreground = Color.BLACK
        // Checkerboard
        g.fillRect(0,0,100,100)
        g.fillRect(200,0,100,100)
        g.fillRect(400,0,100,100)
        g.fillRect(300,100,100,100)
        g.fillRect(0,200,100,100)
        g.fillRect(100,100,100,100)
        g.fillRect(200,200,100,100)
        g.fillRect(400,200,100,100)
        g.fillRect(100,300,100,100)
        g.fillRect(300,300,100,100)
        g.fillRect(0,400,100,100)
        g.fillRect(200,400,100,100)
        g.fillRect(400,400,100,100)
        // Red ghost
        val rGhost = ImageIcon("NineTwo/images/ghost_red.png")
        val rImage = rGhost.image!!
        // The Pacular Man himself
        val pac = ImageIcon("NineTwo/images/pac.png")
        val pacImage = pac.image!!
        // Draws ghost & Pacular Man
        g.drawImage(rImage,100,110,null)
        g.drawImage(pacImage,300,300,null)
    }

    companion object {
        // Boilerplate code
        @JvmStatic
        fun main(args: Array<String>) {
            // Sets cheeky title
            val f = JFrame("Pacular Man")
            // Adds class to the frame for viewing
            f.add(Checkerboard())
            // Sets frame size
            f.setSize(514, 538)
            // Makes the program exit when you close the window
            f.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
            // Centers the window on the screen
            f.setLocationRelativeTo(null)
            f.isVisible = true

            // Title screen JFrame
            val f2 = JFrame("   MAN")
            // Adds Title screen to JFrame
            f2.add(Title())
            // Sets frame size
            f2.setSize(514,538)
            // Exit on close
            f2.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
            // Centers window on screen also
            f2.setLocationRelativeTo(null)
            f2.isVisible = true
        }
    }
}