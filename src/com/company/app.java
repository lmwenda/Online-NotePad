package com.company;

// Imports
import javax.swing.*;

public class app {

    private static JTextArea notepad;

    public static void main(String[] args) {
        user_interface();
    }

    public static void user_interface(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        // Frame Settings
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);
        System.out.println("Running Notepad");

        // User Interface

        // Notes
        notepad = new JTextArea();
        notepad.setBounds(0, 0, 1500, 1000);
        panel.add(notepad);

        // NavBar Settings

        // Set Visibility to true
        frame.setVisible(true);
    }
}
