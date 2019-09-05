package com.janet;

public class Hello {
    public static void main(String[] args) {
       // System.out.println("Hello world!");
       // new Person().hello();
        String s = "abcde";
        System.out.println(s.charAt(3));
        System.out.println(s.substring(1,4));
        Person p = new Person( "janet",66.5f,17.2f);
        p.hello();
        p.weight = 66.5f;
        p.height = 17.2f;
        p.bmi();
        System.out.println(p.bmi());
        int score = 88;
        System.out.println(score < 80 || score > 90);
        char c = 'A';
        System.out.println(c < 'a');
       /* int age = 19;
        Integer age2 = 19;
        char c = 'm';
        byte b = 120;
        float weight = 55.5f;
        double height = 17.2; */
      }

}
