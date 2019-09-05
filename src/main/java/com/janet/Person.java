package com.janet;

public class Person {
    String name;
    float weight; //PERSON類別的屬性
    float height; //PERSON類別的屬性
    public Person(float weight,float height) //weight,height 方法內的區域變數
    {
        this.weight = weight;
        this.height = height;
    }
    public Person(String name, float weight,float height) //weight,height 方法內的區域變數
    {
        this(weight, height);
        this.name = name;
    }
    public float bmi(){
        float bmi = weight / (height*height);
        return  bmi;
    }
    public void hello() {
        System.out.println("Hello world！"+name+"!");
    }
}
