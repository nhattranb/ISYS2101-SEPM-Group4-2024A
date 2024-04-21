package com.example.isys2101.group4.frontend;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Menu extends JFrame implements WindowListener, ActionListener {
    // Main menu
    public static void main(String[] args) {
        // insert logo on the left of the screen
        ImageIcon icon = new ImageIcon("Logo.png");
        JLabel label = new JLabel(icon);

        // align it to the left
        label.setHorizontalAlignment(SwingConstants.LEFT);
        
        // menu frame
        JFrame frame = new JFrame("Welcome !!!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);

        // menu function
        Object[] obj = {"Register", "Login"};
        int option = JOptionPane.showOptionDialog(frame, "Choose one", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, obj, obj[0]);

        // Extension Choice Menu
        // membership button
        Button btn = new Button("Membership");

        //
    }

    public void actionPerformed(ActionEvent e) {
        // Lead to the register page
        if (e.getSource() instanceof Button) {
            Register register = new Register();
            ((JComponent) register.getContentPane()).setVisible(true);
        }

        // Lead to the login page
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
