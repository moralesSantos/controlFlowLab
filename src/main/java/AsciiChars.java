import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.*;

public class AsciiChars {
    public static void printNumbers(){
//        Scanner input = new Scanner(System.in);
        System.out.println("1 2 3 4 5 6 7 8 9 ");
    }
    public static void printLowerCase(){
        char letter;
        for (letter = 'a'; letter < 'z'; letter++){
            System.out.print(letter + " ");
        }
    }
    public static void printUpperCase(){
        char letter;
        System.out.println("");
        for (letter = 'A'; letter < 'Z'; letter++){
            System.out.print(letter + " ");
        }
        System.out.println("");
    }
}
