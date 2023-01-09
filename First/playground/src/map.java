import java.util.HashMap;
import java.util.Map;
import java.util.logging.LogManager;

public class map {

    public static Map<Long,Long> m = new HashMap<>();
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            factorial(i);
        }
        for (Long i:
             m.keySet()) {
            System.out.println(i);
        }
    }

    private static void factorial(long number) {

            if(m.containsKey(number-1)){
                m.put(number,m.get(number-1)*number);
//                System.out.println(m.get(number-1)*number);
            }
            else{
                long fact = 1;
                for(int i = 1; i <= number; i++) {
                    fact = fact * i;
                }
                m.put(number,fact);
                return ;
            }

    }


}
