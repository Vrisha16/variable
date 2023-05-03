/*8. Write a program to insert any temperature value in degree Fahrenheit and convert to
        degree Celsius ((F − 32) × 5/9 = 0°C).
        */

        public class question8 {
        static double fahrenheit = 72.5;
            public static void far(){
                double celsius = (fahrenheit - 32) * 5 / 9;
                System.out.println(fahrenheit + "°F = " + celsius + "°C");
            }
            public static void main(String[] args) {
            far();
            }

}
