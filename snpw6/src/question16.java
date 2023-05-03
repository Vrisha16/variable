/*16.Write a Java Program to print as below. (All details to be stored in variable)

        "+------------------------+"
        "| |"
        "| CORNER STORE |"
        "| |"
        "| 2015-03-29 04:38PM |"
        "| |"
        "| Gallons: 10.870 |"
        "| Price/gallon: $ 2.89 |"
        "| |"
        "| Fuel total: $ 22.71 |"
        "| |"
        "+------------------------+"*/
        public class question16 {
    public static void main(String[] args) {
        String storeName = "CORNER STORE";
        String date = "2015-03-29 04:38PM";
         double gallons = 10.870;
        double pricePerGallon = 2.89;
        double fuelTotal = gallons * pricePerGallon;

        // Print the receipt
        System.out.println("+------------------------+");
        System.out.println("|                        |");
        System.out.println("| " + storeName + " |");
        System.out.println("|                        |");
        System.out.println("| " + date + " |");
        System.out.println("|                        |");
        System.out.printf("| Gallons: %.3f         |\n", gallons);
        System.out.printf("| Price/gallon: $ %.2f   |\n", pricePerGallon);
        System.out.println("|                        |");
        System.out.printf("| Fuel total: $ %.2f     |\n", fuelTotal);
        System.out.println("|                        |");
        System.out.println("+------------------------+");
    }


}
