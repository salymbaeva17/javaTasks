package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int max = 0;
//        int b = 0;
//        String amoount = "";
//        for (int i = 0;i<10;i++){
//            int a = sc.nextInt();
//            amoount+=a;
//            if(max<=a){
//                max=a;
//                System.out.println(max);
//            }
//        }
//        for (int j = 0;j<10;j++) {
//            if (amoount.contains(String.valueOf(max))) {
//                b++;
//            }
//        }
//        System.out.println(b);
//        System.out.println(max);
//        int a, b;
//
//        b = 2;
//
//        a = ++b;
//        System.out.println(a);
//
//        int count = 5;
//        while (count > -1 * count) {
//            System.out.println("Hello");
//            count--;
//        }
//Дано произвольное положительное натуральное число. Найдите его последнюю цифру.
//        Scanner sc = new Scanner(System.in);
//        int a1 = sc.nextInt();
//        System.out.println(a1%10);


//        Дано трехзначное число. Найдите сумму его цифр.
//        int a2 =sc.nextInt();
//        System.out.print((a2/100)+(a2%10)+((a2%100-(a2%10))/10));


//        Длина Московской кольцевой автомобильной дороги —109 километров.
//        Байкер Вася стартует с нулевого километра МКАД и едет со скоростью v километров в час.
//        На какой отметке он остановится через t часов?
//        Программа получает на вход значения v и t. Если v>0, то Вася движется в положительном
//        направлении по МКАД, если же значение v<0, то в отрицательном.
//        Программа должна вывести целое число от 0 до 108 — номер отметки, на которой остановится Вася.
        int b1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.println(((b1 * c1 + 109) % 109) % 109);

//      Улитка ползёт по вертикальному шесту высотой h метров, поднимаясь за день на a метров,
//      а за ночь спускаясь на b метров. На какой день улитка доползёт до вершины шеста?
//      Программа получает на вход натуральные числа h, a, b. Гарантируется, что a>b.
//      Программа должна вывести одно натуральное число.
        int h = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println( ((h - a - 1) / (a - b) + 2));

//      Путешествуя, ВАЛЛ-И попал в логово к Дракону. Чтобы остаться в живых ему надо угадать число,
//      которое задумали его головы. Первая голова называет любое целое число, вторая - увеличивает его на 3,
//      а третья результат уменьшает в 2 раза. Составьте программу, которая позволит ВАЛЛ-И безошибочно
//      вычислять результат.
        double h1 = sc.nextDouble();
        h1 += 3;
        h1 = h1 / 2;
        System.out.println(h1);
//        Hello
//        Hello
//        Hello
//        Hello
//        Hello

//        System.out.println("Введите значение строки st: ");
//        String st = sc.nextLine();
//        System.out.println(st);
//
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

//        System.out.println("Enter n");
//        int n = sc.nextInt();
//        double ans = 0;
//        for (double i = 1; i <= n; i++) {
//            ans += 1.0 / i;
//        }
//        System.out.println(ans);
//
//
//        int cube = (int) Math.pow(n, 3);
//        System.out.println(cube);
//
//        int c = 0;
//        for (int i = 100; i <= 1000; i++) {
//            if (i % 5 == 0 && i % 6 == 0) {
//                System.out.print(i + " ");
//                c++;
//            }
//            if (c == 10) {
//                c = 0;
//                System.out.println();
//            }
//        }

        // factorial решить
//        for (n; n>=1; n--){
//
//        }


//        int tuition = 10000;
//        int tenYearsTuition = 0;
//        int total = 0;
//        for (int year = 1; year <= 15; year++) {
//            tuition += tuition * 0.05;
//            if (year == 10) {
//                tenYearsTuition = tuition;
//            }
//            if (year > 10) {
//                total += tuition;
//            }
//        }
//        System.out.println("Tuition per 15 years: " + total);
//        System.out.println("Tuition per 10 years: " + tenYearsTuition);
//
//
//        int highestScore = 0; 			// Holds the hightest student score
//        String highestScoreName = ""; // Holds the student name with highest score
//
//        // Prompt the user to enter the number of students
//        System.out.print("Enter the number of students: ");
//        int numberOfStudents = sc.nextInt();
//
//        // Prompt the user to enter each student's name and score
//        System.out.println("Enter each student’s name and score");
//        for (int i = 0; i < numberOfStudents; i++) {
//            System.out.print(
//                    "Student: " + (i + 1) +
//                            "\n   Name: ");
//            String name = sc.next();
//            System.out.print(
//                    "   Score: ");
//            int score = sc.nextInt();
//
//            // Test if score is higher than highest score
//            if (score > highestScore)
//            {
//                highestScore = score;
//                highestScoreName = name;
//            }
//
//        }

        // Display the name of the student with the highest score
//        System.out.println("Student with the highest score: " + highestScoreName);
//
//        int s = 2;
//        for(int i =0; i<=10; i++){
//            System.out.println(s+" * "+ i +" = " +s*i);
//        }
//
//        for (int i =1; i<6;i++){
//            System.out.println("a".repeat(i));
//        }
//
//        int num = 10;
//
//
//        for (int i = 1; i <= num; i++) {
//            for (int u = 1; u <= num; u++) {
//                if (u == num) {
//                    System.out.print("|" + i * u + "\n");
//                } else {
//                    System.out.print("|" + i * u);
//                }
//            }
//        }

//        for (int i = 1; i < 5; i++) {
//            for (int b = 1; b<=i;b++){
//                System.out.print(i);
//            }
//            System.out.println();
//        }

        //from this to length-2 is one task
//        Scanner s = new Scanner(System.in);
//        System.out.print("Please input number between 1 and 7: ");
//        int a = s.nextInt();
//        getDayName(a);
    }

//    // Get the name for the Week
//    public static String getDayName(int a) {
//        String weekday = "";
//        switch (a) {
//            case 1 -> weekday = "Monday";
//            case 2 -> weekday = "Tuesday";
//            case 3 -> weekday = "Wednesday";
//            case 4 -> weekday = "Thursday";
//            case 5 -> weekday = "Friday";
//            case 6 -> weekday = "Saturday";
//            case 7 -> weekday = "Sunday";
//            default -> System.out.println("");
//        }
//        System.out.println(weekday);
//        return weekday;
//    }

}

//Вводится целое число n (0 < n < 1000). Определите, сколько в нём цифр. Выведите ответ на экран.
//import java.util.Scanner;
//
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println(String.valueOf(n).length());
//    }
//}


//Создайте две переменные: целого типа a и действительного b, равные 5 и 0.4 соответственно.
//Выведите построчно на экран их сумму, разность, произведение и частное.

//class MyProgram{
//    public static void main(String[] args){
//        int a = 5;
//        float b = 0.4f;
//        System.out.println(a+b);
//        System.out.println(a-b);
//        System.out.println(a*b);
//        System.out.println(a/b);
//    }
//}