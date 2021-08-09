import java.util.*;
import java.util.Scanner;

public class hello {
    public static void enterName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.next();
        System.out.println("Hello " + name);

    }
}
