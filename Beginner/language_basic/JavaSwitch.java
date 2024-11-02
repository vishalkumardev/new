package language_basic;

import java.util.Scanner;

public class JavaSwitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int days = sc.nextInt();

        switch (days) {
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thrusday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
                break;
            case 7:
                System.out.print("Sunday");
                break;
            default:
                System.out.print("Invalid");
                break;
        }
    }

}