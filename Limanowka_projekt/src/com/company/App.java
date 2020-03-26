package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class App extends JFrame implements ActionListener {
    private JPanel panel, panel2, panel3, panel4, panel5,panel6;
    private JLabel tekst, image1, tekst2, tekst3, tekst4,tekst5,tekst6;
    private JButton button, buttonInfo, buttonStart, buttonKoniec, buttonMenu, buttonLosuj;
    private JTextField punkty;
    private JLabel  error1, error2,error3, error4,proba1,proba2,proba3;
    private JLabel[] wyniki = new JLabel[3];
    private Integer total;

    App() {
        super("Dominika Limanowka Programowanie III");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 600);
        panel = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        panel5 = new JPanel();
        buttonInfo = new JButton("INFO");
        buttonStart = new JButton("START");
        buttonKoniec = new JButton("KONIEC");
        buttonMenu = new JButton("Powrót do MENU");
        buttonLosuj = new JButton("Losuj");
        punkty = new JTextField();
        error4 = new JLabel("<html>Podano złą wartość, wpisz wartosc z zakresu od 500 do 500000 lub program wykona się dla 100000 punktów.</html> ");
        error2 = new JLabel("<html>Podano zbyt dużą liczbę punktów, wpisz wartosc z zakresu od 500 do 500000 lub program wykona się dla 500000 punktów.</html> ");
        error1 = new JLabel("<html>Podano zbyt małą liczbę punktów, wpisz wartosc z zakresu od 500 do 500000 lub program wykona się dla 500 punktów.</html> ");
        error3 = new JLabel();
        punkty.addActionListener(this);
        buttonInfo.addActionListener(this);
        buttonStart.addActionListener(this);
        buttonKoniec.addActionListener(this);
        buttonMenu.addActionListener(this);
        buttonLosuj.addActionListener(this);
        ekranStartowy();
    }
    public void ekranStartowy() {
        panel.setLayout(null);
        panel.setBackground(new Color(68, 92, 60));
        add(panel);
        tekst = new JLabel("Pastwisko");
        tekst.setBounds(190, 10, 800, 100);
        tekst.setFont(new Font("Verdana", (Font.PLAIN), 80));
        tekst.setForeground(Color.WHITE);
        panel.add(tekst);
        button = new JButton();
        try {
            BufferedImage myPicture = ImageIO.read(new File("src/goat.jpg"));
            button.setBounds(130, 120, 500, 333);
            Image dimg = myPicture.getScaledInstance(button.getWidth(), button.getHeight(),
                    Image.SCALE_SMOOTH);
            ImageIcon ii = new ImageIcon(dimg);
            button.setIcon(ii);
            panel.add(button);
        } catch (IOException e) {
            image1 = new JLabel("Nie znaleziono obrazu");
            image1.setBounds(170, 10, 800, 100);
            image1.setFont(new Font("Verdana", (Font.PLAIN), 80));
            image1.setForeground(Color.WHITE);
            panel.add(image1);
        }
        button.addActionListener(this);
        button.setVisible(true);
        panel.add(button);
        buttonMenu.setBounds(130, 440, 500, 100);
        buttonMenu.setBackground(new Color(68, 92, 60));
        buttonMenu.setVisible(false);
        panel.add(buttonMenu);
        buttonLosuj.setBounds(130, 440, 500, 100);
        buttonLosuj.setBackground(new Color(68, 92, 60));
        buttonLosuj.setVisible(false);
    }
    public void ekranMenu() {
        panel5.setVisible(false);
        panel4.setVisible(false);
        panel3.setVisible(false);
        panel.setVisible(false);
        buttonMenu.setVisible(false);
        panel2.setVisible(true);
        panel2.setLayout(null);
        panel2.setBackground(new Color(243, 239, 224));
        add(panel2);


        tekst2 = new JLabel("Menu");
        tekst2.setBounds(260, 10, 800, 100);
        tekst2.setFont(new Font("Verdana", (Font.PLAIN), 100));
        tekst2.setForeground(new Color(102, 51, 0));
        panel2.add(tekst2);

        buttonInfo.setBounds(130, 130, 500, 100);
        buttonInfo.setBackground(new Color(68, 92, 60));
        buttonInfo.setVisible(true);
        panel2.add(buttonInfo);
        buttonStart.setBounds(130, 260, 500, 100);
        buttonStart.setBackground(new Color(68, 92, 60));
        buttonStart.setVisible(true);
        panel2.add(buttonStart);
        buttonKoniec.setBounds(130, 390, 500, 100);
        buttonKoniec.setBackground(new Color(68, 92, 60));
        buttonKoniec.setVisible(true);
        panel2.add(buttonKoniec);
        buttonInfo.addActionListener(this);
        buttonStart.addActionListener(this);
        buttonKoniec.addActionListener(this);
    }
    public void ekranInfo() {
        panel3.setLayout(null);
        panel3.setBackground(new Color(243, 239, 224));
        add(panel3);
        panel3.setVisible(true);
        panel2.setVisible(false);
        tekst3 = new JLabel("Info");
        tekst3.setBounds(260, 10, 800, 100);
        tekst3.setFont(new Font("Verdana", (Font.PLAIN), 100));
        tekst3.setForeground(new Color(102, 51, 0));
        panel3.add(tekst3);
        try {
            JLabel info = new JLabel();
            BufferedImage myPicture = ImageIO.read(new File("src/info.jpg"));
            info.setBounds(130, 120, 500, 333);
            Image dimginfo = myPicture.getScaledInstance(info.getWidth(), info.getHeight(),
                    Image.SCALE_SMOOTH);
            ImageIcon iiinfo = new ImageIcon(dimginfo);
            info.setIcon(iiinfo);
            panel3.add(info);
        } catch (IOException e) {
            image1 = new JLabel("Nie znaleziono obrazu");
            image1.setBounds(170, 10, 800, 100);
            image1.setFont(new Font("Verdana", (Font.PLAIN), 80));
            image1.setForeground(Color.WHITE);
            panel.add(image1);
        }
        buttonMenu.setVisible(true);
        panel3.add(buttonMenu);

    }
    public void ekranProgram() {
        panel4.setLayout(null);
        panel4.setBackground(new Color(243, 239, 224));
        add(panel4);
        panel4.setVisible(false);
        panel4.setVisible(true);
        panel2.setVisible(false);
        tekst4 = new JLabel("Pastwisko");
        tekst4.setBounds(150, 10, 800, 100);
        tekst4.setFont(new Font("Verdana", (Font.PLAIN), 100));
        tekst4.setForeground(new Color(102, 51, 0));
        panel4.add(tekst4);
        tekst5 = new JLabel("<html>Wpisz, ile punktów <br/>ma zostać wylosowanych: </html>");
        tekst5.setBounds(30, 200, 340, 105);
        tekst5.setFont(new Font("Verdana", (Font.PLAIN), 24));
        tekst5.setForeground(new Color(102, 51, 0));
        panel4.add(tekst5);
        punkty.setForeground(Color.black);
        punkty.setBounds(400, 200, 340, 100);
        punkty.setFont(new Font("Verdana", (Font.PLAIN), 70));
        panel4.add(punkty);
    }
    public void ekranWynik() {
        panel5.setLayout(null);
        panel5.setBackground(new Color(243, 239, 224));
        add(panel5);
        panel2.setVisible(false);
        panel3.setVisible(false);
        panel4.setVisible(false);
        panel.setVisible(false);

        tekst6 = new JLabel("Wyniki");
        tekst6.setBounds(200, 10, 800, 100);
        tekst6.setFont(new Font("Verdana", (Font.PLAIN), 100));
        tekst6.setForeground(new Color(102, 51, 0));
        panel5.add(tekst6);
        proba1 = new JLabel("Próba I");
        proba1.setBounds(50, 150, 200, 80);
        proba1.setFont(new Font("Verdana", (Font.PLAIN), 30));
        proba1.setForeground(new Color(102, 51, 0));
        panel5.add(proba1);
        proba2 = new JLabel("Próba II");
        proba2.setBounds(300, 150, 200, 80);
        proba2.setFont(new Font("Verdana", (Font.PLAIN), 30));
        proba2.setForeground(new Color(102, 51, 0));
        panel5.add(proba2);
        proba3 = new JLabel("Próba III");
        proba3.setBounds(570, 150, 200, 80);
        proba3.setFont(new Font("Verdana", (Font.PLAIN), 30));
        proba3.setForeground(new Color(102, 51, 0));
        panel5.add(proba3);
        panel5.revalidate();
        panel5.repaint();
        panel5.setVisible(true);
        Pastwisko pastwisko = new Pastwisko(total, 0.01);
        for(int i =0; i<3; i++) {
            wyniki[i] = new JLabel();
            wyniki[i].setBounds(50+i*265, 250, 200, 80);
            wyniki[i].setFont(new Font("Verdana", (Font.PLAIN), 30));
            wyniki[i].setForeground(new Color(102, 51, 0));

            double[][] punkty = pastwisko.losujPunkty(total);
            double[][] wynikix = pastwisko.znajdzPromien(punkty, total, 0.01);
           wynikix[0][0]= wynikix[0][0] * 100;
           wynikix[0][0] =Math.round(wynikix[0][0]);
           wynikix[0][0] /= 100;
            String temp = Double.toString(wynikix[0][0]);
            wyniki[i].setText(temp+" m");
            panel5.add(wyniki[i]);
        }

        buttonMenu.setVisible(true);
        panel5.add(buttonMenu);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == button) {
            ekranMenu();
        }
        if ((source == buttonInfo)) {
            ekranInfo();
        }
        if (source == buttonStart) {
            ekranProgram();
        }
        if (source == punkty) {
            try {
               total = Integer.parseInt(punkty.getText());
                if(total<500){
                    error1.setBounds(50, 190, 700, 300);
                    error1.setFont(new Font("Verdana", (Font.PLAIN), 20));
                    error1.setForeground(Color.RED);
                    panel4.remove(error2);
                    panel4.remove(error4);
                    panel4.remove(error3);
                    panel4.add(error1);
                    panel4.revalidate();
                    panel4.repaint();
                    total = 500;

                }
                else if (total > 500000){
                    panel4.remove(error1);
                    panel4.remove(error4);
                    panel4.remove(error3);
                    error2.setBounds(50, 190, 700, 300);
                    error2.setFont(new Font("Verdana", (Font.PLAIN), 20));
                    error2.setForeground(Color.RED);
                    panel4.add(error2);
                    panel4.revalidate();
                    panel4.repaint();
                    total = 500000;

                }
                else{
                    error3.setText("<html>Wpisano prawidłową wartość, program wykona się dla " + total + " punktów  </html> ");
                    error3.setBounds(50, 190, 700, 300);
                    error3.setFont(new Font("Verdana", (Font.PLAIN), 20));
                    error3.setForeground(Color.RED);
                    panel4.add(error3);
                    panel4.revalidate();
                    panel4.repaint();
                    panel4.remove(error1);
                    panel4.remove(error2);
                    panel4.remove(error4);
                }
            }
            catch (Exception ex) {
                error4.setBounds(50, 190, 700, 300);
                error4.setFont(new Font("Verdana", (Font.PLAIN), 20));
                error4.setForeground(Color.RED);
                panel4.add(error4);
                panel4.remove(error1);
                panel4.remove(error2);
                panel4.remove(error3);
                panel4.add(buttonLosuj);
                panel4.revalidate();
                panel4.repaint();
                total = 100000;
            }
            buttonLosuj.setVisible(true);
            panel4.add(buttonLosuj);
        }
        if (source == buttonMenu) {
            ekranMenu();
        }
        if (source == buttonKoniec) {
            System.exit(0);
        }
        if (source==buttonLosuj){
            panel5.removeAll();
             ekranWynik();
        }
    }
}