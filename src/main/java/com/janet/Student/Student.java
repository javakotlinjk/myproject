package com.janet.Student;

public class Student {
    String id;
    String name;  /*初執 null*/
    int english; /*初執 0*/
    int math;

    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }
    public int highest() {
       /* int max = (english > math) ?english : math;
        if (english > math) {
            max = english;
        } else {
            max = math;
        }*/
        return (english > math) ? english : math ;
    }
    public void print() {
        System.out.println(name + "\t" + english + "\t" + math +
                "\t" + getAvg() + "\t"+
                        ((getAvg() > 60)?"Pass":"Fail" )
                );
        char grade = 'F';
        switch (getAvg()/10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
                break;
        }
        System.out.println("\t"+grade);

      /*  if (getAvg() >= 60) {
            System.out.println("\tpass");
        } else {
            System.out.println("\tfail");
        }*/
    }

    public int getAvg() {
        return (english + math) / 2;
    }

/* public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }
    public Student() {
        super();
    }*/

}
