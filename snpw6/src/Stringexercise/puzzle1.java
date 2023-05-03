/*1. Write a Java program print your full name on screen and then print your
        surname on a separate line.

 */
        package Stringexercise;

import com.sun.org.apache.xpath.internal.objects.XString;

public class puzzle1{
             String firstname = "msm"; //instance variable.
             static String surname = "pat"; //statics variable.

            public void printfullname(){ // fullname in instance method
                System.out.println(firstname+" "+surname);
            }
            public static void printsurname(){ // static method
                System.out.println(surname);

            }
            public static void main(String[] args) { //object of nameprinter class
                puzzle1 printer= new puzzle1();
                 printer.printfullname(); // instance method to print full name
                printsurname();
                }

            }




