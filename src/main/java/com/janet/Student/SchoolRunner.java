package com.janet.Student;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {

        //userInput();
        Student stu = new Student("Janet",50,66);
        stu.print();
        System.out.println("Highest score: "+ stu.highest());
    }

    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter students name:");
        String name = scanner.next();
        System.out.print("please enter students english:");
        int english = scanner.nextInt();
        System.out.print("please enter students math:");
        int math = scanner.nextInt();
        Student stu = new Student(name,english,math);
        stu.print();
        System.out.println("Highest score: "+ stu.highest());
    }
}
