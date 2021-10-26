package ru.geekbrains.module2.lesson1;

public class Cat implements Competitor{

    private double limitJumpHeight;
    private double limitRunDistance;

    Cat(double limitRunDistance, double limitJumpHeight){
        if (limitRunDistance <= 0 || limitJumpHeight <= 0) {
            System.out.println("Illegal input arguments. By default run limit is set 100 and jump limit – 2");
            this.limitRunDistance = 100;
            this.limitJumpHeight = 2;
        }
        this.limitRunDistance = limitRunDistance;
        this.limitJumpHeight = limitJumpHeight;
    }

    @Override
    public void run(Treadmill treadmill) {
        if (treadmill.getRunDistance() < 0) {
            System.out.println("Illegal input argument");
        } else if (treadmill.getRunDistance() <= limitRunDistance) {
            System.out.println("На беговой дорожке кошка пробежала расстояние " + treadmill.getRunDistance() + "м");
        } else {
            System.out.println("На беговой дорожке кошка не смогла пробежать расстояние " + treadmill.getRunDistance() + "м");
        }
    }

    @Override
    public void jump(Wall wall) {
        if (wall.getHeight() <= 0) {
            System.out.println("Illegal input argument");
        } else if (wall.getHeight() <= limitJumpHeight) {
            System.out.println("Кошка смогла перепрыгнуть стену высотой " + wall.getHeight() + "м");
        } else {
            System.out.println("Кошка не смогла перепрыгнуть стену высотой " + wall.getHeight() + "м");
        }
    }

    @Override
    public String toString() {
        return "1";
    }
}
