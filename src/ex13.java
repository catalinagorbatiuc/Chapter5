//aplicație care calculează factorii de la 1 la 20

public class ex13 {

    public static void main(String[] args) {

        int counter;
        long factorials = 1;
        //        long total = 1;

        System.out.printf("%4s%30s\n", "Number", "Factorials");

        for (counter = 1; counter <= 20; factorials *= counter, counter++)
            System.out.printf("%4d%,30d\n", counter, factorials);

    }
}