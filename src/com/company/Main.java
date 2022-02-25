package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите номер месяца");
//        int month = sc.nextInt();
//        int numDays = 0;
//        System.out.println("Введите год");
//        int year = sc.nextInt();
//        switch (month) {
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//                numDays = 31;
//                break;
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                numDays = 30;
//                break;
//            case 2:
//                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) numDays = 29;
//                else numDays = 28;
//                break;
//            default:
//                System.out.println("Invalid month");
//                break;
//        }
//        System.out.println("Number of Days = " + numDays);
//
//
//        int rank = (int) ((Math.random() * (14 - 1)) + 1);
//        int suit = (int) (Math.random() * 4);
//        switch (rank) {
//            case 1:
//                System.out.println("Ace");
//                break;
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//            case 6:
//            case 7:
//            case 8:
//            case 9:
//            case 10:
//                System.out.println(rank);
//                break;
//            case 11:
//                System.out.println("Jack");
//                break;
//            case 12:
//                System.out.println("Queen");
//                break;
//            case 13:
//                System.out.println("King");
//                break;
//            default:
//                System.out.println("Invalid number!");
//        }
//        System.out.println(' ');
//        switch (suit) {
//            case 0:
//                System.out.println("Clubs");
//                break;
//            case 1:
//                System.out.println("Diamonds");
//                break;
//            case 2:
//                System.out.println("Hearts");
//                break;
//            case 3:
//                System.out.println("Spades");
//        }
//
//        // miles to kilometers
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i * 1.609);
//        }
//
//
//        // table of multiply on 5
//        for (int i = 0; i <= 5; i++) {
//            System.out.println("5 x " + i + " = " + i * 5);
//        }
//
//        // average of 5 numbers
//        int acc = 0;
//        for (int i = 0; i < 5; i++) {
//            System.out.println("введите число");
//            acc += sc.nextInt();
//        }
//        System.out.println(acc / 5);

        System.out.println("Enter n");
        int n = sc.nextInt();
        double ans = 0;
        for (double i = 1; i <= n; i++) {
            ans += 1.0 / i;
        }
        System.out.println(ans);


        int cube = (int) Math.pow(n, 3);
        System.out.println(cube);
    }
}
