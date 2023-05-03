
/* 1. Write a Java programme using the following steps.
        1.1 Declare two instance variables.
        1.2 Declare one instance method.
        1.3 Call both instance variables into the instance method inside the print statement.
        1.4 Declare the Main method.
        1.5 Call the above instance method into the Main method and run the programme.
        */



public class question1 {

    //Instance variables
    int a = 10;
    int b = 20;

    //instance method
    public void number() {
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) // main method
    {
        question1 q1 = new question1();

        q1.number();
    }
}






