import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

      JFrame frame = new JFrame();// creates a frame
        frame.setTitle("Bruv.."); //sets title of frame
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);// exit of application
        frame.setResizable(false); //prevent frame from being resized
        frame.setSize(420,600);// sets x dimension and y demension of our frame
        frame.setVisible(true);//makes frame visible

        //  ImageIcon image = new ImageIcon("name of image"); //creates an image icon
        //frame.setIconImage(image.getImage()); change icon of frame

        frame.getContentPane().setBackground(new Color(100,10,233) );
    }
}