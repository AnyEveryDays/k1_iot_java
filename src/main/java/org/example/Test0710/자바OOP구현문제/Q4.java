package org.example.Test0710.자바OOP구현문제;

interface Playable {
    void play();
}

class Piano implements Playable{
    @Override
    public void play() {
        System.out.println("건반소리");
    }
}
class Guitar implements Playable{
    @Override
    public void play() {
        System.out.println("기타소리 띵띵");
    }

}

public class Q4 {
    public static void main(String[] args) {
        Guitar guitar = new Guitar();
        guitar.play();
        Piano piano = new Piano();
        piano.play();
    }
}
