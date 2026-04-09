
import java.util.*;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create HashMap for bogie-capacity mapping
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 56);
        bogieCapacity.put("First Class", 48);

        // Convert map entries to list
        List<Map.Entry<String, Integer>> list = new ArrayList<>(bogieCapacity.entrySet());

        // Sort using Comparator (descending order of capacity)
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                return b.getValue() - a.getValue();
            }
        });

        // Display sorted bogies
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " -> Capacity: " + entry.getValue());
        }
    }
}