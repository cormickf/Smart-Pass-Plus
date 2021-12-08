import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.SQLOutput;


public class Main {

    public static void main(String[] args) {



        // Main view for the student will see name status and location
        JFrame mainFrame = new JFrame("Student View");
        mainFrame.setSize(400,400);
        mainFrame.setVisible(true);
        mainFrame.setLayout(null);

        // control view will be able to change the status and location
        JFrame secondFrame = new JFrame();
        secondFrame.setSize(400,400);
        secondFrame.setVisible(false);
        secondFrame.setLayout(null);


        JFrame logIn = new JFrame("Log in");
        logIn.setSize(200,200);
        logIn.setLayout(null);
        logIn.setVisible(false);


        // setting the buttons
        JButton control = new JButton("control");
        JButton away = new JButton("Away");
        JButton inClass = new JButton("Present");
        JButton setDestination = new JButton("Set");
        JButton away2 = new JButton("Away");
        JButton inClass2 = new JButton("Present");
        JButton setLocation2 = new JButton("Set");
        JButton checkLog = new JButton("Log in");
        JButton setAnounce = new JButton("Send");

        // setting labels and text fields.
        JLabel name = new JLabel("Cormick");
        JLabel status = new JLabel("Present");
        JTextField destination = new JTextField("");
        JLabel showLocation = new JLabel("class");
        JLabel nameInfo = new JLabel("Name");
        JLabel statusInfo = new JLabel("Status");
        JLabel locationInfo = new JLabel("Location");
        JLabel name2 = new JLabel("Patrick");
        JLabel status2 = new JLabel("Present");
        JLabel location2 = new JLabel("Class");
        JLabel controlName = new JLabel("Cormick");
        JLabel controlName2 = new JLabel("Patrick");
        JTextField destination2 = new JTextField();
        JLabel logInInfo = new JLabel("Enter password");
        JTextField logging = new JTextField();
        JLabel announce = new JLabel("Waiting for Announcements");
        JTextField anouncements = new JTextField("Set Announcement");







        // setting all the locations and sizes for the buttons and labels, text fields
        name.setBounds(0,150,70,30);
        control.setBounds(0,0,100,30);
        away.setBounds(70,20,80,30);
        status.setBounds(70, 150,70,30);
        showLocation.setBounds(140,150,110,30);
        destination.setBounds(240,20,75,30);
        setDestination.setBounds(300,20,60,30);
        nameInfo.setBounds(0,120,70,30);
        statusInfo.setBounds(70,120,70,30);
        locationInfo.setBounds(140,120,110,30);
        name2.setBounds(0,180,70,30);
        status2.setBounds(70,180,70,30);
        location2.setBounds(140,180,110,30);
        controlName.setBounds(0,20,70,30);
        inClass.setBounds(150,20,90,30);
        controlName2.setBounds(0,50,70,30);
        away2.setBounds(70,50,80,30);
        inClass2.setBounds(150,50,90,30);
        destination2.setBounds(240,50,75,30);
        setLocation2.setBounds(300,50,60,30);
        logInInfo.setBounds(20,20,110,30);
        logging.setBounds(20,45,110,30);
        checkLog.setBounds(20, 75, 110,30);
        announce.setBounds(0,90,250,30);
        anouncements.setBounds(50,250,150,30);
        setAnounce.setBounds(50,220,70,30);


        // setting borders for the text fields and labels
        name.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        status.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

        destination.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));

        showLocation.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));

        nameInfo.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        locationInfo.setBorder(BorderFactory.createLineBorder(Color.BLACK,1 ));
        statusInfo.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
        name2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        status2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        location2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        controlName.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        controlName2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        destination2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        logging.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
        announce.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        anouncements.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));




        // all the button control for when pressed events





        control.addActionListener(new AbstractAction() {
            public void actionPerformed(ActionEvent e) {

                logIn.setVisible(true);





            }
        });

                // the log in system for the control area.
        checkLog.addActionListener(new AbstractAction() {

            public void actionPerformed(ActionEvent e) {
                String check = logging.getText();

                if (check.equals("teacher")) {

                    secondFrame.setVisible(true);
                    logIn.setVisible(false);
                    System.out.println("Working");
                } else {
                    System.out.println("Not working");

                }

            }
        });



        away.addActionListener(new AbstractAction() {

            public void actionPerformed(ActionEvent e) {

                status.setText("Away");

                status.setBackground(Color.RED);
                status.setOpaque(true);



            }
        });

        inClass.addActionListener(new AbstractAction() {

            public void actionPerformed(ActionEvent e) {

                status.setText("Present");

                status.setBackground(Color.GREEN);
                status.setOpaque(true);


            }
        });

        setDestination.addActionListener(new AbstractAction() {

            public void actionPerformed(ActionEvent e) {

                showLocation.setText(destination.getText());




            }
        });

        setLocation2.addActionListener(new AbstractAction() {

            public void actionPerformed(ActionEvent e) {

                location2.setText(destination2.getText());




            }
        });

        inClass2.addActionListener(new AbstractAction() {

            public void actionPerformed(ActionEvent e) {

                status2.setText("Present");

                status2.setBackground(Color.GREEN);
                status2.setOpaque(true);


            }
        });
        away2.addActionListener(new AbstractAction() {

            public void actionPerformed(ActionEvent e) {

                status2.setText("Away");

                status2.setBackground(Color.RED);
                status2.setOpaque(true);



            }
        });

        setAnounce.addActionListener(new AbstractAction() {

            public void actionPerformed(ActionEvent e) {

                announce.setText(anouncements.getText());


            }
        });





        // adding all the extras like buttons,text feilds, and labels to the frame to be visable
        mainFrame.add(control);
        mainFrame.add(name);
        secondFrame.add(away);
        mainFrame.add(status);
        secondFrame.add(inClass);
        secondFrame.add(destination);
        secondFrame.add(setDestination);
        mainFrame.add(showLocation);
        mainFrame.add(nameInfo);
        mainFrame.add(locationInfo);
        mainFrame.add(statusInfo);
        mainFrame.add(name2);
        mainFrame.add(status2);
        mainFrame.add(location2);
        secondFrame.add(controlName);
        secondFrame.add(controlName2);
        secondFrame.add(away2);
        secondFrame.add(destination2);
        secondFrame.add(inClass2);
        secondFrame.add(setLocation2);
        logIn.add(logInInfo);
        logIn.add(logging);
        logIn.add(checkLog);
        mainFrame.add(announce);
        secondFrame.add(anouncements);
        secondFrame.add(setAnounce);

    }



}
