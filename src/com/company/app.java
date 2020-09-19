package com.company;

// Imports
import javax.swing.*;

public class app {

    private static JTextArea notepad;
    private static JMenu menu;
    private static JMenu submenu;
    private static JMenu about;
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
        i3=new JMenuItem("Save all");
        i4=new JMenuItem("New File");
        i5=new JMenuItem("Find Help");
        i6=new JMenuItem("Settings");

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
