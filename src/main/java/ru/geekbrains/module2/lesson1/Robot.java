package ru.geekbrains.module2.lesson1;

public class Robot implements Competitor{
    private double limitRunDistance;
    private double limitJumpHeight;

    Robot(double limitRunDistance, double limitJumpHeight) {
        if (limitRunDistance <= 0 || limitJumpHeight <= 0) {
            System.out.println("Illegal input arguments. By default run limit is set 500 and jump limit – 1");
            this.limitRunDistance = 500;
            this.limitJumpHeight = 1;
        }
        this.limitRunDistance = limitRunDistance;
        this.limitJumpHeight = limitJumpHeight;

    }

    @Override
    public void run(Treadmill treadmill) {
        if (treadmill.getRunDistance() < 0) {
            System.out.println("Illegal input argument");
        } else if (treadmill.getRunDistance() <= limitRunDistance) {
            System.out.println("На беговой дорожке робот пробежал расстояние " + treadmill.getRunDistance() + "м");
        } else {
            System.out.println("На беговой дорожке робот не смог пробежать расстояние " + treadmill.getRunDistance() + "м");
        }

    }
    @Override
    public void jump(Wall wall) {
            if (wall.getHeight() <= 0) {
                System.out.println("Illegal input argument");
            } else if (wall.getHeight() <= limitJumpHeight) {
                System.out.println("Робот смог перепрыгнуть стену высотой " + wall.getHeight() + "м");
            } else {
                System.out.println("Робот не смог перепрыгнуть стену высотой " + wall.getHeight() + "м");
            }
    }

    @Override
    public String toString() {
        return "2";
    }
}
