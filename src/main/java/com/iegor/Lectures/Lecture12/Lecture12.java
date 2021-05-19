package com.iegor.Lectures.Lecture12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Lecture12 {
    public static void main(String[] args) {
        System.out.println(div());
    }

    public static int div(){
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
    try {
        System.out.println("Enter n");
        int n = Integer.parseInt(br.readLine());
        logger.info("Enter n = " + n );
        System.out.println("Enter k");
        int k = Integer.parseInt(br.readLine());
        logger.info("Enter k = " + k );
        return n/k;
    } catch (NumberFormatException | IOException e) {
        System.out.println(e.getMessage());
        return -1;
    } catch (ArithmeticException e) {
        //return -2;
        //System.out.println(e.getMessage());
        //System.err.println(e.getMessage());
        //logger.severe(e.getMessage());
        logger.log(Level.SEVERE, "Divide k/n", e);
        throw e;
    } catch (Exception e) {
        return -3;}
    }

    public static Logger logger = Logger.getLogger(Lecture12.class.getName());

    static {
        try {
            FileHandler fh = new FileHandler("Lecture12.log", true);
            fh.setFormatter(new SimpleFormatter());
            logger.addHandler(fh);
            logger.setLevel(Level.WARNING);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
