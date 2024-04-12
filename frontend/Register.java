import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Register extends JFrame implements WindowListener, ActionListener {
    public static void main(String[] args) {
        // insert png file
        ImageIcon icon = new ImageIcon("Logo.png");
        JLabel label = new JLabel(icon);
        
        JFrame frame = new JFrame("Welcome !!!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);

        // register function
        String name = JOptionPane.showInputDialog(frame, "Name");
        String user = JOptionPane.showInputDialog(frame, "Email or phone");
        String password = JOptionPane.showInputDialog(frame, "Enter password");
        JPasswordField passwordField = new JPasswordField();
        String confirm = JOptionPane.showInputDialog(frame, "Confirm password");
        JPasswordField confirmField = new JPasswordField();
        Object[] obj = {"Register", "Cancel"};

        // button for login function
        Button btn = new Button("LOGIN NOW");
    }

    public void actionPerformed(ActionEvent e) {
        // Lead to the menu
        if (e.getSource() instanceof Button) {
            Menu menu = new Menu();
            ((JComponent) menu.getContentPane()).setVisible(true);
        }

        // Lead to the Login page
        if (e.getSource() instanceof Button) {
            Login login = new Login();
            login.setVisible(true);
        }
    }

    public void windowOpened(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}

    @Override
    public void windowClosing(WindowEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'windowClosing'");
    }
}
