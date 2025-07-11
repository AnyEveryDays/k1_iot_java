package org.example.Test0710.자바OOP구현문제;

class Person{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age > 0){
            this.age = age;
        } else{
            System.out.println("나이는 0보다 작을 수 없습니다");
        }
    }
}


public class Q2 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("손태경");
        person.setAge(-1);
        person.setAge(28);
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
