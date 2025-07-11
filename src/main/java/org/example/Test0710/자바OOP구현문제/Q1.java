package org.example.Test0710.자바OOP구현문제;

import java.util.ArrayList;

class Animal {
    String name;
    void makesound(){
        System.out.println("동물이 울음 소리를 냅니다");
    }
}

class Dog extends Animal{
    @Override
    void makesound() {
        System.out.println("멍멍");
    }
}
class Cat extends Animal{
    @Override
    void makesound() {
        System.out.println("야옹");
    }
}


public class Q1 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);

        for(Animal animal: animals){
            animal.makesound();
        }

    }
}
