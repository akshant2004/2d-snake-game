import javax.swing.*;
import java.awt.*;

public class main {

    public static void main(String[] args) {
        JFrame obj = new JFrame() ;
        Gameplay gameplay = new Gameplay();

        obj.setBounds(10,10,905,700);
        obj.setBackground(Color.darkGray );
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gameplay);



    }



}
