import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Activities extends JFrame implements WindowListener, ActionListener {
    public static void main(String[] args) {
        // insert png file
        ImageIcon icon = new ImageIcon("Logo.png");
        JLabel label = new JLabel(icon);

        // display location of the user (e.g. Washington)
        String location = JOptionPane.showInputDialog("Location");

        // create a calendar
        JFrame calendar = new JFrame();

        // display the calendar
        calendar.setVisible(true);
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
