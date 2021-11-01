package pl.coderslab.setmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main03 {

    public static void main(String[] args) {
        List<Country> initialize = initialize();


        Map<String,Country> countryMap = new HashMap<>();

        for(Country country : initialize){
            countryMap.put(country.getCapital(),country);
        }

        for (Map.Entry<String,Country> entry: countryMap.entrySet()){
            System.out.println(entry.getKey()+" - "+ entry.getValue().getName());
        }

    }


    public static List<Country> initialize () {

        return Arrays.asList(
                new Country("Polska", "Warszawa"),
                new Country("Niemcy", "Berlin"),
                new Country("Ukraina", "Kijów"),
                new Country("USA", "Waszyngton"),
                new Country("Chiny", "Pekin"));
    }
}
