package com.example.task05;

/**
 * Точка в двумерном пространстве
 */
public class Point {

    private double x;
    private double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        //throw new AssertionError();
    }

    /**
     * Возвращает координату точки по оси абсцисс
     *
     * @return координату точки по оси X
     */
    public double getX() {
        return  this.x;
    }

    /**
     * Возвращает координату точки по оси ординат
     *
     * @return координату точки по оси Y
     */
    public double getY() {
        return this.y;
    }

    /**
     * Устанавливает координату точки по оси абсцисс
     *
     * @param x координата точки по оси X
     */
    public void setX(double x) {
        this.x = x;
        //throw new AssertionError();
    }

    /**
     * Устанавливает координату точки по оси ординат
     *
     * @param y координата точки по оси Y
     */
    public void setY(double y) {
        this.y = y;
        //throw new AssertionError();
    }

    /**
     * Подсчитывает расстояние от текущей точки до точки, переданной в качестве параметра
     *
     * @param point вторая точка отрезка
     * @return расстояние от текущей точки до переданной
     */
    public double getLength(Point point) {
        double dx = this.x - point.x;
        double dy = this.y - point.y;
        return Math.sqrt(dx * dx + dy * dy);
        //throw new AssertionError();
    }

}
