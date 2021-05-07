package ru.geekbrains.lesson1stage2;

public class Track implements Obstacle{

    private int lenght;

    Track(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public boolean overcomeObstacle(Object object) {
        return ((Runnable) object).run(lenght);
    }
}
