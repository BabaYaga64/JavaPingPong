import java.io.Console;

public class PingPong {
    public static void main (String[] args) {
        Console console = System.console();

        //pingPongMethod
        pingPongMethod(yourNumber);

        //User prompt
        System.out.println(“Please pick a number”);

        //String parsing of input number
        String stringYourNumber = console.readLine();
        Integer yourNumber = Integer.parseInt(stringYourNumber);

        //Finding multiples and exceptions
        for (Integer index = 0; index <= yourNumber; index++) {
            if (index % 5 == 0 && index % 3 == 0 && index > 0) {
                System.out.println(“Ping-Pong”);
            } else if (index % 5 == 0) {
                System.out.println(“Pong”);
            } else if (index % 3 == 0) {
                System.out.println(“Ping”);
            } else System.out.println(index);
        }//End for loop

    //Calling method
    public static void pingPongMethod(String stringYourNumber);

    }//End main
}//End PingPong
