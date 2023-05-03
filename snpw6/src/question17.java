/*17. Write a Java Program using below steps.
        17.1 Declare your city as instance variables.
        17.2 Declare your country as static variables.
        17.3 Declare one instance method and call static variable in print statement
        17.4 Declare static method and call instance variable in print Statement.
        17.5 Call both user defined methods into main method.

 */
public class question17 {

    String city = "Anand"; // instance variables.
    static String country = "India"; //static variable.

    public void Country() {//instance method
        System.out.println(country);
    }

    static public void City () { //static method
        question17 q17 = new question17();
        System.out.println(q17.city);
    }

    public static void main(String[] args) { //main method
        question17 q17 = new question17();
        q17.City();
        q17.Country();
    }
}
