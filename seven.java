package Seven;

import java.util.Scanner;


class seven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");

        int i = sc.nextInt();

        if (i % 7 == 0) {
            System.out.println("The number can be divided by 7.");
        } else {
            System.out.println("The number cannot be divided by 7.");
        }

    }
}