import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner age = new Scanner(System.in);
        int first; int second = 0; int three = 18;
        System.out.println("Enter your age: ");
        first = age.nextInt();
        if (first <= second)
            System.out.println("Error");
        if (first < three)
            System.out.println("You are not yet of legal age");
        if (first >= three)
            System.out.println("You have become an adult");
    }
}