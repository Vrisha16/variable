/*3. Write a java program which replace a “I love java” to “we love java”

 */
     package Stringexercise;
     public class puzzle3 { public static void main(String[] args) {
                 String str = "I love java";
                 String replaced = replaceString(str);
                 System.out.println(replaced);
             }
             public static String replaceString(String str) {
                 String replace = str.replace("I love", "we love");
                 String replace1 = replace;
                 return replace1;
                 }
             }


