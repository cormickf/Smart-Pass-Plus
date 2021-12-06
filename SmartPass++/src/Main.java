import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class Main {

    public static void main(String[] args) {




        JFrame mainFrame = new JFrame();
        mainFrame.setSize(400,400);
        mainFrame.setVisible(true);
        mainFrame.setLayout(null);

        JFrame secondFrame = new JFrame();
        secondFrame.setSize(400,400);
        secondFrame.setVisible(false);
        secondFrame.setLayout(null);





        JButton control = new JButton("control");
        JButton away = new JButton("Away");
        JButton inClass = new JButton("Present");

        JLabel name = new JLabel("Cormick");
        JLabel status = new JLabel();





        name.setBounds(0,150,70,30);
        control.setBounds(0,0,100,30);
        away.setBounds(100,170,70,30);
        status.setBounds(60, 150,70,30);
        inClass.setBounds(100,250,70,30);


        control.addActionListener(new AbstractAction() {
            public void actionPerformed(ActionEvent e) {

                secondFrame.setVisible(true);





            }
        });

        away.addActionListener(new AbstractAction() {

            public void actionPerformed(ActionEvent e) {

                status.setText("Away");



            }
        });

        inClass.addActionListener(new AbstractAction() {

            public void actionPerformed(ActionEvent e) {

                status.setText("Present");


            }
        });



        mainFrame.add(control);
        mainFrame.add(name);
        secondFrame.add(away);
        mainFrame.add(status);
        secondFrame.add(inClass);


    }



}
