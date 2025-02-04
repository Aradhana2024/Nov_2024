package feb1;

import java.util.HashMap;
import java.util.Map;

public class Maptest {
    public static void main(String[] args) {

        System.out.println("List of all Provinces and Walamrt Store: ");
        Map<String,Integer> set = new HashMap<>();
        set.put("Ontario",25);
        set.put("New Brunswick",13);
        set.put("BC",18);
        set.put("Alberta",34);
        set.put("Quebec",12);
        set.put("Manitoba",12);

        for (Map.Entry<String, Integer> e : set.entrySet());

        System.out.println(" Printing key-value pairs" +set.keySet());
        System.out.println("Total Number of Walmart" +set.size());
        System.out.println("Avaerage of total number of walmart" +set.size()/6);
        System.out.println("Total Number of Walmart" +set.values());
        System.out.println();





    }
}
