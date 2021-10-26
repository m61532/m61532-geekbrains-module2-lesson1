package ru.geekbrains.module2.lesson1;

public class Main {
    public static void main(String[] args) {
        Competitor[] competitors = {
                new Cat(120, 2),
                new Robot(500, 1),
                new Human(2000, 1.2)
        };
        Object[] trials = {new Treadmill(1500), new Wall(1.5)};

        for (int i = 0; i < trials.length; i++) {
            for (int j = 0; j < competitors.length; j++) {
                if (trials[i] instanceof Treadmill) {
                    competitors[j].run((Treadmill) trials[i]);
                } else {
                    competitors[j].jump((Wall) trials[i]);
                }
            }
        }
    }
}
