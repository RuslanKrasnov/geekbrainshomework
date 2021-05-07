package ru.geekbrains.lesson1stage2;

public class Human implements Runnable, Jumpable {

    private String name;
    private int jumpLimit;
    private int runLimit;

    public Human(String name, int jumpLimit, int runLimit) {
        this.name = name;
        this.jumpLimit = jumpLimit;
        this.runLimit = runLimit;
    }

    @Override
    public boolean run(int lenght) {
        if (runLimit >= lenght) {
            System.out.println("Human " + name + " successfully run");
            return true;
        } else {
            System.out.println("Human " + name + " can not run this distance");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (jumpLimit >= height) {
            System.out.println("Human " + name + " successfully jump");
            return true;
        } else {
            System.out.println("Human " + name + " can not jump this height");
            return false;
        }
    }

}
