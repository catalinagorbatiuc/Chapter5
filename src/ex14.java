public class ex14 {
    public static void main(String[] args) {
        double amount; // suma depozitată la sfârșitul fiecărui an
        double principal = 2000.0; // suma inițială înainte de dobândă
        double rate = 0.5; // rata dobânzii
        // display headers
        System.out.printf("%s %n", "Year", "Amount on deposit");
        for (int i = 0; i <= 5; i++) {
            for (int year = 1; year <= 15; ++year) {
                // calculați o nouă sumă pentru anul specificat
                amount = principal * Math.pow(1.0 + rate, year);

                // afișați anul și suma
                System.out.printf("%4d%,20.2f%n", year, amount);
            }
            rate = rate + 0.01;
            System.out.println("now rate is=" + rate);
        }
    }
}