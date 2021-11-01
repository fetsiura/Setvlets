package pl.coderslab.collections;

import java.util.ArrayList;
import java.util.List;

public class Main02 {

    public static void main(String[] args) {
        List<Integer> elements = new ArrayList<>();

        for(int i =10; i<20;i++){
            elements.add(i);
        }

        removeDivider(elements,2);

        for(Integer i : elements){
            System.out.println(i);
        }


    }

    public static void removeDivider (List<Integer> list, int divider){
        for(int i =0; i<list.size(); i++) {
            if(list.get(i) % divider ==0){
                list.remove(i);
            }
        }
    }
}
