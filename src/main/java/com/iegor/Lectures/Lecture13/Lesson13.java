package com.iegor.Lectures.Lecture13;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson13 {
    public static void main(String[] args) throws IOException {
//        String fileName = "out.csv";
        System.out.println(readArrUserFromURL("https://data.gov.ua/dataset/770cc750-4333-424f-b6e9-6e6c5c76aec9/resource/59cb6066-1fac-41ed-a571-811db551c75b/download/zp-lupen-2019.csv", ";"));
//        System.out.println(readArrFromURL("https://data.gov.ua/dataset/770cc750-4333-424f-b6e9-6e6c5c76aec9/resource/59cb6066-1fac-41ed-a571-811db551c75b/download/zp-lupen-2019.csv", ";"));

//        int [] arr = {1,2,89,3,4,56};
//        writeArrToFile(arr, fileName, ";");
//        int [] arr1 = readArrFromFile(fileName, ";");
//        System.out.println(Arrays.toString(arr1));

//        String word = getWordFromConsole();
//        writeStrToFile(word, fileName);

//        System.out.println(readFromFile(fileName));
    }

    private static String getWordFromConsole() throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            System.out.println("Enter your text here:");
            return br.readLine();
        }
    }

    private static String readFromFile(String fileName) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName));) {
            return br.readLine();
            //System.out.println(str);
            //br.close();
        }
    }

    private static void writeStrToFile(String word, String fileName) throws IOException {
        FileWriter fw = new FileWriter(fileName);
        fw.write(word);
        fw.close();
    }

    private static void writeArrToFile(int[] arr, String fileName, String separator) throws IOException {
        FileWriter fw = new FileWriter(fileName);
        for (int i = 0; i < arr.length; i++) {
            fw.write(arr[i] + separator);
        }
        fw.close();
    }

    private static int[] readArrFromFile(String fileName, String separator) throws IOException {
        List<Integer> arrList = new ArrayList<Integer>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName));) {
            while (br.ready()) {
                String str = br.readLine();
                String[] words = str.split(separator);
                for (int i = 0; i < words.length; i++) {
                    arrList.add(Integer.parseInt(words[i]));
                }
            }
            return arrList.stream().mapToInt(Integer::intValue).toArray();
            //System.out.println(str);
            //br.close();
        }
    }

    private static List<String> readArrFromURL(String url, String separator) throws IOException {
        List<String> arrList = new ArrayList<>();
        URL website = new URL(url);
        URLConnection connection = website.openConnection();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "windows-1251"));) {
            while (br.ready()) {
                String str = br.readLine();
                String[] words = str.split(separator);
                for (int i = 0; i < words.length; i++) {
                    arrList.add(words[i]);
                }
            }
            return arrList;
        }
    }

    static class UserKMDA {
        private String name;
        private String posada;
        private double oklad;

        public UserKMDA(String name, String posada, double oklad) {
            this.name = name;
            this.posada = posada;
            this.oklad = oklad;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPosada() {
            return posada;
        }

        public void setPosada(String posada) {
            this.posada = posada;
        }

        public double getOklad() {
            return oklad;
        }

        public void setOklad(double oklad) {
            this.oklad = oklad;
        }

        @Override
        public String toString() {
            return "\nUserKMDA{" +
                    "name='" + name + '\'' +
                    ", posada='" + posada + '\'' +
                    ", oklad=" + oklad +
                    '}';
        }
    }

    private static List<UserKMDA> readArrUserFromURL(String url, String separator) throws IOException {
        List<UserKMDA> arrList = new ArrayList<>();
        URL website = new URL(url);
        URLConnection connection = website.openConnection();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "windows-1251"));) {
            br.readLine();
            while (br.ready()) {
                String str = br.readLine();
                String[] words = str.split(separator);
                double oklad = Double.parseDouble(words[2].replace(",", "."));
                UserKMDA user = new UserKMDA(words[0], words[1], oklad);
                arrList.add(user);
            }
            return arrList;
        }
    }
}
