import com.sun.java.swing.plaf.motif.MotifComboBoxUI;

import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;
public class Gameplay extends JPanel {
    private ImageIcon titleimage;
    

    public Gameplay()
    {

    }


    public void paint(Graphics g)
    {
        // draw title image border
        g.setColor(Color.white);
        g.drawRect(24,10,851,55);


         titleImage;
        titleImage.paintIcon(this,g,25,11);

        //draw border for gameplay
        g.setColor(Color.black);
        g.drawRect(25,75,851,577);

        // draw background for the gameplay
        g.setColor(Color.blue);
        g.fillRect(25,75,850,575);


    }
}
