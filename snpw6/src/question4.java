/*4. Write a Java programme using the following steps.
        4.1 Declare two instance and two static variables.
        4.2 Declare one instance method.
        4.3 Declare one static method.
        4.4 Call all four instance and static variables into both instance and static methods inside the  print statement.
        4.5 Declare the Main method.
        4.6 Call both instance and static methods into the Main method and run the programme.

 */

public class question4 {
   //  two instance variables
    int instanceVar1= 5;
    String instanceVar2 = "Hi";

   //  two static variables
    static double staticVar1 = 10;
   static boolean staticVar2 = true;


   public void instanceMethod() { //one instance method
      // Access instance variables inside the method
      System.out.println("Instance method called");
      System.out.println("Instance variable 1: " + instanceVar1);
      System.out.println("Instance variable 2: " + instanceVar2);
   }
   public static void staticMethod() { //one static method
      // Access static variables inside the method
      System.out.println("Static method called");
      System.out.println("Static variable 1: " + staticVar1);
      System.out.println("Static variable 2: " + staticVar2);
   }
   public static void main(String[] args) { // main method
      //  object of the class to call instance method
     question4 obj = new question4();
     obj.instanceMethod();
     staticMethod();//static method

   }


   }








