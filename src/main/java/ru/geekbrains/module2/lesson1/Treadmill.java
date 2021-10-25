package ru.geekbrains.module2.lesson1;

public class Treadmill {
    private double runDistance;

    Treadmill(double runDistance) {
        try {
            if (runDistance <= 0) throw new IllegalArgumentException();
            this.runDistance = runDistance;
        } catch (IllegalArgumentException e) {
            System.err.println("Illegal input argument. Run distance is set 100");
            this.runDistance = 100;
        }
    }

    public double getRunDistance() {
        return runDistance;
    }

    @Override
    public String toString() {
        return "1";
    }
}
