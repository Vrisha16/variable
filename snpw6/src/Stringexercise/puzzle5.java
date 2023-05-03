/*5.Write a java program to concat 2 string.

 */
package Stringexercise;
public class puzzle5 {
    public static String concatenateStrings(String a, String b) {
        return a + " " + b;
    }



    public static void main(String[]args){
        String a="i love java";
        String b="i dream java";
        String c= concatenateStrings(a, b);
        System.out.println(c);
    }

}
