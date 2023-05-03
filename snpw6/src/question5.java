/* Write a program for a calculator with addition, subtraction, multiplication, and division
methods all with parameters and use string concatenation methods. (Note: Two static  and Two instance methods.)

 */


public class question5 {
    public static int add(int num1, int num2) { // Static method to add two numbers
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) { // Static method to subtract two numbers
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {  //// Instance method to multiply two numbers
        return num1 * num2;
    }

    public double divide(double num1, double num2) { //// Instance method to divide two numbers
        return num1 / num2;


    }
    public static void main(String[] args) {

        // Test the static methods
        System.out.println("Addition: " + question5.add(5, 10));
        System.out.println("Subtraction: " +question5 .subtract(15, 5));

        // Test the instance methods
        question5 q5 = new question5();// instance methods

        System.out.println("Multiplication: " + q5.multiply(6, 8));
        System.out.println("Division: " +q5.divide(20,2));
    }



}