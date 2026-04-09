import java.util.*;
import java.util.stream.*;

class Bogie {
    String name;
    String type;

    Bogie(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String toString() {
        return name;
    }
}

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper1", "Sleeper"));
        bogies.add(new Bogie("Sleeper2", "Sleeper"));
        bogies.add(new Bogie("AC1", "AC Chair"));
        bogies.add(new Bogie("FC1", "First Class"));

        // Group bogies by type
        Map<String, List<Bogie>> grouped =
                bogies.stream()
                        .collect(Collectors.groupingBy(Bogie::getType));

        // Display grouped result
        for (Map.Entry<String, List<Bogie>> entry : grouped.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}