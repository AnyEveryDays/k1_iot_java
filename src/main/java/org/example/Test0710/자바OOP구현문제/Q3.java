package org.example.Test0710.자바OOP구현문제;

abstract class shape{
    double Area;
    abstract double getArea();

}
class Circle extends shape{
    // 원넓이 = 반지름 x 반지름 x 파이(3.14)
    private double length;

    Circle(double length){
        this.length = length;
    }
    @Override
    double getArea() {
        return ((length/2)*(length/2)) *3.14;
    }
}
class Rectangle extends shape{
    // 사각형  넓이 폭 x 높이
    private double length;
    Rectangle(double length){
        this.length = length;
    }

    @Override
    double getArea() {
        return length;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3);
        Circle circle = new Circle(4.5);
        System.out.println(circle.getArea());
        System.out.println(rectangle.getArea());
    }
}
