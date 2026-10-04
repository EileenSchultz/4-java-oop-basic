package com.example.task04;

public class Line {

    private Point p1;
    private Point p2;


    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return this.p1;
    }

    public Point getP2() {
        return this.p2;
    }

    public String toString() {
        return p1 + " - " + p2;
    }

    public boolean isCollinearLine(Point p) {
        int dx1 = this.p2.getX() - this.p1.getX();
        int dy1 = this.p2.getY() - this.p1.getY();
        int dx2 = p.getX() - this.p1.getX();
        int dy2 = p.getY() - this.p1.getY();

        return (dx1 * dy2 - dy1 * dx2) == 0;

    }


}
