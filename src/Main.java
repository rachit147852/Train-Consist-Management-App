import java.util.*;
import java.util.stream.*;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Bogie-capacity mapping
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 56);
        bogieCapacity.put("First Class", 48);

        // Filter bogies with capacity >= 60 using Streams
        bogieCapacity.entrySet()
                .stream()
                .filter(entry -> entry.getValue() >= 60)
                .forEach(entry ->
                        System.out.println(entry.getKey() + " -> Capacity: " + entry.getValue())
                );
    }
}