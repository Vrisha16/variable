/*20. Write a Java Program using below steps.
        20.1 Declare your Spain as static variable.
        20.2 Declare your United Kingdom as instance variable.
        20.3 Declare instance method name homeCountry()and call static variable.
        20.4 Declare static method name holidays() and call instance variable
        20.5 Call both methods in main method.
         */
public class question20 {

    public static String Spain = "Spain"; // static variable

    private String UnitedKingdom;// instance variable

    public question20 (String UnitedKingdom) {
        this.UnitedKingdom = UnitedKingdom;
    }

    public void homeCountry() {
        System.out.println("Home country: " + Spain); //declare instant method
    }

    public static void holidays(question20 travel) {
        System.out.println("Holidays in: " + travel.UnitedKingdom); //declare static method
    }

    public static void main(String[] args) {
        //  both methods into main method
        question20 myTravel = new question20("United Kingdom");
        myTravel.homeCountry();
        question20.holidays(myTravel);
    }
}

