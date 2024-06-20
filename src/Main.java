import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //JFrame = a GUI window to add components to

        JFrame frame = new JFrame(); //creates a frame
        frame.setTitle("JFrame title goes here"); //sets title of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of the application
        frame.setResizable(false); //
        frame.setSize(420,420); //sets the x-dimension and y-dimension of frame
        frame.setVisible(true);  //make frame visible




    }
}