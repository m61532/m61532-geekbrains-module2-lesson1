package ru.geekbrains.module2.lesson1;

public class Robot {
    private double limitRunDistance;
    private double limitJumpHeight;

    Robot(double limitRunDistance, double limitJumpHeight) {
        try {
            if (limitRunDistance <= 0 || limitJumpHeight <= 0) throw new IllegalArgumentException();
            this.limitRunDistance = limitRunDistance;
            this.limitJumpHeight = limitJumpHeight;
        } catch (IllegalArgumentException e) {
            System.err.println("Illegal input arguments. By default run limit is set 500 and jump limit – 1");
            this.limitRunDistance = 500;
            this.limitJumpHeight = 1;
        }
    }

    public void run(Treadmill treadmill) {
        try {
            if (treadmill.getRunDistance() < 0) {
                throw new IllegalArgumentException();
            } else if (treadmill.getRunDistance() <= limitRunDistance) {
                System.out.println("На беговой дорожке робот пробежал расстояние " + treadmill.getRunDistance() + "м");
            } else {
                System.out.println("На беговой дорожке робот не смог пробежать расстояние " + treadmill.getRunDistance() + "м");
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
                System.out.println("Робот смог перепрыгнуть стену высотой " + wall.getHeight() + "м");
            } else {
                System.out.println("Робот не смог перепрыгнуть стену высотой " + wall.getHeight() + "м");
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Illegal input argument");
        }
    }

    @Override
    public String toString() {
        return "2";
    }
}
