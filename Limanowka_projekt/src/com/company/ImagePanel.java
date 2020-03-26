package com.company;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImagePanel extends JPanel {
    private BufferedImage image;
    private JLabel  image1;

    public ImagePanel() {
        try{
            image = ImageIO.read(new File("goat.png"));
        }catch (IOException e){
            image1 = new JLabel("Nie znaleziono obrazu");
        }}

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this); // see javadoc for more info on the parameters
    }

}