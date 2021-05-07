package ru.geekbrains.lesson1stage2;

public class Wall implements Obstacle {

    private int height;

    Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcomeObstacle(Object object) {
        return ((Jumpable) object).jump(height);
    }
}
