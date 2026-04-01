import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================");
        System.out.println("==== Train Consist Management App====");
        System.out.println("==================");

        List<String> train = new ArrayList<>();
        train.add("SLEEPER");
        train.add("AC CHAIR");
        train.add("FIRST CLASS");
        System.out.println("AFTER ADDING BOGIES:");
        System.out.println("PASSENGER BOGIES:"+train);
        System.out.println("AFTER REMOVING AC CHAIR:");
        train.remove(train.indexOf("AC CHAIR"));
        System.out.println("PASSENGER BOGIES:"+train);
        System.out.println("CHECKING IF SLEEPER EXISTS:");
        System.out.println("CONTAINS SLEEPER? :" + (train.contains("SLEEPER")));
        System.out.println("UC2 operations completed successfully...");
    }
}
