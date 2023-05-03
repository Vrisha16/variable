/*6. Write a java program which replace a “I@love@java” to “we love java”
 */
        package Stringexercise;
public class puzzle6 {
    static String replaceString(String input) {
        return input.replace("I@love@java", "we love java");
    }
    public static void main(String[] args) {
        String str = "I@love@java";
        String replaced = replaceString(str);
        System.out.println("Replaced string: " + replaced);
    }
}
