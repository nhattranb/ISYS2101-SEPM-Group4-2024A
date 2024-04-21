package com.example.isys2101.group4.frontend;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Login extends JFrame implements ActionListener {
    public static void main(String[] args) {
        // insert png file
        ImageIcon icon = new ImageIcon("Logo.png");
        JLabel label = new JLabel(icon);
        
        JFrame frame = new JFrame("Welcome !!!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);

        // login function
        String user = JOptionPane.showInputDialog(frame, "Email or phone");
        String password = JOptionPane.showInputDialog(frame, "Enter password");
        JPasswordField passwordField = new JPasswordField();

        // login button: A blue rectangle
        JButton btnLogin = new JButton();
        btnLogin.setText("LOGIN");

        // button for register function
        Button btn = new Button("REGISTER NOW");

        // phone number at the bottom
        JLabel phone = new JLabel("Phone: 123-456-7890");
        phone.setFont(new Font("Arial", Font.PLAIN, 12));
        phone.setForeground(Color.gray);
    }

    public void setVisible(boolean b) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setVisible'");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

    public void windowOpened(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
}
