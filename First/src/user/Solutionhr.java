package user;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'hackerlandRadioTransmitters' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY x
     *  2. INTEGER k
     */
    static boolean isValid(List<Integer> a,int mid,int k){
        int count =0;
        int last_antina=a.get(1);
        if((a.get(1)-a.get(0))>k) count++; last_antina=a.get(0);
        for(int i=2;i<a.size();i++ ){
            if((a.get(i)-last_antina)>k) 
            {
                count++; last_antina=a.get(i);
            }
            if(count==mid) return true;
        }
        return false;
    } 

    public static int hackerlandRadioTransmitters(List<Integer> x, int k) {
//    Integer[] b = new Integer[x.size()];  
//    Integer[] a =  x.toArray(b);
//    Arrays.sort(a);
    	List<Integer> a = x.stream().sorted().collect(Collectors.toList());   
    int start=1;
    int result =0;
    int end=(a.get(a.size()-1)/2);
    while(start<=end){
        int mid=start + (end-start)/2;
        if(isValid(a,mid,k)){
            start=mid+1;
            result=mid;
        }
        else{
            end=mid-1;
        }
       
    }
    return result;


    }

}

public class Solutionhr {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> x = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.hackerlandRadioTransmitters(x, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
