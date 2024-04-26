package TrialsStream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ProcessingEmployees
{
    public static void main(String[] args) {
        // initialize an array of Employees
        Employee[] employees = {
                new Employee("Jason", "Red", 5000, "IT"),
                new Employee("Ashley", "Green", 7600, "IT"),
                new Employee("Matthew", "Indigo", 3587.5, "Sales"),
                new Employee("James", "Indigo", 4700.77, "Marketing"),
                new Employee("Luke", "Indigo", 6200, "IT"),
                new Employee("Jason", "Blue", 3200, "Sales"),
                new Employee("Wendy", "Brown", 4236.4, "Marketing")};

        // get List view of the Employees
        List<Employee> list = Arrays.asList(employees);
        list.forEach(System.out::println);
        System.out.println("---------");
        Predicate<Employee> fts = e->(e.getSalary()>=4000 && e.getSalary()<=6000);
        list.stream().filter(fts).forEach(System.out::println);
        System.out.println("----------");

        list.stream().filter(fts)
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);

        System.out.println("---------");
        System.out.printf("first: %s", list.stream().filter(fts).findFirst().get());
        System.out.println();
        System.out.println("---------");
        Function<Employee, String> byFirstName = Employee::getFirstName;
        Function<Employee, String> byLastName = Employee::getLastName;
        Comparator<Employee> lastThenFirst =
                Comparator.comparing(byLastName).thenComparing(byFirstName);
       list.stream().sorted(lastThenFirst).forEach(System.out::println);
        System.out.println("--------");
        list.stream().sorted(lastThenFirst.reversed()).forEach(System.out::println);
        System.out.println("---------");
        list.stream().map(Employee::getLastName)
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println("-----------");
        list.stream().sorted(lastThenFirst)
                .map(Employee::getName)
                .forEach(System.out::println);
        System.out.println("--------------");
        System.out.printf("%nEmployees by department:%n");
      Map<String, List<Employee>> gpd = list.stream().collect(Collectors.groupingBy(Employee::getDepartment));

      gpd.forEach((a,b)->{
          System.out.println(a);
          b.forEach(c-> System.out.printf(" %s%n", c));
      });
        System.out.println("-----------");

        System.out.printf("%nCount of Employees by department:%n");

    Map<String , Long> count = list.stream().collect(Collectors.groupingBy(Employee::getDepartment
            , TreeMap::new, Collectors.counting()
            ));

      count.forEach((a,b)-> System.out.printf("%s has %d employee(s)%n", a,b));
        System.out.println("-----------------");
        System.out.printf(
                "%nSum of Employees' salaries (via sum method): %.2f%n",
                list.stream()
                        .mapToDouble(Employee::getSalary)
                        .sum());

        System.out.println("---------");
        System.out.printf("sum with reduce: %.2f%n", list.stream().mapToDouble(Employee::getSalary)
                .reduce(0,(x,y)->x+y));
        System.out.printf("Average: %.2f%n", list.stream().mapToDouble(Employee::getSalary)
                .average().getAsDouble());

        System.out.println("--------------");

        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());







    }
    }