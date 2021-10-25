package ru.geekbrains.module2.lesson1;

public class Cat {

    private double limitJumpHeight;
    private double limitRunDistance;

    Cat(double limitRunDistance, double limitJumpHeight) {
        try {
            if (limitRunDistance <= 0 || limitJumpHeight <= 0) throw new IllegalArgumentException();
            this.limitRunDistance = limitRunDistance;
            this.limitJumpHeight = limitJumpHeight;
        } catch (IllegalArgumentException e) {
            System.err.println("Illegal input arguments. By default run limit is set 100 and jump limit – 2");
            this.limitRunDistance = 100;
            this.limitJumpHeight = 2;
        }
    }

    public void run(Treadmill treadmill) {
        try {
            if (treadmill.getRunDistance() < 0) {
                throw new IllegalArgumentException();
            } else if (treadmill.getRunDistance() <= limitRunDistance) {
                System.out.println("На беговой дорожке кошка пробежала расстояние " + treadmill.getRunDistance() + "м");
            } else {
                System.out.println("На беговой дорожке кошка не смогла пробежать расстояние " + treadmill.getRunDistance() + "м");
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
                System.out.println("Кошка смогла перепрыгнуть стену высотой " + wall.getHeight() + "м");
            } else {
                System.out.println("Кошка не смогла перепрыгнуть стену высотой " + wall.getHeight() + "м");
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Illegal input argument");
        }
    }

    @Override
    public String toString() {
        return "1";
    }
}
