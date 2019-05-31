import java.awt.*
import java.io.File
import javax.imageio.ImageIO

import javax.swing.*

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
    }

    companion object {
        // Boilerplate code
        @JvmStatic
        fun main(args: Array<String>) {
            // Sets cheeky title
            val f = JFrame("Pacular Man")
            // Adds class to the frame for viewing
            f.add(Checkerboard())
            f.add(JLabel(ImageIcon("NineTwo/images/pac.png")))
            // Sets frame size to a "cozy" 400px×400px
            f.setSize(500, 500)
            // Makes the program exit when you close the window
            f.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
            // Centers the window on the screen
            f.setLocationRelativeTo(null)
            f.isVisible = true
        }
    }
}