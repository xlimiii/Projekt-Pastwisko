package com.company;

import javax.swing.*;
import java.util.Random;

public class Pastwisko extends JFrame {
    int n;
    double krok;

    Pastwisko(int n, double krok){
        n = this.n;
        krok = this.krok;
    }
    double[][] losujPunkty(Integer n){
        double[][] punkty = new double[n][2];
        Random generator = new Random();
        for (int i = 0; i < n; i++) {
            do{
                punkty[i][0]=generator.nextInt(201);
                punkty[i][0]-=100;
                punkty[i][0]/=100;
                punkty[i][1]=generator.nextInt(201);
                punkty[i][1]-=100;
                punkty[i][1]/=100;
            }while (punkty[i][0] *punkty[i][0]+punkty[i][1]*punkty[i][1]>1);
        }
        return punkty;
    }
    double[][] znajdzPromien(double[][] punkty,int n,double krok){
        double[][] procent = new double[1][2];
        procent[0][1] = 0;
        procent[0][0] = 0;
        int counter=0;
        double promien = 1;
        do
        {counter=0;
            for (int i =0; i<n;i++) {

                if (punkty[i][0] * punkty[i][0] + (punkty[i][1] - 1) * (punkty[i][1] - 1) <= promien)
                    counter++;
            }
            procent[0][0] = promien;
            procent[0][1] = counter * 100.0 / n;
            promien = promien+krok;
        }while(procent[0][1]<50.);
        return procent;
    }
}
