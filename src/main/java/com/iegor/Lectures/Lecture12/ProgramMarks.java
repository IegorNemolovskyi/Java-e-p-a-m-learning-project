package com.iegor.Lectures.Lecture12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class NotMarkException extends Exception{
    public NotMarkException(String message) {
        super(message);
    }
}

public class ProgramMarks {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Enter int");
            String strFromConsole = br.readLine();
            try {

                int x = Integer.parseInt(strFromConsole);
                System.out.println(x);
                if (x<3 || x>12){
                    throw new NotMarkException(" x is not mark");
                }
                System.out.println(" x mark = " + x);
                break;
            }
            catch (NotMarkException e){
                System.err.println(e.getMessage());
            }
            catch (NumberFormatException e){
                System.err.println("Error not int");
            }
        }
    }
}
