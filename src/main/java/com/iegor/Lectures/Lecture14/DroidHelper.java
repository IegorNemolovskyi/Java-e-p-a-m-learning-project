package com.iegor.Lectures.Lecture14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DroidHelper {
    public static void writeDroidToFile(Droid d1, String fileName) throws IOException {
        FileWriter fw = new FileWriter(fileName);
        fw.write(d1.toString());
        fw.close();
    }

    public static Droid getDroidFromFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("droid.csv"));
        String str = br.readLine();
        String [] words = str.split(";");
        String name = words[0];
        int armorAmount = Integer.parseInt(words[1]);
        int weaponsAmount = Integer.parseInt(words[2]);
        int weaponPower = Integer.parseInt(words[3]);
        return new Droid(name,armorAmount, weaponsAmount, weaponPower);
    }

    public static void write10DroidToFile() throws IOException {
        for (int i = 0; i < 10; i++) {
            DroidHelper.writeDroidToFile(
                    new Droid("DroidName" + i, 100, 20, 50)
                    , "droid" + i + ".csv"
            );
        }
    }

    public static void writeDroidToFiles(Droid [] droids) throws IOException {
        for (int i = 0; i < droids.length; i++) {
            DroidHelper.writeDroidToFile(
                    droids [i],
                    "droid" + i + ".csv"
            );
        }
    }

    public static void writeDroidsToFileCSV(Droid [] droids, String filename) throws IOException {
        try (FileWriter fw = new FileWriter(filename);) {
            for (int i = 0; i < droids.length; i++) {
                fw.write(droids[i].toStringCSV() + "\r\n");

            }
        }
    }
}
