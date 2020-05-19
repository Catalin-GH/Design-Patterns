
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        final int a = 10;
        final int b = 20;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Select a sign (+, -, *) = ");
        String operation = keyboard.nextLine();

        // set the context for the client
        Context context = new Context();

        //choose at runtime what type of operation the client needs
        switch (operation) {
            case "+":
                context.setOperation(new Add());
                break;
            case "-":
                context.setOperation(new Substract());
                break;
            case "*":
                context.setOperation(new Multiply());
                break;
        }

        // get the operation result
        final int result = context.operation(a, b);
        System.out.println("a=" + a + " b=" + b + " Result=" + result);
    }
}
