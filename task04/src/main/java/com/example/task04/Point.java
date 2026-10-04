package com.example.task04;

/**
 * Класс точки на плоскости
 */
public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        //throw new UnsupportedOperationException("Конструктор не реализован");
    }

    public int getX() { return x; }
    public int getY() { return y; }
    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
        //throw new UnsupportedOperationException("Метод toString не реализован");
    }
}

