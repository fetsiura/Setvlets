package pl.coderslab.setmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {
        Map<String, String> map = getMap();

        Scanner scanner = new Scanner(System.in);
        int correct =0;

        for(Map.Entry<String,String> entry : map.entrySet()){

            System.out.println("Wpisz przeciwieństwo do "+ entry.getKey());
            String answer = scanner.nextLine();

            if(answer.equals(entry.getValue())){
                correct++;
            }

        }

        System.out.println("Poprawnych odpowiedzi "+correct);

    }



    public static Map<String, String> getMap(){
        Map<String, String> questions = new HashMap<>();
        questions.put("ciepło", "zimno");
        questions.put("lewo", "prawo");
        questions.put("jasno", "ciemno");
        questions.put("góra", "dół");
        questions.put("białe", "czarne");
        return questions;
    }
}
