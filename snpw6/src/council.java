/*18. Write a Java Program using below steps.
        18.1 Declare your council name as static variables.
        18.2 Declare your house number as instance variables.
        18.3 Declare one instance method name borough() and call Static variable
        18.4 Declare static method name address() and call instance variable
        18.5 Call both user defined methods into main method.

 */


public class council {
    public static String councilName = "charnwood Council";// static variable
     int houseNumber; //instant variable
    public council (int houseNumber) {
        this.houseNumber = houseNumber;
    }
    public void borough() {
        System.out.println("Borough: " + councilName);// instant method
    }
    public static void address(council home) {
        System.out.println("Address: " + home.houseNumber + ", " + councilName);
    }
    public static void main(String[] args) {
        // Step 18.5: Call both methods into main method
        council council = new council(123);
       council.borough();
       council.address(council);
    }





        }




