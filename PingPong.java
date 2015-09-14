import java.io.Console;

public class PingPong {
    public static void main (String[] args) {
        Console console = System.console();

        System.out.println(“Please pick a number”);
        String stringInputNumber = console.readLine();
        Integer inputNumber = Integer.parseInt(stringInputNumber);

        for (Integer index = 0; index <= inputNumber; index++) {
            if (index % 5 == 0 && index % 3 == 0 && index > 0) {
                System.out.println(“Ping-Pong”);
            } else if (index % 5 == 0) {
                System.out.println(“Pong”);
            } else if (index % 3 == 0) {
                System.out.println(“Ping”);
            } else System.out.println(index);
        }//End for loop
    }//End main
}//End PingPong
