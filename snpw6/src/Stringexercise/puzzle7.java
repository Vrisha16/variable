/*7. Write a java program which replace string to upper case.
*/
package Stringexercise;
        public class puzzle7 {
            String str;
            public void setString(String s) { //instance method
                this.str = s;
            }
            public String toUpperCase() { // String to uppercase
                return str.toUpperCase();
            }
            public static void main(String[] args) { // main method.
                puzzle7 obj = new puzzle7();
                obj.setString("I love Java");

                System.out.println("Original String: " + obj.str);
                System.out.println("Uppercase String: " + obj.toUpperCase());
            }
        }








