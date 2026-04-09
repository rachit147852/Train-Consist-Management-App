import java.util.*;

class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
}

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create list of goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Box", "Coal"));
        bogies.add(new GoodsBogie("Open", "Grain"));

        // Safety check using stream
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum")
                );

        // Display result
        if (isSafe) {
            System.out.println("Train is SAFE for operation.");
        } else {
            System.out.println("Train is NOT SAFE.");
        }
    }
}