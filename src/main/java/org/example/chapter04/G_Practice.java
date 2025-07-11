package org.example.chapter04;

import org.w3c.dom.ls.LSOutput;

class Person {
    String name;
    int age;
    static int population;

    Person() {
        population++;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
        population++;
    }


    void introduce() {
        System.out.println("저는 ["+ name +"]이고, ["+age+"] 살입니다." );
    }
}


public class G_Practice {
    public static void main(String[] args) {
        Person man = new Person("손태경",28);
        man.name = "손태";
        man.age = 28;

        man.introduce();
        Person man2 = new Person("홍길동", 25);
        man2.introduce();

        System.out.println(Person.population);

        new Person();
        new Person();
        new Person();
        new Person();
        new Person();
        System.out.println(Person.population);
    }
}
