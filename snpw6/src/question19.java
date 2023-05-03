/*19. Write a Java Program using below steps.
        19.1 Declare one of your group member names as instance variable.
        19.2 Declare one of your group member names as static variable.
        19.3 Declare one instance method name with group name (e.g. selenium())and call both global  variables.
        19.4 Declare static method name agile() and call both variable
        19.5 Call both user defined methods into main method
        */


public class question19 {
     String member1;

    public static String member2 = "vidhi"; //static variable

    public question19(String member1) {
        this.member1 = member1;
    }

    public void selenium() { //instance method with group name and call both global variables
        System.out.println("Group members: " + member1 + ", " + member2);
    }

    public static void agile(question19 group) { //static method name agile() and call both variables
        System.out.println("Group members: " + group.member1 + ", " + member2);
    }

    public static void main(String[] args) {
        question19 myGroup = new question19("hiral");//Call both user defined methods into main method
        myGroup.selenium();
        question19.agile(myGroup);
    }
}

