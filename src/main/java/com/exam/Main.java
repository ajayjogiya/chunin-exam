package com.exam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rules r = new Rules();
        final Questions q = new Questions();

        r.HeadingShow();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Press enter to continue...");
        scanner.nextLine();

        char a;
        for (int i = 1; i < 6; i++) {
            if (i == 5) {
                r.FinalRuleShow();
                System.out.print("you want to take the risk? (y/n): ");
                a = scanner.next().charAt(0);

                if (a == 'y') {
                    System.out.println("Congratulations! You passed the exam.\n Your score is " + q.GetScore());
                    break;
                } else {
                    System.out.println("You failed. " + q.GetScore());
                }

            }
            q.ShowQuestion(i);
            System.out.print("enter the option number: ");
            a = scanner.next().charAt(0);
            q.CalculateStore(i, a);

        }

        scanner.close();
    }

}
