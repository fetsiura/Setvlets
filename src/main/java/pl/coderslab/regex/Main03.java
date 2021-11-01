package pl.coderslab.regex;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main03 {

    public static void main(String[] args) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("operations.txt"))) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("write anything");
            String rex = "(\\d+[/*+\\-%]?)+\\d+=\\d+";
            while (scanner.hasNextLine()) {
                String input = scanner.nextLine();
                if ("quit".equals(input)) {
                    break;
                }
                input = input.replaceAll("\\s", "");
                if (Pattern.matches(rex, input)){
                    bufferedWriter.write(input + "\n");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
