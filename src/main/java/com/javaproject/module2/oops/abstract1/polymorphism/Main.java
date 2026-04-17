package com.javaproject.module2.oops.abstract1.polymorphism;

public class Main {
    public static void main(String[] args) {
        Trainer trainer = new Trainer();
        Animal dog = new Dog();
        Animal fish = new Fish();
        Animal bird = new Bird();
        Dog1 dog1 = new Dog1();

        trainer.teach1(dog1);

        trainer.teach(dog);
        trainer.teach(fish);
        trainer.teach(bird);
    }
}
