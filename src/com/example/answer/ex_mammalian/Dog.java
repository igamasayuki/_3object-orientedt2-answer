package com.example.answer.ex_mammalian;

public class Dog extends Mammalian {

    public Dog() {
        System.out.println("犬が生まれました！");
    }

    @Override
    public void eat() {
        System.out.println("肉を食べます");
    }
}