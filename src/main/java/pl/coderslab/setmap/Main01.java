package pl.coderslab.setmap;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main01 {

    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        Set<String> strings = new HashSet<>();


        String text = scanner.nextLine();

        while (!"exit".equals(text)){
            strings.add(text);
            count++;
            text= scanner.nextLine();
        }

        System.out.println("Podanych napisów: "+count+", Rozmiar kolekcji:"+strings.size());


    }
}
