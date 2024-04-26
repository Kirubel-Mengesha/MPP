package TrialsStream;

import java.util.*;
import java.util.stream.Stream;

public class Trial2 {
    public static void main(String[] args) {
        Integer [] vals = {2,9,5,0,3,7,1,4,8,6};
        System.out.printf("Originals: %s", Arrays.asList(vals));
        System.out.println();
        System.out.printf("ascending order: %s", Arrays.stream(vals).sorted().toList());
        System.out.println();
        //System.out.printf("values greater than 4 %s", Arrays.stream(vals).filter(a->a>4).sorted().toList());
        List<Integer> g4 = Arrays.stream(vals).filter(a->a>4).sorted().toList();
        g4.forEach(System.out::println);

        System.out.println("--------------------");
        String[] strings = {"Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet"};
        System.out.printf("Originals: %s", Arrays.asList(strings));
        System.out.println();
        System.out.printf("toUpperCase: %s", Arrays.stream(strings).map(String::toUpperCase).toList());
        System.out.println();
        System.out.println("strings greater than m");
        System.out.printf("gM: %s", Arrays.stream(strings).filter(a->a.compareToIgnoreCase("m")>0)
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .toList());
//        List<String> gm = Arrays.stream(strings).filter(a->a.compareToIgnoreCase("m")>0)
//                .sorted(String.CASE_INSENSITIVE_ORDER)
//                .toList();
//        gm.forEach(System.out::println);
        System.out.println();


        // Concatenate the streams
        Stream<Character> combined =
                Stream.concat(characterStream("Hello"),
                        characterStream("World"));

        combined.forEach(System.out::println);
    }
    public static Stream<Character>  characterStream(String s) {
        List<Character> result = new ArrayList<>();
        for (char c : s.toCharArray()) result.add(c);
        return result.stream();  //  returning a Stream here!
    }
}
