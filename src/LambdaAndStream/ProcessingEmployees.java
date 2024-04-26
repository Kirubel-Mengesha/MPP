package LambdaAndStream;
// Program 4: ProcessingEmployees.java
// Processing streams of Employee objects.
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProcessingEmployees
{
    public static void main(String[] args)
    {
        // initialize array of Employees
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

        // display all Employees
        System.out.println("Complete Employee list:");
        list.stream().forEach(System.out::println);   //A method reference.
        System.out.println("-".repeat(50));

        //Count the number of last names that begin with the letter ‘B’
        // Print out this number.

        System.out.printf("Number of last Names that begins with 'B': %d", list.stream().
                filter(a->a.getLastName().startsWith("B"))
                .count()
        );
//        long count = list.stream().filter(a->a.getLastName().startsWith("B"))
//                .count();
//        System.out.println(count);
        System.out.println();
        System.out.println("-".repeat(50));

        //Print out all the Employee objects whose last name begins with
        // the letter ‘B’ in sorted order.
        System.out.println("All employee object whose last name begins with B:");
//        List<Employee> beginB = list.stream().filter(a-> a.getLastName().startsWith("B"))
//                .sorted(Comparator.comparing(Employee::getLastName))
//                .toList();
//
//        beginB.forEach(System.out::println);
        list.stream().filter(a->a.getLastName().startsWith("B"))
                        .sorted(Comparator.comparing(Employee::getLastName))
                        .forEach(System.out::println);

        System.out.println("-".repeat(50));

        //Print out all the Employee objects whose last name begins with the letter ‘B’
        // and change their first name and last name to be All capital letters.
        //do this in two different ways
        System.out.println("------Approach one without modifying original list-------");
        System.out.println("Employee objects whose last name begins with the letter ‘B’ and changed to uppercase");
        List<Employee> bothCap = list.stream().filter(a-> a.getLastName().startsWith("B"))
                        .map(a-> new Employee(a.getFirstName().toUpperCase(),a.getLastName().toUpperCase(),a.getSalary(),a.getDepartment()))
                        .toList();


        bothCap.forEach(System.out::println);
        System.out.println("Original----------------------");
         list.stream().forEach(System.out::println);
        System.out.println("-------not changed--------");

//        System.out.println("Approach 2 by modifying ");
//        list.stream().filter(a->a.getLastName().startsWith("B"))
//                        .forEach(a-> {
//                            a.setFirstName(a.getFirstName().toUpperCase());
//                            a.setLastName(a.getLastName().toUpperCase());
//                        });
//        list.forEach(System.out::println);




        System.out.println("-".repeat(50));


    //Print out All the employee objects, but if the last name begins with the letter  ‘B’,
        // then capitalize all the letters in the last name.
        System.out.println("All employee objects and capitalized last names that begin with 'B':");
       List<Employee> lastCap = list.stream().filter(a->a.getLastName().startsWith("B"))
                       .map(a->{
                           new Employee(a.getFirstName(),a.getLastName().toUpperCase(),a.getSalary(),a.getDepartment());
                           return a;
                       }).toList();


        lastCap.forEach(System.out::println);

        System.out.println("-".repeat(50));

        //Use the Collectors.joining method to print out All Employee objects.
        System.out.println("using collectors.joining without delimiter");
        String all = list.stream().map(Employee::toString).collect(Collectors.joining());
        System.out.println(all);
        System.out.println("-".repeat(50));

        //Use the  Collectors.joining  method to print out All Employee objects,
        // and separate    each one with a delimeter of  “---\n---“.
        System.out.println("specifying delimiter");
        String joined = list.stream().map(Employee::toString).collect(Collectors.joining("---\n---"));
        System.out.println("\n\n" + joined);
        System.out.println("-".repeat(50));


        //Print out all the Employee objects’ last names, whose last name begins with the letter  ‘I’  in sorted order,
        // and get rid of all the duplicates.  Print out only the last names.
        System.out.println("Unique last names start with 'I':");
        List<String> lastI = list.stream()
                .map(Employee::getLastName)
                .filter(a -> a.startsWith("I"))
                .distinct()
                .sorted()
                .toList();
        lastI.forEach(System.out::println);



        System.out.println("-".repeat(50));

        //Print out the average of all the salaries.

        System.out.printf("Average salary:  $%.2f" , list.stream().mapToDouble(Employee::getSalary)
                .average().orElse(0.0));

        System.out.println();
        System.out.println("-".repeat(50));

        //Use the  ‘reduce’  method to print out the total salary of all employees.

        System.out.printf("Total Salary:  $%.2f", list.stream().mapToDouble(Employee::getSalary)
                        .reduce(0, (x,y)->x+y));  //Double::sum

        System.out.println();
        System.out.println("-".repeat(50));

        //Print out only the first names of all the employees.  Use the  ‘map’  method to accomplish this.
        System.out.println("First name of all employees: ");
        List<String> onlyFirsNames = list.stream().map(Employee::getFirstName)
                                    .toList();
        onlyFirsNames.forEach(System.out::println);

        System.out.println("-".repeat(50));

        //Create an infinite stream of even numbers (0, 2, 4, …) and then, eventually
        // print out only the first 20 even numbers from this stream.
        System.out.println("The first 20 even numbers infinite streams: ");
        Stream<Integer> evens = Stream.iterate(0,n->n+2).limit(20);
        evens.forEach(System.out::println);
        //evens.limit(20).forEach(System.out::println);
        System.out.println();
        System.out.println("-".repeat(50));

        System.out.println("Number of  words with length 3, containing 'c', and not containing 'd'");
        List<String> wordList = List.of("apple", "banana", "cat", "dog", "elephant","cap");
        int count = ProcessingEmployees.countWords(wordList,'c','d',3);
        System.out.println(count);
        System.out.println("-".repeat(50));

        System.out.println("Using reduce to concatenate the Strings in the Stream below to form a single, space-separated String and Printing the result to the console....");
        Stream<String> strings = Stream.of("A", "good", "day", "to", "write", "some", "Java");
        String concatenatedString = strings.reduce("", (x,y)->x+" "+y);
        System.out.println(concatenatedString);
        System.out.println("-".repeat(50));


        // Test findFirst
        Optional<Employee> firstEmployee = list.stream().findFirst();
        System.out.println("First Employee: " + firstEmployee.orElse(null));

        // Test findAny
        Optional<Employee> anyEmployee = list.stream().findAny();
        System.out.println("Any Employee: " + anyEmployee.orElse(null));

        System.out.println("---------------------------------------------");



        // To test Collectors.joining
        // Convert elements to strings and concatenate them, separated by commas
//        String joined = list.stream()
//                .map(Object::toString)  //  this DOES go to the overridden method  toString  inside Employee!!  Yes!!

                //  joining method needs Strings coming in.

                //.map(Employee::toString)  //  this also DOES work!!  Yes!!
//                .collect(Collectors.joining(", "));

//        System.out.println("\n\n" + joined);


    //group Employees by department
        System.out.printf("%nEmployees by department:%n");
        Map<String, List<Employee>> groupedByDepartment = list.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        groupedByDepartment.forEach(
                (department, employeesInDepartment) ->
                {
                    System.out.println(department);
                    employeesInDepartment.forEach(
                            employee -> System.out.printf("   %s%n", employee));
                }
        );

        System.out.println("--------------------------");
        //)  Print out each department and the average salary for the department.
        Map<String, Double> AverageSalary = list.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));

        AverageSalary.forEach((a, b) ->
                System.out.printf("Department: %s, Average Salary:$ %.2f%n" , a, b));
        System.out.println("--------------------------");
        //Print out each department and the maximum salary for the department.
        Map<String, Optional<Employee>> maxSalary = list.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment
                        ,Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));

        maxSalary.forEach((a,b)-> {
            if (b.isPresent()){
                double max = b.get().getSalary();
                System.out.printf("Department: %s, Maximum Salary: %.2f%n", a, max);
            }
        });

        System.out.println("--------------------------");

        //Print out each department and all of the employees who work at that department.
        Map<String, List<Employee>> departmentEmployeesMap = list.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        departmentEmployeesMap.forEach((a, b) -> {
            System.out.println("Department: " + a);
            b.forEach(c -> System.out.println(c.getName()));
            System.out.println();
        });






    }

    //Implement  a method with the following signature and return type:
          public static int countWords(List<String> words, char c, char d, int len){
                return (int)words.stream().filter(a->a.length()==len)
                        .filter(a->a.contains(String.valueOf(c)))
                        .filter(a->!a.contains(String.valueOf(d)))
                        .count();
          }
} // end class ProcessingEmployees

