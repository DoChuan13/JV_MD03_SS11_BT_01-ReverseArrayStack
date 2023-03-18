import stack.NumberStack;
import stack.StringStack;

import java.util.Scanner;
import java.util.Stack;

public class main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        NumberStack.intReverseStack(scanner);
        System.out.println("----------------------");
        System.out.println("Press any key to continue... ");
        scanner.nextLine();
        System.out.println("----------------------");
        StringStack.stringReverse(scanner);
    }
}
