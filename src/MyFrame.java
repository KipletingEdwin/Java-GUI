import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){

        this.setTitle("JFrame title goes here"); //sets title of the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of the application
        this.setResizable(false); //
        this.setSize(420,420); //sets the x-dimension and y-dimension of frame
        this.setVisible(true);  //make frame visible

        ImageIcon image = new ImageIcon("2022harrier.jpg"); //create an ImageIcon
        this.setIconImage(image.getImage()); //change icon of frame
        this.getContentPane().setBackground(new Color(123, 50, 250));
    }
}
