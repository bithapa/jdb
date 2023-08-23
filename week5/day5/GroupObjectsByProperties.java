/*
* Problem 1 Solution
* */
package week5.jdb.takeo.day5;

import java.util.*;

public class GroupObjectsByProperties {
    public static void main(String[] args) {
        Person person1 = new Person("Max", 25);
        Person person2 = new Person("Alice", 34);
        Person person3 = new Person("John", 22);
        Person person4 = new Person("Emily", 22);
        Person person5 = new Person("Michael", 31);
        Person person6 = new Person("Sophia", 22);
        Person person7 = new Person("David", 31);
        Person person8 = new Person("Olivia", 24);
        Person person9 = new Person("Daniel", 24);
        Person person10 = new Person("Emma", 25);

        ArrayList<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        people.add(person6);
        people.add(person7);
        people.add(person8);
        people.add(person9);
        people.add(person10);

        Map<Integer, List<Person>> peopleGroupedByAge = new HashMap<>();

        for (Person thisPerson : people) {
            int thisPersonAge = thisPerson.getAge();
            if (!peopleGroupedByAge.containsKey(thisPersonAge)) {
                peopleGroupedByAge.put(thisPersonAge, new ArrayList<Person>(Arrays.asList(thisPerson)) );
            }
            else {
                List<Person> listFromMap = peopleGroupedByAge.get(thisPersonAge);
                listFromMap.add(thisPerson);
                peopleGroupedByAge.put(thisPersonAge, listFromMap);
            }
        }

        for (Map.Entry<Integer, List<Person>> entry: peopleGroupedByAge.entrySet()) {
            int age = entry.getKey();
            List<Person> peopleWithSameAge = entry.getValue();
            System.out.print("{ " + age + ", [");

            // Print names within the age group
            for (int i = 0; i < peopleWithSameAge.size(); i++) {
                System.out.print(peopleWithSameAge.get(i).getName());
                if (i < peopleWithSameAge.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("] }");
        }
    }


}
