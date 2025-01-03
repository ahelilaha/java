import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> cities = new HashMap<String, String>();
        cities.put("Sammmamish", "Washington");
        cities.put("Redmond", "Washington");
        cities.put("Kolkata", "West bengal");

        System.out.println(cities);
        System.out.println("kolkata belongs to " + cities.get("Kolkata"));
        System.out.println(cities.keySet());
        System.out.println(cities.values());

    }
}