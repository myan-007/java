import java.nio.channels.Pipe;

public class Point<T extends Number> {

    private T x,y;

    public Point(T x,T y) {
        this.x = x;
        this.y= y;

    }
    public void shift(T dx, T dy) {
        this.x = add(this.x,dx);
        this.y = add(this.y,dy);
    }
    public static<T extends Number> T add(T x,T y){
        if(x==null||y==null){
            return null;
        }
        if (x instanceof Double) {
            return (T) new Double(x.doubleValue() + y.doubleValue());
        } else if (x instanceof Integer) {
            return (T)new Integer(x.intValue() + y.intValue());
        } else {
            throw new IllegalArgumentException("Type " + x.getClass() + " is not supported by this method");
        }
    }
    public static void main(String[] args) {
        Point<Integer> t = new Point<>(323,23);
        Point<Float> r = new Point<>(12F,3F);
        t.shift(34,54);

    }

}
