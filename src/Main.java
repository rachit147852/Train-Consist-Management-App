import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================");
        System.out.println("==== train Consist Management App====");
        System.out.println("==================");

        Set<String> train = new LinkedHashSet<>();
        train.add("Engine");
        train.add("Sleeper");
        //train.add("AC");
        train.add("CARGO");
        train.add("GUARD");
        train.add("CARGO");
        System.out.println("AFTER ADDING trainS:");
        System.out.println("PASSENGER trainS:"+train);
//        train.add(2,"PANTRY CAR");
//        System.out.println("AFTER ADDING PATRY CAR");
//        System.out.println("PASSENGER trainS:"+train);
//        train.removeFirst();
//        train.removeLast();
//        System.out.println("AFTER REMOVING FIRST AND LAST");
//        System.out.println("PASSENGER trainS:"+train);

//
//        System.out.println("AFTER REMOVING AC CHAIR:");
//        train.remove(train.indexOf("AC CHAIR"));
//        System.out.println("PASSENGER trainS:"+train);
//        System.out.println("CHECKING IF SLEEPER EXISTS:");
//        System.out.println("trainS:"+train);
        System.out.println(" UC5 operations completed successfully...");
}
}
