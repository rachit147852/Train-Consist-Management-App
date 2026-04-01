import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================");
        System.out.println("==== bogie Consist Management App====");
        System.out.println("==================");

        Set<String> bogie = new HashSet<>();
        bogie.add("BG101");
        bogie.add("BG102");
        bogie.add("BG103");
        bogie.add("BG104");
        bogie.add("BG101");
        bogie.add("BG102");
        System.out.println("AFTER ADDING BOGIES:");
//        System.out.println("PASSENGER BOGIES:"+bogie);
//        System.out.println("AFTER REMOVING AC CHAIR:");
//        bogie.remove(bogie.indexOf("AC CHAIR"));
//        System.out.println("PASSENGER BOGIES:"+bogie);
//        System.out.println("CHECKING IF SLEEPER EXISTS:");
        System.out.println("BOGIES:"+bogie);
        System.out.println("NOTE:\n DUPLICATES ARE AUTOMATICALLY IGNORED \n UC2 operations completed successfully...");
}
}
