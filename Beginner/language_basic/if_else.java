package language_basic;

import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if (age >= 18)
            System.out.print("Adult");
        else
            System.out.print("Teen");
    }
}
