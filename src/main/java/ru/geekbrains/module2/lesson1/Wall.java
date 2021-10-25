package ru.geekbrains.module2.lesson1;

public class Wall {
    private double height;

    Wall(double height) {
        try {
            if (height <= 0) throw new IllegalArgumentException();
            this.height = height;
        } catch (IllegalArgumentException e) {
            System.err.println("Illegal input argument. ru.geekbrains.module2.lesson1.Wall height is set 1.2");
            this.height = 1.2;
        }
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "2";
    }
}
