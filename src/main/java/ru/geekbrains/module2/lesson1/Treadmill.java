package ru.geekbrains.module2.lesson1;

public class Treadmill {
    private double runDistance;

    Treadmill(double runDistance) {
            if (runDistance <= 0) {
                this.runDistance = 100;
                System.out.println("run distance is set 100");
            }
            this.runDistance = runDistance;
    }

    public double getRunDistance() {
        return runDistance;
    }

    @Override
    public String toString() {
        return "1";
    }
}
