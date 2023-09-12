package ex_no_assignments;


import java.util.ArrayList;
import java.util.List;

// part 05 ?

public class LotsOfAssignments {

    record Person(String name, int age, String residence) {
    }

    static List<String> peopleResidences(List<Person> persons) {

        List<Person> adults = new ArrayList<>();
        for (Person p : persons) {
            if (p.age >= 21) {
                adults.add(p);
            }
        }
        List<String> residences = new ArrayList<>();
        for (Person p : adults) {
            if (!residences.contains(p.residence)) {
                residences.add(p.residence);
            }
        }

        return residences;
    }
}
