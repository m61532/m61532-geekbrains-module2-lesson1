package ru.geekbrains.module2.lesson1;

public class Wall {
    private double height;

    public Wall(double height) {
            if (height <= 0) {
                System.out.println("Illegal input argument. Wall height is set 1.2");
                this.height = 1.2;
            }
            this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "2";
    }
}
