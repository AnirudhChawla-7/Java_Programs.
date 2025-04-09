package LabExperiment_9;
import java.util.HashSet;

public class UniqueNames {
    public static void main(String[] args) {
        String[] names = {"Aman", "Varchasv", "Sourabh", "Varchasv", "Aman"};
        HashSet<String> uniqueNames = new HashSet<>();

        for (String name : names) {
            uniqueNames.add(name);
        }

        String specificName = "Aman";
        if (uniqueNames.contains(specificName)) {
            System.out.println(specificName + " exists in the set.");
        }

        System.out.println("Unique names: " + uniqueNames);
    }
}
