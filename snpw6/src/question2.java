 /* 2. Write a Java programme using the following steps.
          2.1 Declare two static variables.
          2.2 Declare one static method.
          2.3 Call both static variables into the static method inside the print statement.
          2.4 Declare the Main method.
          2.5 Call the static method into the Main method and run the programme.
*/

public class question2 {
    static int mobile = 24147;  // static variable.
    static int postcode =12345; // static variable

    static public void number(){ //static method
        System.out.println(mobile);
        System.out.println(postcode);
    }

    public static void main(String args[]) // main method
    {
        question2 q2 = new question2();

        q2.number();
    }
}

