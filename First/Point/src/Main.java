public class Main {
    public static void main(String[] args) {


        Point p1 = new Point(0,4);
        Point p2 = new Point(3,2);
        Point p3 = new Point(3,-1);
        Point p4 = new Point(-3,-1);
        Point p5 = new Point(-3,2);

        Line l1 =new Line(p1,p2);
        Line l2 = new Line(p2,p3);
        Line l3 = new Line(p3,p4);
        Line l4 = new Line(p4,p5);
        Line l5 = new Line(p5,p1);



    }
}