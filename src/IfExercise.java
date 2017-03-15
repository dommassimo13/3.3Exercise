import javax.swing.*;

/**
 * Created by Dominic Massimo on 3/15/2017.
 * IfDemo
 * Demonstrates if/else statement for username authentication
 */
public class IfExercise {
    public static void main(String[] args) {
        // declares string uname for dialog box
        String uname = JOptionPane.showInputDialog(null, "Enter your name ");
        //declares correct username
        if (uname.equals("Dom")) {
        String pw = JOptionPane.showInputDialog(null, "Enter password ");
        //declares correct password
        if (pw.equals("d123")) {
            //If username is true then the correct response will be welcome + username
        JOptionPane.showMessageDialog(null, "Welcome " + uname);
        // if username or password is false it will display either wrong password or wrong username
    } else {
        JOptionPane.showMessageDialog(null, "Wrong Password");
    }
} else {
            JOptionPane.showMessageDialog(null,"Wrong Username");
        }


    }
}
