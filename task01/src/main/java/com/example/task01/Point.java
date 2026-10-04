package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        //throw new UnsupportedOperationException("Конструктор не реализован");
    }

    /**
     * "Вращает" точку относительно начала координат на 180 градусов
     */
    public void flip() {
        int newX = -this.y;
        int newY = -this.x;

        this.x = newX;
        this.y = newY;
        //throw new UnsupportedOperationException("Метод flip не реализован");
    }

    /**
     * Считает расстояние от текущей точки до переданной
     *
     * @param point вторая точка
     * @return расстояние между точками
     */
    public double distance(Point point) {

        int distX = point.x - this.x;
        int distY = point.y - this.y;

        return Math.sqrt(Math.pow(distX, 2) + Math.pow(distY, 2));
        //throw new UnsupportedOperationException("Метод distance не реализован");
    }

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
        //throw new UnsupportedOperationException("Метод toString не реализован");
    }
}
