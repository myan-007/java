import java.util.ArrayList;
import java.lang.String;

public class Main {
    public static void main(String[] args) {

         List l1 = new List(1);
        l1.insert(3);
        l1.next.insert(5);
        l1.next.next.insert(7);
        List l2 = new List(2);
        l2.insert(4);
        l2.next.insert(6);
        l2.next.next.insert(8);
        System.out.println(l1);
        System.out.println(l2);
    }
}