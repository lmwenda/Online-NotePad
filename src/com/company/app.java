package com.company;

// Imports
import javafx.stage.FileChooser;

import javax.swing.*;
import java.io.File;

public class app {

    private static JTextArea notepad;
    private static JMenu menu;
    private static JMenu submenu;
    private static JMenu about;
    private static JFileChooser fileChooser;
    private static JMenuItem i1, i2, i3, i4, i5, i6;

    public static void main(String[] args) {
        user_interface();
    }

    public static void user_interface(){
        JFrame frame = new JFrame("Online NotePad");
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
        JMenuBar menubar = new JMenuBar(); // Creating new MenuBar
        menu = new JMenu("NotePad");// New Menu Title
        submenu = new JMenu("File"); // Submenu 1
        about = new JMenu("Help");

        // SubMenu's
        i1=new JMenuItem("Save");
        i2=new JMenuItem("Save as");
        i3=new JMenuItem("Open");
        i4=new JMenuItem("New File");
        i5=new JMenuItem("About us");
        i6=new JMenuItem("Settings");

        // Action Liseners
        i2.addActionListener(action ->{
            fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Specify a text file to save.");

            int userSelection = fileChooser.showSaveDialog(frame);
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File fileToSave = fileChooser.getSelectedFile();
                JOptionPane.showConfirmDialog(null, fileToSave.getAbsoluteFile());
                System.out.println("Save as file: " + fileToSave.getAbsolutePath());
            }
        });
        
        i3.addActionListener(action -> {
        	JFileChooser fileChooser = new JFileChooser();
        	fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        	int result = fileChooser.showOpenDialog(frame);
        	if (result == JFileChooser.APPROVE_OPTION) {
        	    File selectedFile = fileChooser.getSelectedFile();
        	    System.out.println("Selected file: " + selectedFile.getAbsolutePath());
        	}
        });
        
        i5.addActionListener(action -> {
        	JOptionPane.showMessageDialog(frame.getComponent(0), "I am a new Java Developer who's creating many Projects just like this if you like this and want it to be continued even More. Consider Contributing to our Development Team. Thanks :) and bye.\"", "About us", JOptionPane.INFORMATION_MESSAGE);
        });

        // Adding the Menu's together
        submenu.add(i4); submenu.add(i1); submenu.add(i2); submenu.add(i3); submenu.add(i6);
        about.add(i5);
        menubar.add(menu);
        menubar.add(submenu);
        menubar.add(about);

        frame.setJMenuBar(menubar);


        // Set Visibility to true
        frame.setVisible(true);
    }
}
