package sample;


public class Controller {

    String comm = "Time to learn Java!";
//    This won't run from main. System.out.println(digi); this is an error: non-static variable digi cannot be referenced from a static context
        public static int digi = 50 * 3;


    public static void main(String [] args) {
        System.out.println("Hello World");

//      Modifier static is not allowed within main
//        Whenever I use char with an in 50, it prints 2, ASCII.
        char letter = 50;

//        int num cannot equal a string, the program won't compile at all
//      int num = "Hello World!";

//        if deci, with a primitive type of double, equals a charcter, the system prints out 65.0. I assume ASCII?
        double deci = 'A';


//        This is a class instance
        Controller pract = new Controller();

//        This method uses pract class, and accesses the comm instance. comm does not throw an error when called from a method, even though it does not have a public class
        System.out.println(pract.comm);
//        This throws an error: this is an error: non-static variable digi cannot be referenced from a static context. It must be a public and static class if it is not called from an instance?
        System.out.println(digi);
        System.out.println(letter);

//        Must use printf for ay formatting, otherwise error: no suitable method found for println.
//        System.out.println("Here is my character! %s", deci);




    }
}
