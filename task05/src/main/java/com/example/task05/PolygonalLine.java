package com.example.task05;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    private Point[] points;

    public PolygonalLine(){
        this.points = new Point[0];
    }
    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {

        this.points = new Point[points.length];
        for (int i = 0; i < points.length; i++) {
            this.points[i] = new Point(points[i].getX(), points[i].getY());
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        Point point1 = new Point(point.getX(), point.getY());

        Point[] newPoints = new Point[this.points.length + 1];
        for (int i = 0; i < this.points.length; i++) {
            newPoints[i] = this.points[i];
        }
        newPoints[this.points.length] = point1;
        this.points = newPoints;
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        this.addPoint(new Point(x, y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double totalLength = 0.0;
        for (int i = 0; i < this.points.length - 1; i++) {
            totalLength += this.points[i].getLength(this.points[i + 1]);
        }

        return totalLength;
        //throw new AssertionError();
    }

}
