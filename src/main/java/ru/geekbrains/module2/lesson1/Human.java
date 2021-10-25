package ru.geekbrains.module2.lesson1;

public class Human {
    private double limitRunDistance;
    private double limitJumpHeight;

    Human(double limitRunDistance, double limitJumpHeight) {
        try {
            if (limitRunDistance <= 0 || limitJumpHeight <= 0) throw new IllegalArgumentException();
            this.limitRunDistance = limitRunDistance;
            this.limitJumpHeight = limitJumpHeight;
        } catch (IllegalArgumentException e) {
            System.err.println("Illegal input arguments. By default run limit is set 2000 and jump limit – 1.5");
            this.limitRunDistance = 2000;
            this.limitJumpHeight = 1.5;
        }
    }

    public void run(Treadmill treadmill) {
        try {
            if (treadmill.getRunDistance() < 0) {
                throw new IllegalArgumentException();
            } else if (treadmill.getRunDistance() <= limitRunDistance) {
                System.out.println("На беговой дорожке человек пробежал расстояние " + treadmill.getRunDistance() + "м");
            } else {
                System.out.println("На беговой дорожке человек не смог пробежать расстояние " + treadmill.getRunDistance() + "м");
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Illegal input argument");
        }
    }

    public void jump(Wall wall) {
        try {
            if (wall.getHeight() <= 0) {
                throw new IllegalArgumentException();
            } else if (wall.getHeight() <= limitJumpHeight) {
                System.out.println("Человек смог перепрыгнуть стену высотой " + wall.getHeight() + "м");
            } else {
                System.out.println("Человек не смог перепрыгнуть стену высотой " + wall.getHeight() + "м");
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Illegal input argument");
        }
    }

    @Override
    public String toString() {
        return "3";
    }
}
