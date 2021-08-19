package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int choice;
        int gradesNumber = 0;

        Subjects subject1 = new Subjects("Math");


        System.out.println("Enter your name: ");
        name = scanner.nextLine();
        System.out.println("Select option, " + name);
        System.out.println("0 - exit, 1- add grades, 2-print avg");
        choice = scanner.nextInt();
        while (choice != 0) {

            switch (choice) {
                case 1:

                    System.out.println("How many grades you want to enter?");
                    gradesNumber = scanner.nextInt();
                    int[] newGrades = new int[gradesNumber];
                    for (int i = 0; i < gradesNumber; i++) {
                        System.out.println("Enter grade number " + (i + 1));
                        newGrades[i] = scanner.nextInt();
                    }
                    subject1.addGrades(newGrades);


                    System.out.println("Select option, " + name);
                    System.out.println("0 - exit, 1- add grades, 2-print avg");
                    choice = scanner.nextInt();
                    break;
                case 2:
                    subject1.getAverageGrade();

                    
                    System.out.println("Select option, " + name);
                    System.out.println("0 - exit, 1- add grades, 2-print avg");
                    choice = scanner.nextInt();
                    break;
                default:
                    break;
            }
        }

    }
}
