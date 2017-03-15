import javax.swing.*;

/**
 * Created by Dominic Massimo on 3/15/2017.
 */
public class IfExercise {
    public static void main(String[] args) {
        String uname = JOptionPane.showInputDialog(null, "Enter your name ");
        if (uname.equals("Dom")) {
        String pw = JOptionPane.showInputDialog(null, "Enter password ");
        if (pw.equals("d123")) {
        JOptionPane.showMessageDialog(null, "Welcome " + uname);
    } else {
        JOptionPane.showMessageDialog(null, "Wrong Password");
    }
} else {
            JOptionPane.showMessageDialog(null,"Wrong Username");
        }

            
    }
}
