import java.sql.Array;
import java.util.*;


public class AnonymousClass {


    public static void main(String[] args) {

        enum Month{

            JANUARY,
            FEBRUARY,
            MARCH,
            APRIL,
            MAY,
            JUNE,
            JULY,
            AUGUST,
            SEPTEMBER,
            OCTOBER,
            NOVEMBER,
            DECEMBER;


        };


        String str = "Hello";
        String str2 = switch (str) {
            case "Test" -> "O" + "k!";
            case "Hello", "World" -> str = "Error?";
            default -> {
                System.out.println("This is impossible!");
                System.out.println("Never!");
                yield "";
            }
        };
        System.out.println(str);
        System.out.println(str2);

        List<String> a  = Arrays.asList("BMW", "Audi", "Mercedes", "Seat",
                "Volkswagen", "Hyundai", "Tesla");

        Collections.sort(a, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o2.length()-o1.length()==0){
                    return o1.compareTo(o2);
                }
                else {
                    return o2.length()-o1.length();
                }
            }
        });

        System.out.println(a);



    }
}
