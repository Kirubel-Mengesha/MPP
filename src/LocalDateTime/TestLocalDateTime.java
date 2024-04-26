package LocalDateTime;

import java.time.LocalDateTime;

class TestLocalDateTime {

    public static void main( String[] args ) {

        LocalDateTime  current = LocalDateTime.now();

        LocalDateTime  past = LocalDateTime.of(2015, 01, 22, 8, 00, 00);


        System.out.println("current date and time is " + current);

        System.out.println("past date and time is " + past);


        current = current.plusDays(7);
        System.out.println("current plus 7 is " + current);



        past = past.withYear(1998);
        System.out.println("new past is " + past);

        // int i = current.compareTo(past);
        int i = past.compareTo(current);
        System.out.println("compareTo returns " + i);
    //1)  There are also methods to get  the date part (toLocalDate), and the time part (toLocalTime).
        // 2)  It stores a nanosecond part as well.
    }
}


