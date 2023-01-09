class Point {
    double x, y;


    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void shift(double dx, double dy) {
        this.x = this.x + dx;
        this.y = this.y + dy;
    }

    void rotate(double angle) {
        double phi = Math.toRadians(angle);
        double xOld = this.x;
        double yOld = this.y;
        this.x = xOld * Math.cos(phi) - yOld * Math.sin(phi);
        this.y = xOld * Math.sin(phi) + yOld * Math.cos(phi);
    }

    void rotate(Point center, double angle) {
        double xOfCenter = center.x;
        double yOfCenter = center.y;
        this.shift(-xOfCenter, -yOfCenter);
        this.rotate(angle);
        this.shift(xOfCenter, yOfCenter);
    }
}