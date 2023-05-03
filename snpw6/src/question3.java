/*   3. Write a Java programme using the following steps.
        3.1 Declare one instance and one static variable.
        3.2 Declare one instance method.
        3.3 Declare one static method.
        3.4 Call both instance and static variables into both instance and static methods inside the  print statement.
        3.5 Declare the Main method.
        3.6 Call both instance and static methods into the Main method and run the programme.
        */

public class question3 {
        String town = "leicester"; //instance variable
        static int barcode = 12345; //static variable

        public void town(){//instance method
                System.out.println(town);
                System.out.println(barcode);
        }

        public static void BC() {//static method
                question3 q3 = new question3();
                System.out.println(q3.town);
                System.out.println(barcode);
        }

        public static void main(String[]args) { //main method
                question3 q3 = new question3();
                q3.town();
                q3.BC();
        }
}


