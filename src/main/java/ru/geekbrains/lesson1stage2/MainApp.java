package ru.geekbrains.lesson1stage2;

public class MainApp {
    public static void main(String[] args) {

        Runnable[] competitors = {
                new Cat("Kitty", 10, 5),
                new Robot("Chappie", 5, 10),
                new Human("Arnold", 10, 5)
        };

        Obstacle[] obstacles = {
                new Wall(10),
                new Track(10)
        };

        for (int i = 0; i < competitors.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                if (obstacles[j].overcomeObstacle(competitors[i])) {
                } else {
                    break;
                };
            }
        }

    }
}
