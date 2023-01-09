
class Line {
    Point p1;
    Point p2;
    Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    void shift(double dx, double dy) {
        this.p1.shift(dx, dy);
        this.p2.shift(dx, dy);
    }
}