package com.iegor.Lectures.Lecture14;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.Arrays;

public class Lecture14 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        testCsvReadWriteDroid();
        Droid d1 = new Droid("droid1", 100, 20, 50);

        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("droids.dat"));

//        out.writeObject(new Object());
        out.writeObject(new String("Hello"));
        out.writeObject(d1);

        out.close();

        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("droids.dat"));

        String str = (String) in.readObject();
        System.out.println(str);
        Droid d2 = (Droid) in.readObject();
        System.out.println(d2);

        Droid[] droids = {
                new Droid("droid11", 100, 20, 50),
                new Droid("droid12", 100, 20, 50),
                new Droid("droid13", 100, 20, 50)
        };
        ObjectOutputStream outArr = new ObjectOutputStream(
                new FileOutputStream("droids.dat"));
        outArr.writeObject(droids);
        outArr.close();

        ObjectInputStream inArr = new ObjectInputStream(
                new FileInputStream("droids.dat"));
        Droid[] droids2 = (Droid[]) inArr.readObject();
        System.out.println(Arrays.toString(droids2));
        inArr.close();


        try (XMLEncoder xmlEncoder = new XMLEncoder(new BufferedOutputStream(
                new FileOutputStream("droid.xml")))) {
            xmlEncoder.writeObject(d1);
            xmlEncoder.flush();
        }

        try (XMLDecoder xmlDecoder = new XMLDecoder(new BufferedInputStream(
                new FileInputStream("droid.xml")))) {
            Droid d3 = (Droid) xmlDecoder.readObject();
            System.out.println(d3);
        }
    }

    private static void testCsvReadWriteDroid() throws IOException {
        Droid d1 = new Droid("droid1", 100, 20, 50);
        DroidHelper.writeDroidToFile(d1, "droid.csv");
        DroidHelper.write10DroidToFile();
        Droid[] droids = {
                new Droid("droid11", 100, 20, 50),
                new Droid("droid12", 100, 20, 50),
                new Droid("droid13", 100, 20, 50)
        };
        DroidHelper.writeDroidsToFileCSV(droids, "droids.csv");

        Droid d2 = DroidHelper.getDroidFromFile("droid.csv");

        System.out.println(d2);
    }


}
