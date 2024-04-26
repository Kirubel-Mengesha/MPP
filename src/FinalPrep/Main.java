package FinalPrep;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Country> arr1 = new ArrayList<>();

        arr1.add(new Country("Ethiopia","Africa",130000,12340.34));
        arr1.add(new Country("Spain","Europe",11000,10000.12));
        arr1.add(new Country("Jordan","Asia",111000,11000.12));
        arr1.add(new Country("China","Asia",12110000,11000.12));
        arr1.add(new Country("Jamaica","South America",1900,1000));
        arr1.add(new Country("Usa","North America",111000,111000.12));
        arr1.add(new Country("Colombia","South America",12000,1050.12));
        arr1.add(new Country("Canada","North America",13000,1200.12));
        arr1.add(new Country("Morocco","North Africa",13000,1200.12));
        arr1.add(new Country("Mozambique","south Africa",13000,1200.12));

        System.out.println("All");
        System.out.println("-".repeat(50));
        arr1.forEach(System.out::println);

        //Print out the names of countries that begin with the letter 'C', in sorted order,
        // and get rid of all the duplicates.
        // Print out only the names. For example, the output could be Canada Costa Rica
        System.out.println();
        System.out.println("-".repeat(50));

        System.out.printf("unique sorted country names begin with 'C'  :%s", arr1.stream()
                .map(Country::getName)
                .filter(a->a.startsWith("C"))
                .distinct()
                .sorted()
                .toList()
        );

        System.out.println();
        System.out.println("-".repeat(50));

        //Print out the sum of all the populations.

        System.out.printf("Sum of population:  %d", arr1.stream()
                .map(Country::getPopulation)
                .reduce(0, Integer::sum)  //Integer::sum
        );
        System.out.println();
        System.out.println("-".repeat(50));

        //Create a list of all the Country objects that are in the Asia continent,
        // and whose population is greater than 12,000,000
        System.out.println("List of countries in asia whose population greater than 12 million");
        List<Country> allAsia = arr1.stream().filter(a->a.getContinent().equals("Asia"))
                .filter(a->a.getPopulation()>12000000)
                .toList();
        allAsia.forEach(System.out::println);

        System.out.println("-".repeat(50));

        //Use the 'reduce' method to get the total(sum) of All area_In_Square_Mile data.

        System.out.printf("total sum using reduce:  %.2f", arr1.stream()
                .mapToDouble(Country::getArea_In_Square_Miles)
                .reduce(0, Double::sum));
        System.out.println();
        System.out.println("-".repeat(50));

        //Print out all the Country objects, but if the continent begins with the letter 'E',
        // then capitalize all the continent letters.
        // The whole Country object does get printed out.

        List<Country> beginE = arr1.stream().filter(a-> {
            if (a.getContinent().startsWith("E"))
                a.setContinent(a.getContinent().toUpperCase());
            return  true;
        }).toList();
        beginE.forEach(System.out::println);
        System.out.println("-".repeat(50));

        //Print out All of the Country objects with the following restriction.
        // Sort (by name) only the objects whose country name begins with the letter 'M' (All other Country objects are Not sorted),
        // and Print out those sorted objects at the very beginning, BEFORE all of the Unsorted objects have been printed out
        List<Country> startsWithM = arr1.stream()
                .filter(a -> a.getName().startsWith("M"))
                .sorted(Comparator.comparing(Country::getName))
                .toList();

        List<Country> doesNotStartWithM = arr1.stream()
                .filter(a -> !a.getName().startsWith("M"))
                .toList();
        System.out.println("Sorted");
        startsWithM.forEach(System.out::println);
        System.out.println();
        System.out.println("unsorted");
        doesNotStartWithM.forEach(System.out::println);




























    }
}


