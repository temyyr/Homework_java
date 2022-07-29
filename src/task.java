import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        int[] y = new int[5];
        y [4] = 5;
        y [3] = 4;
        y [2] = 3;
        y [1] = 2;
        y [0] = 1;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Dear employee!\n" +
                "Enter your work experience to receive the award:");
        n = in.nextInt();
        y = new int [n];
        if (n <= 3) {
            System.out.println("You get a 10% salary increase");
            System.out.println("\n");
        }
        if (n > 3) {
            System.out.println("You get a 20% salary increase");
            System.out.println("\n");
        }
        Scanner s = new Scanner(System.in);
        int f; int j = 4000;
        System.out.println("Your salary with the increase will be:");
        f = s.nextInt();
        if (f > j)
            System.out.println("You receive a bonus of 500 uah");
        if (f < j)
            System.out.println("You receive a bonus of 1000 uah");
        for(int i=1;i<=50;i++){
            System.out.print(i+" ");
        }
    }
}
