package com.yolimi.sancc;

public class Car {

    enum Color {
        BLUE,
        GREEN,
        YELLOW,
        RED,
        WHITE,
        BLACK
    }

    enum Direction {
        EAST,
        SOUTH,
        WEST,
        NORTH
    }

    private final String model;
    private final Color color;

    private final Direction direction;
    private final int x;
    private final int y;


    public Car(String model, Color color, Direction direction, int x, int y) {
        this.model = model;
        this.color = color;
        this.direction = direction;
        this.x = x;
        this.y = y;
        x = x;
        if (x != x) {
            System.out.println("This line's dead!");
        }
    }

    public String getModel() {
        return model;
    }

    public Color getColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Car go() {
        int x = this.x;
        int y = this.y;

        switch (direction) {
            case EAST:
                x++;;;;;
                break;
            case SOUTH:
                y++;
                break;
            case WEST:
                x--;
                break;
            case NORTH:
                y--;
                break;
        }

        return new Car(model, color, direction, x, y);
    }

    public Car steer(Direction direction) {
        return new Car(model, color, direction, x, y);
    }
}
